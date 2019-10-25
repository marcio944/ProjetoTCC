package com.aplicativo.lenovouser.meuaplicativo.Homogêneas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Condicao.Questao4CondicaoCompostaActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao3BidimensionaisActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao2;
    int ponto;
    int pontosintroducao;
    int pontuacaototal = 0;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_bidimensionais);
        radioButton = (RadioButton) findViewById(R.id.radioButton160);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestao2 = bundle.getInt("pontoquestao2");
        }
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3BidimensionaisActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3BidimensionaisActivity.this, Questao2BidimensionaisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao2 + 1;
            AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3BidimensionaisActivity.this);
            alerta.setTitle("Pontuação Total");
            alerta.setMessage("Pontuação = " + ponto + ". Parabéns! Você conseguiu concluir todos os tópicos.");
            alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Questao3BidimensionaisActivity.this, MainActivity.class);
                    intent.putExtra("emailusuario", emailusuario);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = alerta.create();
            alertDialog.show();
            String URL = HOST + "/cadastro_pontos_homogeneas.php";
            Ion.with(Questao3BidimensionaisActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_homogeneas", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3BidimensionaisActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
            String URL1 = HOST + "/pontuacao_total.php";
            Ion.with(Questao3BidimensionaisActivity.this).load(URL1).setBodyParameter("email_app", emailusuario).setBodyParameter("pontuacao_total", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3BidimensionaisActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else {
            ponto = pontoquestao2 + 0;
            AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3BidimensionaisActivity.this);
            alerta.setTitle("Pontuação Total");
            alerta.setMessage("Pontuação = " + ponto + ". Parabéns! Você conseguiu concluir todos os tópicos.");
            alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Questao3BidimensionaisActivity.this, MainActivity.class);
                    intent.putExtra("emailusuario", emailusuario);
                    startActivity(intent);
                }
            });
            AlertDialog alertDialog = alerta.create();
            alertDialog.show();
            String URL = HOST + "/cadastro_pontos_homogeneas.php";
            Ion.with(Questao3BidimensionaisActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_homogeneas", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3BidimensionaisActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
            String URL1 = HOST + "/pontuacao_total.php";
            Ion.with(Questao3BidimensionaisActivity.this).load(URL1).setBodyParameter("email_app", emailusuario).setBodyParameter("pontuacao_total", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3BidimensionaisActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }

    }

}
