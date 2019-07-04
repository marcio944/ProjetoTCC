package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;


public class ExemploFluxogramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_fluxograma);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploFluxogramaActivity.this, SimbolosFluxogramaActivity.class);
        startActivity(intent);
    }

    private void anterior(View view){
        Intent intent = new Intent(ExemploFluxogramaActivity.this, FluxogramaActivity.class);
        startActivity(intent);
    }

}
