package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class RepeticaoControleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeticao_controle);
    }

    public void inicio(View view){
        Intent intent = new Intent(RepeticaoControleActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(RepeticaoControleActivity.this, RepeticaoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(RepeticaoControleActivity.this, ExemploRepeticaoControleActivity.class);
        startActivity(intent);
    }
}
