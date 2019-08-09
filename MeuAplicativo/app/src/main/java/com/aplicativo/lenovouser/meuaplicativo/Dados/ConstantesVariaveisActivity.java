package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class ConstantesVariaveisActivity extends AppCompatActivity {

    int pontoquestao5primitivos;
    int ponto;
    String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constantes_variaveis);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao5primitivos = bundle.getInt("pontoquestao5primitivos");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(ConstantesVariaveisActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(ConstantesVariaveisActivity.this, DadosActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ConstantesVariaveisActivity.this, ExemploConstantesVariaveisActivity.class);
        intent.putExtra("pontoquestao5primitivos", pontoquestao5primitivos);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
