package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1PseudocodigoActivity extends AppCompatActivity {

    RadioButton radioButton;
    int pontoquestao5fluxograma;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_pseudocodigo);
        radioButton = (RadioButton) findViewById(R.id.radioButton22);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao5fluxograma = bundle.getInt("pontoquestao5fluxograma");
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1PseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1PseudocodigoActivity.this, IntroducaoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()){
            ponto = pontoquestao5fluxograma + 1;
            Toast.makeText(Questao1PseudocodigoActivity.this, "Resposta correta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1PseudocodigoActivity.this, Questao2PseudocodigoActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
        }else {
            ponto = pontoquestao5fluxograma + 0;
            Toast.makeText(Questao1PseudocodigoActivity.this, "Resposta errada", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1PseudocodigoActivity.this, Questao2PseudocodigoActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
        }
    }

}
