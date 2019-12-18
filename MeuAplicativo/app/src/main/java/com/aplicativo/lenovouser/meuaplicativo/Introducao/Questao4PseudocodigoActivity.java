package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao4PseudocodigoActivity extends AppCompatActivity {

    EditText editText, editText1, editText2, editText3;
    int ponto;
    int pontoquestao3;
    private String emailusuario;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_pseudocodigo);
        editText = (EditText) findViewById(R.id.editText2);
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText16);
        editText3 = (EditText) findViewById(R.id.editText17);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao3 = bundle.getInt("pontoquestao3");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4PseudocodigoActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if (editText.getText().toString().equals("algoritmo") && editText1.getText().toString().equals("var") && editText2.getText().toString().equals("inicio") && editText3.getText().toString().equals("fimalgoritmo")){
            ponto = pontoquestao3 + 1;
            if (ponto < 12){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4PseudocodigoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4PseudocodigoActivity.this, MainActivity.class);
                        intent.putExtra("pontosquestoesintroducao", ponto);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4PseudocodigoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setCancelable(false);
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4PseudocodigoActivity.this, MainActivity.class);
                        intent.putExtra("pontosquestoesintroducao", ponto);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_introducao.php";
            Ion.with(Questao4PseudocodigoActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_introducao", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4PseudocodigoActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao3 + 0;
            if (ponto < 12){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4PseudocodigoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4PseudocodigoActivity.this, MainActivity.class);
                        intent.putExtra("pontosquestoesintroducao", ponto);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4PseudocodigoActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setCancelable(false);
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4PseudocodigoActivity.this, MainActivity.class);
                        intent.putExtra("pontosquestoesintroducao", ponto);
                        intent.putExtra("emailusuario", emailusuario);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_introducao.php";
            Ion.with(Questao4PseudocodigoActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_introducao", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4PseudocodigoActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4PseudocodigoActivity.this, Questao3PseudocodigoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

}
