package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Dados.Questao1ConstantesVariaveisActivity;
import com.aplicativo.lenovouser.meuaplicativo.Dados.Questao2ConstantesVariaveisActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class Questao1LogicasRelacionaisActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontos;
    private String emailusuario;
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_logicas_relacionais);
        radioButton = (RadioButton) findViewById(R.id.radioButton125);
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1LogicasRelacionaisActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1LogicasRelacionaisActivity.this, ExemploLogicasCompostasActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            String URL = HOST + "/buscar_pontos_primitivos.php";
            Ion.with(Questao1LogicasRelacionaisActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    String RETORNO = result.get("BUSCA").getAsString();
                    pontos = Integer.parseInt(RETORNO);
                    ponto = pontos + 1;
                    Intent intent = new Intent(Questao1LogicasRelacionaisActivity.this, Questao2RelacionaisLogicasActivity.class);
                    intent.putExtra("pontoquestao1", ponto);
                    intent.putExtra("emailusuario", emailusuario);
                    startActivity(intent);
                    finish();
                }
            });
        }else{
            String URL = HOST + "/buscar_pontos_primitivos.php";
            Ion.with(Questao1LogicasRelacionaisActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    String RETORNO = result.get("BUSCA").getAsString();
                    pontos = Integer.parseInt(RETORNO);
                    ponto = pontos + 0;
                    Intent intent = new Intent(Questao1LogicasRelacionaisActivity.this, Questao2RelacionaisLogicasActivity.class);
                    intent.putExtra("pontoquestao1", ponto);
                    intent.putExtra("emailusuario", emailusuario);
                    startActivity(intent);
                    finish();
                }
            });
        }
    }

}
