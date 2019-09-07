package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class PartesAlgoritmoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partes_algoritmo);
    }

    public void inicio(View view){
        Intent intent = new Intent(PartesAlgoritmoActivity.this, MainActivity.class);

        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(PartesAlgoritmoActivity.this, IntroducaoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(PartesAlgoritmoActivity.this, ExemploPartesActivity.class);
        startActivity(intent);
    }

}
