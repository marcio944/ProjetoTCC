package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2FluxogramaActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_fluxograma);
        radioButton = (RadioButton) findViewById(R.id.radioButton6);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao1 = bundle.getInt("pontoquestao1");
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2FluxogramaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2FluxogramaActivity.this, Questao1FluxogramaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()){
            ponto = pontoquestao1 + 1;
            Toast.makeText(Questao2FluxogramaActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao2FluxogramaActivity.this, Questao3FluxogramaActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao1 + 0;
            Toast.makeText(Questao2FluxogramaActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao2FluxogramaActivity.this, Questao3FluxogramaActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
        }

    }

}
