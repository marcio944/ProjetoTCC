package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao5PseudocodigoActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5_pseudocodigo);
        radioButton = (RadioButton) findViewById(R.id.radioButton26);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao5PseudocodigoActivity.this, Questao4PseudocodigoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()){
            Toast.makeText(Questao5PseudocodigoActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao5PseudocodigoActivity.this, IntroducaoActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao5PseudocodigoActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
