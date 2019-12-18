package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class RepeticaoActivity extends AppCompatActivity {

    String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repeticao);
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void testeInicio(View view){
        Intent intent = new Intent(RepeticaoActivity.this, TesteInicioActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void testeFim(View view){
        Intent intent = new Intent(RepeticaoActivity.this, TesteFimActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void repeticaoControle(View view){
        Intent intent = new Intent(RepeticaoActivity.this, RepeticaoControleActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }
}
