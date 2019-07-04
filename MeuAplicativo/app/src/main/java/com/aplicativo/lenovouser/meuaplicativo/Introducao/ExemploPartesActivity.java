package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExemploPartesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_partes);
    }

    public void retornarPartes(View view){
        Intent intent = new Intent(ExemploPartesActivity.this, PartesAlgoritmoActivity.class);
        startActivity(intent);
    }

}
