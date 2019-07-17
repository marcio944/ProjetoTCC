package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1TesteInicioActivity extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_teste_inicio);
        radioButton = (RadioButton) findViewById(R.id.radioButton74);
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1TesteInicioActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1TesteInicioActivity.this, ExemploTesteInicioActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            Toast.makeText(Questao1TesteInicioActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao1TesteInicioActivity.this, Questao2TesteInicioActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(Questao1TesteInicioActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
        }
    }

}
