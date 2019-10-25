package com.aplicativo.lenovouser.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class PontuacaoTotalActivity extends AppCompatActivity {

    TextView textView;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";
    String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontuacao_total);

        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }

        String URL = HOST + "/buscar_pontuacaototal.php";
        Ion.with(PontuacaoTotalActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                try {
                    String RETORNO = result.get("BUSCA").getAsString();
                    int pontos = Integer.parseInt(RETORNO);
                    textView = (TextView) findViewById(R.id.textView139);
                    textView.setText("Sua pontuação total é " + pontos + " pontos.");
                } catch (Exception ex){

                }

            }
        });

    }
}
