package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2AlgoritmosActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoQuestao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_algoritmos);
        radioButton = (RadioButton) findViewById(R.id.radioButton41);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoQuestao1 = bundle.getInt("pontoquestao1");
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2AlgoritmosActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2AlgoritmosActivity.this, Questao1AlgoritmosActivity.class);
        startActivity(intent);
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoQuestao1 + 1;
            Toast.makeText(Questao2AlgoritmosActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao2AlgoritmosActivity.this, Questao3AlgoritmosActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
        }else {
            ponto = pontoQuestao1 + 0;
            Toast.makeText(Questao2AlgoritmosActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao2AlgoritmosActivity.this, Questao3AlgoritmosActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);

        }
    }

}
