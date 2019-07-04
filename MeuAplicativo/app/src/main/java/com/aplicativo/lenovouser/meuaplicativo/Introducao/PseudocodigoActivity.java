package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class PseudocodigoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pseudocodigo);
    }

    public  void exemploPseudocodigo(View view){
        Intent intent = new Intent(PseudocodigoActivity.this, EstruturaPseudocodigoActivity.class);
        startActivity(intent);
    }

    public void retornarIntroducao(View view){
        Intent intent = new Intent(PseudocodigoActivity.this, IntroducaoActivity.class);
        startActivity(intent);
    }

}