package com.aplicativo.lenovouser.meuaplicativo.Introducao;

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

public class Questao1PseudocodigoActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    private String emailusuario;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";
    int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_pseudocodigo);
        radioButton = (RadioButton) findViewById(R.id.radioButton22);
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1PseudocodigoActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1PseudocodigoActivity.this, ExemploPseudocodigoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()){
            String URL = HOST + "/buscar_pontos_fluxograma.php";
            Ion.with(Questao1PseudocodigoActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    String RETORNO = result.get("BUSCA").getAsString();
                    pontos = Integer.parseInt(RETORNO);
                    ponto = pontos + 1;
                    Intent intent = new Intent(Questao1PseudocodigoActivity.this, Questao2PseudocodigoActivity.class);
                    intent.putExtra("pontoquestao1", ponto);
                    intent.putExtra("emailusuario", emailusuario);
                    startActivity(intent);
                }
            });
        }else {
            String URL = HOST + "/buscar_pontos_fluxograma.php";
            Ion.with(Questao1PseudocodigoActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    String RETORNO = result.get("BUSCA").getAsString();
                    pontos = Integer.parseInt(RETORNO);
                    ponto = pontos + 0;
                    Intent intent = new Intent(Questao1PseudocodigoActivity.this, Questao2PseudocodigoActivity.class);
                    intent.putExtra("pontoquestao1", ponto);
                    intent.putExtra("emailusuario", emailusuario);
                    startActivity(intent);
                }
            });
        }
    }

}
