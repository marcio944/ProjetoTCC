package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;


public class Questao1AlgoritmosActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_algoritmos);
        radioButton = (RadioButton) findViewById(R.id.radioButton39);
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1AlgoritmosActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1AlgoritmosActivity.this, ExemploAlgoritmoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            ponto = 1;
            Intent intent = new Intent(Questao1AlgoritmosActivity.this, Questao2AlgoritmosActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
        }else {
            ponto = 0;
            Intent intent = new Intent(Questao1AlgoritmosActivity.this, Questao2AlgoritmosActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
        }
    }

}
