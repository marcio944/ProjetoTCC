package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class ConstantesVariaveisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constantes_variaveis);
    }

    public void anterior(View view){
        Intent intent = new Intent(ConstantesVariaveisActivity.this, DadosActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ConstantesVariaveisActivity.this, ExemploConstantesVariaveisActivity.class);
        startActivity(intent);
    }

}
