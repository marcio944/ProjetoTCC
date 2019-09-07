package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Expressões.Questao3RelacionaisLogicasActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao4SaidaActivity extends AppCompatActivity {

    EditText editText;
    String emailusuario;
    int pontoquestao3;
    int ponto;
    private String HOST = "http://tccmarcio.000webhostapp.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_saida);
        editText = (EditText) findViewById(R.id.editText6);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestao3 = bundle.getInt("pontoquestao3");
        }
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4SaidaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4SaidaActivity.this, Questao2SaidaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(editText.getText().toString().equals("6.5") || editText.getText().toString().equals("6,5")) {
            ponto = pontoquestao3 + 1;
            if (ponto < 5){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4SaidaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4SaidaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontoquestoesentradasaida", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4SaidaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4SaidaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontoquestoesentradasaida", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_entradasaida.php";
            Ion.with(Questao4SaidaActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_entradasaida", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4SaidaActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao3 + 0;
            if (ponto < 5){
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4SaidaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação insuficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4SaidaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontoquestoesentradasaida", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            } else {
                AlertDialog.Builder alerta = new AlertDialog.Builder(Questao4SaidaActivity.this);
                alerta.setTitle("Pontuação Total");
                alerta.setMessage("Pontuação = " + ponto + ". Pontuação suficiente para desbloquear o próximo tópico.");
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Questao4SaidaActivity.this, MainActivity.class);
                        intent.putExtra("emailusuario", emailusuario);
                        intent.putExtra("pontoquestoesentradasaida", ponto);
                        startActivity(intent);
                    }
                });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
            String URL = HOST + "/cadastro_pontos_entradasaida.php";
            Ion.with(Questao4SaidaActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_entradasaida", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4SaidaActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
