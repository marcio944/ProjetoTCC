package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1RepeticaoControleActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestoestestefim;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_repeticao_controle);
        radioButton = (RadioButton) findViewById(R.id.radioButton96);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestoestestefim = bundle.getInt("pontoquestoestestefim");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1RepeticaoControleActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1RepeticaoControleActivity.this, ExemploRepeticaoControleActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestoestestefim + 1;
            Toast.makeText(Questao1RepeticaoControleActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1RepeticaoControleActivity.this, Questao2RepeticaoControleActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestoestestefim + 0;
            Toast.makeText(Questao1RepeticaoControleActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1RepeticaoControleActivity.this, Questao2RepeticaoControleActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao1", ponto);
            startActivity(intent);
        }
    }

}
