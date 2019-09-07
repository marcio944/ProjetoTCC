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
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_algoritmos);
        radioButton = (RadioButton) findViewById(R.id.radioButton41);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoQuestao1 = bundle.getInt("pontoquestao1");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2AlgoritmosActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2AlgoritmosActivity.this, Questao1AlgoritmosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoQuestao1 + 1;
            Intent intent = new Intent(Questao2AlgoritmosActivity.this, Questao3AlgoritmosActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }else {
            ponto = pontoQuestao1 + 0;
            Intent intent = new Intent(Questao2AlgoritmosActivity.this, Questao3AlgoritmosActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);

        }
    }

}
