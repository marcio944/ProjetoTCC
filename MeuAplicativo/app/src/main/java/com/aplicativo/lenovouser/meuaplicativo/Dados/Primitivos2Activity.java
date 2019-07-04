package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.R;


public class Primitivos2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primitivos2);
    }

    public void anterior(View view){
        Intent intent = new Intent(Primitivos2Activity.this, PrimitivosActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(Primitivos2Activity.this, Questao1PrimitivosActivity.class);
        startActivity(intent);
    }

}
