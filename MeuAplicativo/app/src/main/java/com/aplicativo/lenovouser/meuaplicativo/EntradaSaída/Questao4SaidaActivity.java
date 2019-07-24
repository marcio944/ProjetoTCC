package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao4SaidaActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_saida);
        editText = (EditText) findViewById(R.id.editText6);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4SaidaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4SaidaActivity.this, Questao2SaidaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(editText.getText().toString().equals("6.5") || editText.getText().toString().equals("6,5")) {
            Toast.makeText(Questao4SaidaActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao4SaidaActivity.this, EntradaSaidaActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao4SaidaActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
