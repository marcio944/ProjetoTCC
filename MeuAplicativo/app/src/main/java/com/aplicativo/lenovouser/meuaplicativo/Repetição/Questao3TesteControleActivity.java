package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Condicao.Questao4CondicaoCompostaActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao3TesteControleActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao2;
    int ponto;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_teste_controle);
        radioButton = (RadioButton) findViewById(R.id.radioButton106);
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
        Intent intent = new Intent(Questao3TesteControleActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3TesteControleActivity.this, Questao1TesteInicioActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao2 + 1;
            if (ponto < 9){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3TesteControleActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3TesteControleActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontoquestoesrepeticao", ponto);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3TesteControleActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3TesteControleActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoesrepeticao", ponto);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_repeticao.php";
            Ion.with(Questao3TesteControleActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_repeticao", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3TesteControleActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao2 + 0;
            if (ponto < 9){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3TesteControleActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3TesteControleActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontoquestoesrepeticao", ponto);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3TesteControleActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3TesteControleActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoesrepeticao", ponto);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_repeticao.php";
            Ion.with(Questao3TesteControleActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_repeticao", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3TesteControleActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
