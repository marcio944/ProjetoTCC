package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExemploConstantesVariaveisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_constantes_variaveis);
    }

    public void anterior(View view){
        Intent intent = new Intent(ExemploConstantesVariaveisActivity.this, ConstantesVariaveisActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploConstantesVariaveisActivity.this, Questao1ConstantesVariaveisActivity.class);
        startActivity(intent);
    }

}
