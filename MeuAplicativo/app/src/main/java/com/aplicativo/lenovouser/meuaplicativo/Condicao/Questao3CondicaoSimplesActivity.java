package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Dados.Questao5ConstantesVariaveisActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao3CondicaoSimplesActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    String emailusuario;
    int ponto;
    int pontoquestao2;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_condicao_simples);
        editText1 = (EditText) findViewById(R.id.editText14);
        editText2 = (EditText) findViewById(R.id.editText15);
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
            pontoquestao2 = bundle.getInt("pontoquestao2");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3CondicaoSimplesActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3CondicaoSimplesActivity.this, Questao2CondicaoSimplesActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if (editText1.getText().toString().equals("se") && editText2.getText().toString().equals("então")){
            ponto = pontoquestao2 + 1;
            Intent intent = new Intent(Questao3CondicaoSimplesActivity.this, CondicaoActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao3condicaosimples", ponto);
            startActivity(intent);
            finish();
            String URL = HOST + "/cadastro_pontos_condicao_simples.php";
            Ion.with(Questao3CondicaoSimplesActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_condicao_simples", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3CondicaoSimplesActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }else{
            ponto = pontoquestao2 + 0;
            Intent intent = new Intent(Questao3CondicaoSimplesActivity.this, CondicaoActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao3condicaosimples", ponto);
            startActivity(intent);
            finish();
            String URL = HOST + "/cadastro_pontos_condicao_simples.php";
            Ion.with(Questao3CondicaoSimplesActivity.this).load(URL).setBodyParameter("email_app", emailusuario).setBodyParameter("pontos_condicao_simples", String.valueOf(ponto)).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("CADASTRO").getAsString();
                    } catch (Exception ex){
                        Toast.makeText(Questao3CondicaoSimplesActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }

}
