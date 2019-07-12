package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class FluxogramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluxograma);
    }

    public void inicio(View view){
        Intent intent = new Intent(FluxogramaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(FluxogramaActivity.this, ExemploFluxogramaActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(FluxogramaActivity.this, IntroducaoActivity.class);
        startActivity(intent);
    }

}
