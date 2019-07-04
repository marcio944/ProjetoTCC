package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class SimbolosFluxogramaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simbolos_fluxograma);
    }

    public void anteriorExemploFluxograma(View view){
        Intent intent = new Intent(SimbolosFluxogramaActivity.this, ExemploFluxogramaActivity.class);
        startActivity(intent);
    }

    public void proximoQuestao1Fluxograma(View view){
        Intent intent = new Intent(SimbolosFluxogramaActivity.this, Questao1FluxogramaActivity.class);
        startActivity(intent);
    }

}
