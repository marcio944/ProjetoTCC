package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao4TesteFimActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao3;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_teste_fim);
        radioButton = (RadioButton) findViewById(R.id.radioButton101);
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
        Intent intent = new Intent(Questao4TesteFimActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4TesteFimActivity.this, Questao2TesteFimActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao3 + 1;
            Toast.makeText(Questao4TesteFimActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao4TesteFimActivity.this, RepeticaoActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestoestestefim", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao3 + 0;
            Toast.makeText(Questao4TesteFimActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao4TesteFimActivity.this, RepeticaoActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestoestestefim", ponto);
            startActivity(intent);
        }
    }

}
