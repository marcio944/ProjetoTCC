package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class EstruturaPseudocodigoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estrutura_pseudocodigo);
    }

    public void inicio(View view){
        Intent intent = new Intent(EstruturaPseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){

    }

    public void anterior(View view){
        Intent intent = new Intent(EstruturaPseudocodigoActivity.this, PseudocodigoActivity.class);
        startActivity(intent);
    }

}
