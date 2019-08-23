package com.aplicativo.lenovouser.meuaplicativo.Usuário;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.Models.UsuarioModel;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.aplicativo.lenovouser.meuaplicativo.Repository.UsuarioRepository;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^" +
            "(?=.*[a-zA-Z])" +
            "(?=.*[@#$%^&+=])" +
            "(?=\\S+$)" +
            ".{4,}" +
            "$");

    private EditText edEmail;
    private EditText edPassword;
    private Button btnLogin;
    private TextView txtUsuario;

    private String HOST = "http://tccmarcio.000webhostapp.com";

    UsuarioRepository usuarioRepository = new UsuarioRepository(this);
    UsuarioModel usuarioModel = new UsuarioModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private boolean validaEmail(){
        edEmail = (EditText) findViewById(R.id.editText_Email);
        String emailInput = edEmail.getText().toString().trim();
        if (emailInput.isEmpty()){
            edEmail.requestFocus();
            edEmail.setError("Campo não pode ser vazio");
            return false;
        }else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            edEmail.requestFocus();
            edEmail.setError("Digite um email válido");
            return false;
        }else{
            edEmail.setError(null);
            return true;
        }
    }

    private boolean validaSenha(){
        edPassword = (EditText) findViewById(R.id.editText_Password);
        String passwordInput = edPassword.getText().toString().trim();
        if (passwordInput.isEmpty()){
            edPassword.requestFocus();
            edPassword.setError("Campo deve ser preenchido");
            return false;
        }else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()){
            edPassword.requestFocus();
            edPassword.setError("Senha inválida. Senha deve ser composta por números, letras maiúsculas e minúsculas e caracteres especias");
            return false;
        }else {
            edPassword.setError(null);
            return true;
        }
    }

    public void efetuarLogin(View view){

        edEmail = (EditText) findViewById(R.id.editText_Email);
        edPassword = (EditText) findViewById(R.id.editText_Password);
        String email = edEmail.getText().toString();
        String senha = edPassword.getText().toString();
        final String emailusuario = email;

        boolean resultadoEmail = validaEmail();
        boolean resultadoSenha = validaSenha();

        if (resultadoEmail && resultadoSenha) {

            String URL = HOST + "/login.php";

            Ion.with(LoginActivity.this).load(URL).setBodyParameter("email_app", email).setBodyParameter("senha_app", senha).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {

                    try {
                        String RETORNO = result.get("LOGIN").getAsString();
                        if (RETORNO.equals("SUCESSO")){
                            Toast.makeText(LoginActivity.this, "Login efetuado com sucesso!", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            intent.putExtra("emailusuario", emailusuario);
                            startActivity(intent);
                        } else {
                            Toast.makeText(LoginActivity.this, "Erro ao efetuar login!", Toast.LENGTH_LONG).show();
                        }
                    } catch (Exception ex){
                        Toast.makeText(LoginActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });

        }

    }

    public void exibirCadastro(View view){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void recuperarSenha(View view){
        Intent intent = new Intent(this, recuperarSenhaActivity.class);
        startActivity(intent);
    }


}
