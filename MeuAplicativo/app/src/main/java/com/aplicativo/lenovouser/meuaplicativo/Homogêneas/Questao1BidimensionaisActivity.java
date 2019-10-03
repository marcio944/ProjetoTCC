package com.aplicativo.lenovouser.meuaplicativo.Homogêneas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1BidimensionaisActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestoesunidimensionais;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_bidimensionais);
        radioButton = (RadioButton) findViewById(R.id.radioButton154);
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
        Intent intent = new Intent(Questao1BidimensionaisActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1BidimensionaisActivity.this, ExemploBidimensionaisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestoesunidimensionais + 1;
            Intent intent = new Intent(Questao1BidimensionaisActivity.this, Questao2BidimensionaisActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
        }else {
            ponto = pontoquestoesunidimensionais + 0;
            Intent intent = new Intent(Questao1BidimensionaisActivity.this, Questao2BidimensionaisActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
        }

    }

}
