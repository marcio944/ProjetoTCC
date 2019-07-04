package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class EntradaSaidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_saida);
    }

    public void saida(View view){
        Intent intent = new Intent(EntradaSaidaActivity.this, SaidaActivity.class);
        startActivity(intent);
    }

    public void entrada(View view){
        Intent intent = new Intent(EntradaSaidaActivity.this, EntradaActivity.class);
        startActivity(intent);
    }

}
