package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class EntradaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);
    }

    public void inicio(View view){
        Intent intent = new Intent(EntradaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(EntradaActivity.this, EntradaSaidaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(EntradaActivity.this, ExemploEntradaActivity.class);
        startActivity(intent);
    }

}
