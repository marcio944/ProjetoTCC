package com.aplicativo.lenovouser.meuaplicativo.Repetição;

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

public class Questao1RepeticaoControleActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int ponto;
    int pontos;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_repeticao_controle);
        radioButton = (RadioButton) findViewById(R.id.radioButton96);
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1RepeticaoControleActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1RepeticaoControleActivity.this, ExemploRepeticaoControleActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            String URL = HOST + "/buscar_pontos_testefim.php";
            Ion.with(Questao1RepeticaoControleActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    String RETORNO = result.get("BUSCA").getAsString();
                    pontos = Integer.parseInt(RETORNO);
                    ponto = pontos + 1;
                    Intent intent = new Intent(Questao1RepeticaoControleActivity.this, Questao2RepeticaoControleActivity.class);
                    intent.putExtra("emailusuario", emailusuario);
                    intent.putExtra("pontoquestao1", ponto);
                    startActivity(intent);
                    finish();
                }
            });
        }else{
            String URL = HOST + "/buscar_pontos_testefim.php";
            Ion.with(Questao1RepeticaoControleActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    String RETORNO = result.get("BUSCA").getAsString();
                    pontos = Integer.parseInt(RETORNO);
                    ponto = pontos + 0;
                    Intent intent = new Intent(Questao1RepeticaoControleActivity.this, Questao2RepeticaoControleActivity.class);
                    intent.putExtra("emailusuario", emailusuario);
                    intent.putExtra("pontoquestao1", ponto);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }

}
