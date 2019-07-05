package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExpressoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expressoes);
    }

    public void aritmeticas(View view){
        Intent intent = new Intent(ExpressoesActivity.this, OperadoresAritmeticosActivity.class);
        startActivity(intent);
    }

    public void logicas(View view){
        Intent intent = new Intent(ExpressoesActivity.this, OperadoresRelacionaisActivity.class);
        startActivity(intent);
    }

}
