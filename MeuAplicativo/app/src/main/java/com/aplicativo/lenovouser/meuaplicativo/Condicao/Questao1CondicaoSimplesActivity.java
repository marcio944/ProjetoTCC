package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1CondicaoSimplesActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_condicao_simples);
        radioButton = (RadioButton) findViewById(R.id.radioButton124);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1CondicaoSimplesActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1CondicaoSimplesActivity.this, ExemploCondicaoSimplesActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = ponto + 1;
            Intent intent = new Intent(Questao1CondicaoSimplesActivity.this, Questao2CondicaoSimplesActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
            finish();
        }else{
            ponto = ponto + 0;
            Intent intent = new Intent(Questao1CondicaoSimplesActivity.this, Questao2CondicaoSimplesActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
            finish();
        }
    }

}
