package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class EstruturaPseudocodigoActivity extends AppCompatActivity {

    int pontoquestao5fluxograma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estrutura_pseudocodigo);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao5fluxograma = bundle.getInt("pontoquestao5fluxograma");
    }

    public void inicio(View view){
        Intent intent = new Intent(EstruturaPseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(EstruturaPseudocodigoActivity.this, Questao1PseudocodigoActivity.class);
        intent.putExtra("pontoquestao5fluxograma", pontoquestao5fluxograma);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(EstruturaPseudocodigoActivity.this, PseudocodigoActivity.class);
        startActivity(intent);
    }

}
