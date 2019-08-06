package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao5FluxogramaActivity extends AppCompatActivity {

    private RadioButton radioButton;
    Button button;
    int pontoquestao4;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5_fluxograma);
        radioButton = (RadioButton) findViewById(R.id.radioButton14);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao4 = bundle.getInt("pontoquestao4");
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao5FluxogramaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao5FluxogramaActivity.this, Questao4FluxogramaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()){
            ponto = pontoquestao4 + 1;
            Toast.makeText(Questao5FluxogramaActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao5FluxogramaActivity.this, IntroducaoActivity.class);
            intent.putExtra("pontoquestao5fluxograma", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao4 + 0;
            Toast.makeText(Questao5FluxogramaActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao5FluxogramaActivity.this, IntroducaoActivity.class);
            intent.putExtra("pontoquestao5fluxograma", ponto);
            startActivity(intent);
        }
    }

}
