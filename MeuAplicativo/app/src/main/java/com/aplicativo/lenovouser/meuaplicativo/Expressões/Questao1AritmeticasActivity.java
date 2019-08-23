package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1AritmeticasActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_aritmeticas);
        editText = (EditText) findViewById(R.id.editText13);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1AritmeticasActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1AritmeticasActivity.this, ExemploPrecedenciaAritmeticosActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(editText.getText().toString().equals("8")) {
            Toast.makeText(Questao1AritmeticasActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1AritmeticasActivity.this, Questao2AritmeticasActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao1AritmeticasActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
