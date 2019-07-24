package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao5ConstantesVariaveisActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5_constantes_variaveis);
        radioButton = (RadioButton) findViewById(R.id.radioButton72);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao5ConstantesVariaveisActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao5ConstantesVariaveisActivity.this, Questao4ConstantesVariaveisActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            Toast.makeText(Questao5ConstantesVariaveisActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao5ConstantesVariaveisActivity.this, DadosActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao5ConstantesVariaveisActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}