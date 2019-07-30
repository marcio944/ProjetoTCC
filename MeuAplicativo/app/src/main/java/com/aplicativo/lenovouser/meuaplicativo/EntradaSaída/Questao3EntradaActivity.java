package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3EntradaActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_entrada);
        editText1 = (EditText) findViewById(R.id.editText11);
        editText2 = (EditText) findViewById(R.id.editText12);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3EntradaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3EntradaActivity.this, Questao2EntradaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if (editText1.getText().toString().equals("leia(n1)") && editText2.getText().toString().equals("leia(n2)")){
            Toast.makeText(Questao3EntradaActivity.this, "Resposta correta", Toast.LENGTH_LONG).show();;
            Intent intent = new Intent(Questao3EntradaActivity.this, EntradaSaidaActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(Questao3EntradaActivity.this, "Resposta errada", Toast.LENGTH_LONG).show();;
        }
    }

}
