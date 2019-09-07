package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao4AritmeticasActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao3;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao4_aritmeticas);
        radioButton = (RadioButton) findViewById(R.id.radioButton131);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao3 = bundle.getInt("pontoquestao3");
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao4AritmeticasActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao4AritmeticasActivity.this, Questao3AritmeticasActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao3 + 1;
            Intent intent = new Intent(Questao4AritmeticasActivity.this, ExpressoesActivity.class);
            intent.putExtra("pontoquestao4aritmeticas", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }else{
            ponto = pontoquestao3 + 0;
            Intent intent = new Intent(Questao4AritmeticasActivity.this, ExpressoesActivity.class);
            intent.putExtra("pontoquestao4aritmeticas", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

}
