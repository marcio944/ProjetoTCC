package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3AritmeticasActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao2;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_aritmeticas);
        radioButton = (RadioButton) findViewById(R.id.radioButton20);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao2 = bundle.getInt("pontoquestao2");
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3AritmeticasActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3AritmeticasActivity.this, Questao2AritmeticasActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao2 + 1;
            Intent intent = new Intent(Questao3AritmeticasActivity.this, Questao4AritmeticasActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }else{
            ponto = pontoquestao2 + 0;
            Intent intent = new Intent(Questao3AritmeticasActivity.this, Questao4AritmeticasActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

}
