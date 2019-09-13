package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2CondicaoSimplesActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int ponto;
    int pontoquestao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_condicao_simples);
        radioButton = (RadioButton) findViewById(R.id.radioButton136);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            pontoquestao1 = bundle.getInt("pontoquestao1");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2CondicaoSimplesActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2CondicaoSimplesActivity.this, Questao1CondicaoSimplesActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao1 + 1;
            Toast.makeText(Questao2CondicaoSimplesActivity.this, "Resposta correta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao2CondicaoSimplesActivity.this, Questao3CondicaoSimplesActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao1 + 0;
            Toast.makeText(Questao2CondicaoSimplesActivity.this, "Resposta errada", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao2CondicaoSimplesActivity.this, Questao3CondicaoSimplesActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
        }
    }

}
