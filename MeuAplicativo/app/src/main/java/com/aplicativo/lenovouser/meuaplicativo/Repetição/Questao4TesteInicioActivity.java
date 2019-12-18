package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Introducao.Questao5FluxogramaActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao4TesteInicioActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao3;
    int ponto;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_teste_inicio);
        radioButton = (RadioButton) findViewById(R.id.radioButton83);
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
        Intent intent = new Intent(Questao4TesteInicioActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4TesteInicioActivity.this, Questao3TesteInicioActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao3 + 1;
            Intent intent = new Intent(Questao4TesteInicioActivity.this, RepeticaoActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
            String URL = HOST + "/cadastro_pontos_testeinicio.php";
            Ion.with(Questao4TesteInicioActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_testeinicio", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4TesteInicioActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao3 + 0;
            Intent intent = new Intent(Questao4TesteInicioActivity.this, RepeticaoActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
            String URL = HOST + "/cadastro_pontos_testeinicio.php";
            Ion.with(Questao4TesteInicioActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_testeinicio", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao4TesteInicioActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
