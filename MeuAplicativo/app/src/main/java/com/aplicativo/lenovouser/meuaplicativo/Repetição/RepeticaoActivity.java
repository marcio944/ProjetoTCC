package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class RepeticaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeticao);
    }

    public void testeInicio(View view){
        Intent intent = new Intent(RepeticaoActivity.this, TesteInicioActivity.class);
        startActivity(intent);
    }

    public void testeFim(View view){
        Intent intent = new Intent(RepeticaoActivity.this, TesteFimActivity.class);
        startActivity(intent);
    }

    public void repeticaoControle(View view){
        Intent intent = new Intent(RepeticaoActivity.this, RepeticaoControleActivity.class);
        startActivity(intent);
    }
}
