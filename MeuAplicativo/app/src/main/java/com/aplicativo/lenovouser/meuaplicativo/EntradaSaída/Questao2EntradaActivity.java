package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2EntradaActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_entrada);
        editText1 = (EditText) findViewById(R.id.editText9);
        editText2 = (EditText) findViewById(R.id.editText10);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2EntradaActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2EntradaActivity.this, Questao1EntradaActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if (editText1.getText().toString().equals("n1") && editText2.getText().toString().equals("n2")){
            Toast.makeText(Questao2EntradaActivity.this, "Resposta correta", Toast.LENGTH_LONG).show();;
            Intent intent = new Intent(Questao2EntradaActivity.this, Questao3EntradaActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(Questao2EntradaActivity.this, "Resposta errada", Toast.LENGTH_LONG).show();;
        }
    }

}
