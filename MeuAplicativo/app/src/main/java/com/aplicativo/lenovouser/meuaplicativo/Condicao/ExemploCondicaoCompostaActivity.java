package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExemploCondicaoCompostaActivity extends AppCompatActivity {

    String emailusuario;
    int pontoquestao3condicaosimples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_condicao_composta);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            pontoquestao3condicaosimples = bundle.getInt("pontoquestao3condicaosimples");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(ExemploCondicaoCompostaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(ExemploCondicaoCompostaActivity.this, CondicaoCompostaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploCondicaoCompostaActivity.this, Questao1CompostaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontoquestao3condicaosimples", pontoquestao3condicaosimples);
        startActivity(intent);
    }

}
