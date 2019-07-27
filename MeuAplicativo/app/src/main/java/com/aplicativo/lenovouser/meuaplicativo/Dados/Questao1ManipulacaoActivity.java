package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1ManipulacaoActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_manipulacao);
        radioButton = (RadioButton) findViewById(R.id.radioButton115);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1ManipulacaoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1ManipulacaoActivity.this, ExemploAtribuicaoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            Toast.makeText(Questao1ManipulacaoActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1ManipulacaoActivity.this, Questao2ManipulacaoActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao1ManipulacaoActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
