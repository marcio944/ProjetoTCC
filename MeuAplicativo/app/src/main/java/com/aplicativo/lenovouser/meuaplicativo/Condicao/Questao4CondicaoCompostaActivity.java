package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao4CondicaoCompostaActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao3;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_condicao_composta);
        radioButton = (RadioButton) findViewById(R.id.radioButton151);
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
            pontoquestao3 = bundle.getInt("pontoquestao3");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, Questao3CondicaoCompostaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao3 + 1;
            Toast.makeText(Questao4CondicaoCompostaActivity.this, "Resposta correta", Toast.LENGTH_LONG).show();
            Toast.makeText(Questao4CondicaoCompostaActivity.this, "Pontuação = " + ponto, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao4condicaocomposta", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao3 + 0;
            Toast.makeText(Questao4CondicaoCompostaActivity.this, "Resposta errada", Toast.LENGTH_LONG).show();
            Toast.makeText(Questao4CondicaoCompostaActivity.this, "Pontuação = " + ponto, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao4CondicaoCompostaActivity.this, MainActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao4condicaocomposta", ponto);
            startActivity(intent);
        }
    }

}
