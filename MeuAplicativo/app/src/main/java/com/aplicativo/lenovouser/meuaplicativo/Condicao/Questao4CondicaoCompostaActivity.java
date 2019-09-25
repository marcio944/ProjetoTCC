package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Expressões.Questao3RelacionaisLogicasActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao4CondicaoCompostaActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao3;
    int ponto;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_condicao_composta);
        radioButton = (RadioButton) findViewById(R.id.radioButton151);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            pontoquestao3 = bundle.getInt("pontoquestao3");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, Questao3CondicaoCompostaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao3 + 1;
            if (ponto < 5){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4CondicaoCompostaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoescondicao", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4CondicaoCompostaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoescondicao", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_condicao.php";
            Ion.with(Questao4CondicaoCompostaActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_condicao", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4CondicaoCompostaActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao3 + 0;
            if (ponto < 5){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4CondicaoCompostaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoescondicao", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4CondicaoCompostaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontosquestoescondicao", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();            }
            String URL = HOST + "/cadastro_pontos_condicao.php";
            Ion.with(Questao4CondicaoCompostaActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_condicao", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4CondicaoCompostaActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
