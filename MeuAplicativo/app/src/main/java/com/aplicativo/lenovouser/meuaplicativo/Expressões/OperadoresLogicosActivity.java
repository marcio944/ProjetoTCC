package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class OperadoresLogicosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadores_logicos);
    }

    public void inicio(View view){
        Intent intent = new Intent(OperadoresLogicosActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(OperadoresLogicosActivity.this, ExemploOperadoresRelacionaisActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(OperadoresLogicosActivity.this, ExemploOperadoresLogicosActivity.class);
        startActivity(intent);
    }


}
