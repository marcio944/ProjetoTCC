package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao4PrimitivosActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_primitivos);
        radioButton = (RadioButton) findViewById(R.id.radioButton54);

    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4PrimitivosActivity.this, Questao3PrimitivosActivity.class);
        startActivity(intent);
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            Toast.makeText(Questao4PrimitivosActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao4PrimitivosActivity.this, Questao5PrimitivosActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(Questao4PrimitivosActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }


}