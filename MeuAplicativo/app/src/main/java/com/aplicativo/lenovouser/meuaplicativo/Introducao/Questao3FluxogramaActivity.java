package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3FluxogramaActivity extends AppCompatActivity {

    private RadioButton radioButton;
    int ponto;
    int pontoquestao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_fluxograma);
        radioButton = (RadioButton) findViewById(R.id.radioButton8);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao2 = bundle.getInt("pontoquestao2");
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3FluxogramaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3FluxogramaActivity.this, Questao2FluxogramaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()){
            ponto = pontoquestao2 + 1;
            Toast.makeText(Questao3FluxogramaActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao3FluxogramaActivity.this, Questao4FluxogramaActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao2 + 0;
            Toast.makeText(Questao3FluxogramaActivity.this, "Resposta incorreta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao3FluxogramaActivity.this, Questao4FluxogramaActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
        }
    }

}
