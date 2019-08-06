package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;


public class ExemploFluxogramaActivity extends AppCompatActivity {

    int pontoquestao5conceito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_fluxograma);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao5conceito = bundle.getInt("pontoquestao5conceitoalgoritmo");
    }

    public void inicio(View view){
        Intent intent = new Intent(ExemploFluxogramaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploFluxogramaActivity.this, SimbolosFluxogramaActivity.class);
        intent.putExtra("pontoquestao5conceitoalgoritmo", pontoquestao5conceito);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(ExemploFluxogramaActivity.this, FluxogramaActivity.class);
        startActivity(intent);
    }

}
