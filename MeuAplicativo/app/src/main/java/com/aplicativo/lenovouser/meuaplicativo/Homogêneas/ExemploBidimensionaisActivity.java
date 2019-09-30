package com.aplicativo.lenovouser.meuaplicativo.Homogêneas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExemploBidimensionaisActivity extends AppCompatActivity {

    String emailusuario;
    int pontoquestoesunidimensionais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_bidimensionais);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestoesunidimensionais = bundle.getInt("pontoquestoesunidimensionais");
        }
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(ExemploBidimensionaisActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(ExemploBidimensionaisActivity.this, BidimensionaisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploBidimensionaisActivity.this, Questao1BidimensionaisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontoquestoesunidimensionais", pontoquestoesunidimensionais);
        startActivity(intent);
    }

}
