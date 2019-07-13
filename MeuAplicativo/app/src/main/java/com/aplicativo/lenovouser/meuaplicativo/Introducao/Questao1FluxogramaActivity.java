package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;


public class Questao1FluxogramaActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_fluxograma);
        radioButton = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1FluxogramaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1FluxogramaActivity.this, ExemploFluxogramaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            Toast.makeText(Questao1FluxogramaActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1FluxogramaActivity.this, Questao2FluxogramaActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao1FluxogramaActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
