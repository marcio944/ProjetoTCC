package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3PseudocodigoActivity extends AppCompatActivity {

    EditText editText;
    int ponto;
    int pontoquestao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_pseudocodigo);
        editText = (EditText) findViewById(R.id.editText);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao2 = bundle.getInt("pontoquestao2");
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3PseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if (editText.getText().toString().equals("5")){
            ponto = pontoquestao2 + 1;
            Toast.makeText(Questao3PseudocodigoActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao3PseudocodigoActivity.this, Questao4PseudocodigoActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao2 + 0;
            Toast.makeText(Questao3PseudocodigoActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao3PseudocodigoActivity.this, Questao4PseudocodigoActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
        }
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3PseudocodigoActivity.this, Questao5PseudocodigoActivity.class);
        startActivity(intent);
    }

}
