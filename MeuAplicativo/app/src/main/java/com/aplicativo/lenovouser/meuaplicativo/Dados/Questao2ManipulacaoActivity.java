package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2ManipulacaoActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_manipulacao);
        radioButton = (RadioButton) findViewById(R.id.radioButton118);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2ManipulacaoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2ManipulacaoActivity.this, Questao1ManipulacaoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            Toast.makeText(Questao2ManipulacaoActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao2ManipulacaoActivity.this, Questao3ManipulacaoActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao2ManipulacaoActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
