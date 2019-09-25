package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Dados.Questao3ManipulacaoActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao3RelacionaisLogicasActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao2;
    String emailusuario;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_relacionais_logicas);
        radioButton = (RadioButton) findViewById(R.id.radioButton134);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao2 = bundle.getInt("pontoquestao2");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3RelacionaisLogicasActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3RelacionaisLogicasActivity.this, Questao2RelacionaisLogicasActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao2 + 1;
            if (ponto < 5){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3RelacionaisLogicasActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3RelacionaisLogicasActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoesexpressoes", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3RelacionaisLogicasActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3RelacionaisLogicasActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoesexpressoes", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_expressoes.php";
            Ion.with(Questao3RelacionaisLogicasActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_expressoes", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3RelacionaisLogicasActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao2 + 0;
            if (ponto < 5){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3RelacionaisLogicasActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3RelacionaisLogicasActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoesexpressoes", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3RelacionaisLogicasActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3RelacionaisLogicasActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoesexpressoes", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();            }
            String URL = HOST + "/cadastro_pontos_expressoes.php";
            Ion.with(Questao3RelacionaisLogicasActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_expressoes", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3RelacionaisLogicasActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
