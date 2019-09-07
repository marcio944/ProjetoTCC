package com.aplicativo.lenovouser.meuaplicativo.Usuário;

import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Models.UsuarioModel;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.aplicativo.lenovouser.meuaplicativo.Repository.UsuarioRepository;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public class CadastroActivity extends AppCompatActivity {

    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^" +
            "(?=.*[a-zA-Z])" +
            "(?=.*[@#$%^&+=])" +
            "(?=\\S+$)" +
            ".{4,}" +
            "$");

    private EditText edEmail;
    private EditText edSenha;
    private EditText edRepetirSenha;

    private String HOST = "http://tccmarcio.000webhostapp.com";

    UsuarioModel usuario = new UsuarioModel();
    UsuarioRepository usuarioRepository = new UsuarioRepository(this);
    UsuarioModel usuarioModel = new UsuarioModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
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
        edSenha = (EditText) findViewById(R.id.editText_Password);
        String passwordInput = edSenha.getText().toString().trim();
        if (passwordInput.isEmpty()){
            edSenha.requestFocus();
            edSenha.setError("Campo deve ser preenchido");
            return false;
        }else if (passwordInput.length() < 8){
            edSenha.requestFocus();
            edSenha.setError("Senha inválida. Senha deve conter no mínimo 8 caracteres");
            return false;
        }else {
            edSenha.setError(null);
            return true;
        }
    }

    private boolean validaRepetirSenha(){
        edRepetirSenha = (EditText) findViewById(R.id.editText_Repetir);
        edSenha = (EditText) findViewById(R.id.editText_Password);
        if (edRepetirSenha.getText().toString().isEmpty()){
            edRepetirSenha.requestFocus();
            edRepetirSenha.setError("Campo deve ser preenchido");
            return false;
        }else if (edRepetirSenha.getText().toString().equals(edSenha.getText().toString())){
            return true;
        }else{
            edRepetirSenha.requestFocus();
            edRepetirSenha.setError("Senhas não correspondem");
            return false;
        }
    }

    public void cadastrar(View view){

        edEmail = (EditText) findViewById(R.id.editText_Email);
        edSenha = (EditText) findViewById(R.id.editText_Password);
        String email = edEmail.getText().toString();
        String senha = edSenha.getText().toString();

        boolean resultadoEmail = validaEmail();
        boolean resultadoSenha = validaSenha();
        boolean resultadoRepetir = validaRepetirSenha();

        if (resultadoEmail && resultadoSenha && resultadoRepetir) {

            String URL = HOST + "/cadastro.php";

            Ion.with(CadastroActivity.this).load(URL).setBodyParameter("email_app", email).setBodyParameter("senha_app", senha).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {

                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                        Toast.makeText(CadastroActivity.this, "" + RETORNO, Toast.LENGTH_LONG).show();
                    } catch (Exception ex){
                        Toast.makeText(CadastroActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });

        }

    }

}