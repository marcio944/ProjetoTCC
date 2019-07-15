package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Introducao.ExemploFluxogramaActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1ConstantesVariaveisActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_constantes_variaveis);
        radioButton = (RadioButton) findViewById(R.id.radioButton62);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1ConstantesVariaveisActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1ConstantesVariaveisActivity.this, ExemploConstantesVariaveisActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            Toast.makeText(Questao1ConstantesVariaveisActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1ConstantesVariaveisActivity.this, Questao2ConstantesVariaveisActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao1ConstantesVariaveisActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}