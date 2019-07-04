package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class IntroducaoActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducao);
    }

    public void conceitoAlgoritmo(View view){
        Intent intent = new Intent(this,ConceitoAlgoritmoActivity.class);
        startActivity(intent);
    }

    public void partesAlgoritmo(View view){
        Intent intent = new Intent(IntroducaoActivity.this, PartesAlgoritmoActivity.class);
        startActivity(intent);
    }

    public void fluxograma(View view){
        Intent intent = new Intent(IntroducaoActivity.this, FluxogramaActivity.class);
        startActivity(intent);
    }

    public void pseudocodigo(View view){
        Intent intent = new Intent(IntroducaoActivity.this, PseudocodigoActivity.class);
        startActivity(intent);
    }

}
