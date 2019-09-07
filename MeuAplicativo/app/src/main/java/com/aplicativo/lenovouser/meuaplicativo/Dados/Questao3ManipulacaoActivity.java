package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Introducao.Questao5PseudocodigoActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao3ManipulacaoActivity extends AppCompatActivity {

    RadioButton radioButton;
    int pontoquestao2;
    int ponto;
    String emailusuario;
    private String HOST = "http://tccmarcio.000webhostapp.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_manipulacao);
        radioButton = (RadioButton) findViewById(R.id.radioButton119);
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
        Intent intent = new Intent(Questao3ManipulacaoActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3ManipulacaoActivity.this, Questao2ManipulacaoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao2 + 1;
            if (ponto < 11){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3ManipulacaoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3ManipulacaoActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3ManipulacaoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3ManipulacaoActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_dados.php";
            Ion.with(Questao3ManipulacaoActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_dados", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3ManipulacaoActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao2 + 0;
            if (ponto < 11){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3ManipulacaoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3ManipulacaoActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao3ManipulacaoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao3ManipulacaoActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_dados.php";
            Ion.with(Questao3ManipulacaoActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_dados", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3ManipulacaoActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
