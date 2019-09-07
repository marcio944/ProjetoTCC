package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class SaidaActivity extends AppCompatActivity {

    String emailusuario;
    int pontoquestoesentrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saida);
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

    public void inicio(View view){
        Intent intent = new Intent(SaidaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(SaidaActivity.this, EntradaSaidaActivity.class);
        intent.putExtra("pontoquestoesentrada", pontoquestoesentrada);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(SaidaActivity.this, ExemploSaidaActivity.class);
        intent.putExtra("pontoquestoesentrada", pontoquestoesentrada);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
