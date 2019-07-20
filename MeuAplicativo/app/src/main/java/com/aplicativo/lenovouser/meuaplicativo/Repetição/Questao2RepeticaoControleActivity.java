package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2RepeticaoControleActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_repeticao_controle);
        radioButton = (RadioButton) findViewById(R.id.radioButton103);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2RepeticaoControleActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2RepeticaoControleActivity.this, Questao1RepeticaoControleActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            Toast.makeText(Questao2RepeticaoControleActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(Questao2RepeticaoControleActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
