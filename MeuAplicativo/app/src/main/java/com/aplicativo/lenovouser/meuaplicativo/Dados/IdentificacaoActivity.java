package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class IdentificacaoActivity extends AppCompatActivity {

    int pontoquestao5constantesvariaveis;
    int ponto;
    String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identificacao);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao5constantesvariaveis = bundle.getInt("pontoquestao5constantesvariaveis");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(IdentificacaoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(IdentificacaoActivity.this, DadosActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(IdentificacaoActivity.this, DefinicaoActivity.class);
        intent.putExtra("pontoquestao5constantesvariaveis", pontoquestao5constantesvariaveis);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
