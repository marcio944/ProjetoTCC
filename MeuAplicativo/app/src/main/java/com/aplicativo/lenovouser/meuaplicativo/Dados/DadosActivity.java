package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class DadosActivity extends AppCompatActivity {

    private String emailusuario;
    int pontosintroducao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
        Intent intent3 = getIntent();
        Bundle bundle3 = new Bundle();
        bundle3 = intent3.getExtras();
        if (bundle3 != null){
            pontosintroducao = bundle3.getInt("pontosintroducao");
        }
    }

    public void primitivos(View view){
        Intent intent = new Intent(DadosActivity.this, PrimitivosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosintroducao);
        startActivity(intent);
    }

    public void constantes_variaveis(View view){
        Intent intent = new Intent(DadosActivity.this, ConstantesVariaveisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosintroducao);
        startActivity(intent);
    }

    public void manipulacao_dados(View view){
        Intent intent = new Intent(DadosActivity.this, IdentificacaoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosintroducao);
        startActivity(intent);
    }

}
