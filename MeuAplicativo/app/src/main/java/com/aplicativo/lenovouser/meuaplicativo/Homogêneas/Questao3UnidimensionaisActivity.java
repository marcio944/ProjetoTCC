package com.aplicativo.lenovouser.meuaplicativo.Homogêneas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3UnidimensionaisActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao2;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_unidimensionais);
        radioButton = (RadioButton) findViewById(R.id.radioButton145);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestao2 = bundle.getInt("pontoquestao2");
        }
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3UnidimensionaisActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3UnidimensionaisActivity.this, Questao2UnidimensionaisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao2 + 1;
            Intent intent = new Intent(Questao3UnidimensionaisActivity.this, Questao4UnidimensionaisActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
            finish();
        }else {
            ponto = pontoquestao2 + 0;
            Intent intent = new Intent(Questao3UnidimensionaisActivity.this, Questao4UnidimensionaisActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
            finish();
        }

    }

}
