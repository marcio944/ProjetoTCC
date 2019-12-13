package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao5ConstantesVariaveisActivity extends AppCompatActivity {

    RadioButton radioButton;
    int pontoquestao4;
    int ponto;
    String emailusuario;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5_constantes_variaveis);
        radioButton = (RadioButton) findViewById(R.id.radioButton72);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao4 = bundle.getInt("pontoquestao4");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao5ConstantesVariaveisActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao5ConstantesVariaveisActivity.this, Questao4ConstantesVariaveisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao4 + 1;
            Intent intent = new Intent(Questao5ConstantesVariaveisActivity.this, DadosActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            String URL = HOST + "/cadastro_pontos_constantesvariaveis.php";
            Ion.with(Questao5ConstantesVariaveisActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_constantesvariaveis", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao5ConstantesVariaveisActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao4 + 0;
            Intent intent = new Intent(Questao5ConstantesVariaveisActivity.this, DadosActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            String URL = HOST + "/cadastro_pontos_constantesvariaveis.php";
            Ion.with(Questao5ConstantesVariaveisActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_constantesvariaveis", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao5ConstantesVariaveisActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
