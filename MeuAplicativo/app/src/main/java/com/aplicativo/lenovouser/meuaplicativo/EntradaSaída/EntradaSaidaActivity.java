package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class EntradaSaidaActivity extends AppCompatActivity {

    int pontoquestoesentrada;
    String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada_saida);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestoesentrada = bundle.getInt("pontoquestoesentrada");
        }
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void saida(View view){
        Intent intent = new Intent(EntradaSaidaActivity.this, SaidaActivity.class);
        intent.putExtra("pontoquestoesentrada", pontoquestoesentrada);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void entrada(View view){
        Intent intent = new Intent(EntradaSaidaActivity.this, EntradaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
