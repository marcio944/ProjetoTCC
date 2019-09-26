package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class RepeticaoActivity extends AppCompatActivity {

    String emailusuario;
    int pontoquestoestesteinicio;
    int pontoquestoestestefim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeticao);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestoestesteinicio = bundle.getInt("pontoquestoestesteinicio");
        }
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
            pontoquestoestestefim = bundle3.getInt("pontoquestoestestefim");
        }
    }

    public void testeInicio(View view){
        Intent intent = new Intent(RepeticaoActivity.this, TesteInicioActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void testeFim(View view){
        Intent intent = new Intent(RepeticaoActivity.this, TesteFimActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontoquestoestesteinicio", pontoquestoestesteinicio);
        startActivity(intent);
    }

    public void repeticaoControle(View view){
        Intent intent = new Intent(RepeticaoActivity.this, RepeticaoControleActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontoquestoestestefim", pontoquestoestestefim);
        startActivity(intent);
    }
}
