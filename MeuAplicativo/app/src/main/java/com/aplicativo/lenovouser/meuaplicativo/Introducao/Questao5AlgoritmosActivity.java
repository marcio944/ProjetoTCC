package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao5AlgoritmosActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao4;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5_algoritmos);
        radioButton = (RadioButton) findViewById(R.id.radioButton51);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao4 = bundle.getInt("pontoquestao4");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }

    }

    public void inicio(View view){
        Intent intent = new Intent(Questao5AlgoritmosActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao5AlgoritmosActivity.this, Questao4AlgoritmosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao4 + 1;
            Intent intent = new Intent(Questao5AlgoritmosActivity.this, IntroducaoActivity.class);
            intent.putExtra("pontoquestao5conceitoalgoritmo", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            //Intent i = new Intent(Questao5AlgoritmosActivity.this, Questao1FluxogramaActivity.class);
        }else {
            ponto = pontoquestao4 + 0;
            Intent intent = new Intent(Questao5AlgoritmosActivity.this, IntroducaoActivity.class);
            intent.putExtra("pontoquestao5conceitoalgoritmo", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

}
