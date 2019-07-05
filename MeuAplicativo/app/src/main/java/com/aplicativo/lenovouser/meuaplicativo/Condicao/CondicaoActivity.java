package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class CondicaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao);
    }

    public void condicaoSimples(View view){
        Intent intent = new Intent(CondicaoActivity.this, CondicaoSimplesActivity.class);
        startActivity(intent);
    }

    public void condicaoComposta(View view){
        Intent intent = new Intent(CondicaoActivity.this, CondicaoCompostaActivity.class);
        startActivity(intent);
    }

    public void condicaoEncadeada(View view){
        Intent intent = new Intent(CondicaoActivity.this, CondicaoEncadeadaActivity.class);
        startActivity(intent);
    }

}
