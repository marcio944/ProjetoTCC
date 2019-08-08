package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class DadosActivity extends AppCompatActivity {

    private String emailusuario;
    int pontoquestao5primitivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
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

    public void primitivos(View view){
        Intent intent = new Intent(DadosActivity.this, PrimitivosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void constantes_variaveis(View view){
        Intent intent = new Intent(DadosActivity.this, ConstantesVariaveisActivity.class);
        intent.putExtra("pontoquestao5primitivos", pontoquestao5primitivos);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void manipulacao_dados(View view){
        Intent intent = new Intent(DadosActivity.this, IdentificacaoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
