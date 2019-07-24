package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3SaidaActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_saida);
        editText1 = (EditText) findViewById(R.id.editText3);
        editText2 = (EditText) findViewById(R.id.editText4);
        editText3 = (EditText) findViewById(R.id.editText5);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3SaidaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3SaidaActivity.this, Questao2SaidaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(editText1.getText().toString().equals("escreva") && editText2.getText().toString().equals("escreva") && editText3.getText().toString().equals("escreva")) {
            Toast.makeText(Questao3SaidaActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao3SaidaActivity.this, Questao4SaidaActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao3SaidaActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
