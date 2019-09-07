package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao4AlgoritmosActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao3;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_algoritmos);
        radioButton = (RadioButton) findViewById(R.id.radioButton47);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao3 = bundle.getInt("pontoquestao3");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4AlgoritmosActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4AlgoritmosActivity.this, Questao3AlgoritmosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao3 + 1;
            Intent intent = new Intent(Questao4AlgoritmosActivity.this, Questao5AlgoritmosActivity.class);
            intent.putExtra("pontoquestao4", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }else {
            ponto = pontoquestao3 + 0;
            Intent intent = new Intent(Questao4AlgoritmosActivity.this, Questao5AlgoritmosActivity.class);
            intent.putExtra("pontoquestao4", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

}
