package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class ComandosPseudocodigoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comandos_pseudocodigo);
    }

    public void proximo(View view){
        Intent intent = new Intent(ComandosPseudocodigoActivity.this, ExemploPseudocodigoActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(ComandosPseudocodigoActivity.this, EstruturaPseudocodigoActivity.class);
        startActivity(intent);
    }

}
