package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class PrimitivosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primitivos);
    }

    public void inicio(View view){
        Intent intent = new Intent(PrimitivosActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(PrimitivosActivity.this, DadosActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(PrimitivosActivity.this, Primitivos2Activity.class);
        startActivity(intent);
    }

}
