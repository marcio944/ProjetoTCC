package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class CondicaoEncadeadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicao_encadeada);
    }

    public void inicio(View view){
        Intent intent = new Intent(CondicaoEncadeadaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(CondicaoEncadeadaActivity.this, CondicaoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(CondicaoEncadeadaActivity.this, ExemploCondicaoEncadeadaActivity.class);
        startActivity(intent);
    }
}
