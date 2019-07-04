package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.EntradaSaída.EntradaActivity;
import com.aplicativo.lenovouser.meuaplicativo.EntradaSaída.EntradaSaidaActivity;
import com.aplicativo.lenovouser.meuaplicativo.EntradaSaída.ExemploEntradaActivity;
import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class CondicaoSimplesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao_simples);
    }

    public void inicio(View view){
        Intent intent = new Intent(CondicaoSimplesActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(CondicaoSimplesActivity.this, CondicaoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(CondicaoSimplesActivity.this, ExemploCondicaoSimplesActivity.class);
        startActivity(intent);
    }

}
