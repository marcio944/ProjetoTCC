package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao4PseudocodigoActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_pseudocodigo);
        editText = (EditText) findViewById(R.id.editText2);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4PseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if (editText.getText().toString().equals("x <- 10")){
            Toast.makeText(Questao4PseudocodigoActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao4PseudocodigoActivity.this, Questao5PseudocodigoActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao4PseudocodigoActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4PseudocodigoActivity.this, Questao3PseudocodigoActivity.class);
        startActivity(intent);
    }

}
