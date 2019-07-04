package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;


public class ExemploPseudocodigoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_pseudocodigo);
    }

    public void retornarPseudocodigo(View view){
        Intent intent = new Intent(ExemploPseudocodigoActivity.this, ComandosPseudocodigoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploPseudocodigoActivity.this, Questao1PseudocodigoActivity.class);
        startActivity(intent);
    }

}
