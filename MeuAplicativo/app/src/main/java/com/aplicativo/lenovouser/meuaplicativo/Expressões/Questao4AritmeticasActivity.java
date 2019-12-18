package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Dados.Questao5ConstantesVariaveisActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao4AritmeticasActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontos;
    int pontoquestao3;
    private String emailusuario;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_aritmeticas);
        radioButton = (RadioButton) findViewById(R.id.radioButton131);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao3 = bundle.getInt("pontoquestao3");
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4AritmeticasActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4AritmeticasActivity.this, Questao3AritmeticasActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao3 + 1;
            Intent intent = new Intent(Questao4AritmeticasActivity.this, ExpressoesActivity.class);
            intent.putExtra("pontoquestao4aritmeticas", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
            String URL = HOST + "/cadastro_pontos_aritmeticas.php";
            Ion.with(Questao4AritmeticasActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_aritmeticas", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4AritmeticasActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao3 + 0;
            Intent intent = new Intent(Questao4AritmeticasActivity.this, ExpressoesActivity.class);
            intent.putExtra("pontoquestao4aritmeticas", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
            String URL = HOST + "/cadastro_pontos_aritmeticas.php";
            Ion.with(Questao4AritmeticasActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_aritmeticas", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4AritmeticasActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
