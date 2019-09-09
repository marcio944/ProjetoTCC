package com.aplicativo.lenovouser.meuaplicativo.Homogêneas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1UnidimensionaisActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_unidimensionais);
        radioButton = (RadioButton) findViewById(R.id.radioButton139);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1UnidimensionaisActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1UnidimensionaisActivity.this, ExemploUnidimensionaisActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            Toast.makeText(Questao1UnidimensionaisActivity.this, "Resposta correta", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1UnidimensionaisActivity.this, Questao2UnidimensionaisActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(Questao1UnidimensionaisActivity.this, "Resposta errada", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1UnidimensionaisActivity.this, Questao2UnidimensionaisActivity.class);
            startActivity(intent);
        }

    }

}
