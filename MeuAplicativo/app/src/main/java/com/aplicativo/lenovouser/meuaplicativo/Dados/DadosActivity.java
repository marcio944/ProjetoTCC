package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class DadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
    }

    public void primitivos(View view){
        Intent intent = new Intent(DadosActivity.this, PrimitivosActivity.class);
        startActivity(intent);
    }

    public void constantes_variaveis(View view){
        Intent intent = new Intent(DadosActivity.this, ConstantesVariaveisActivity.class);
        startActivity(intent);
    }

}
