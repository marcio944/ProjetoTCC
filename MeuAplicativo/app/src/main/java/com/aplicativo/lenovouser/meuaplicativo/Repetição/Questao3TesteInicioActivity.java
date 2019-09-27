package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3TesteInicioActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao2;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_teste_inicio);
        radioButton = (RadioButton) findViewById(R.id.radioButton80);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao2 = bundle.getInt("pontoquestao2");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3TesteInicioActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3TesteInicioActivity.this, Questao2TesteInicioActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao2 + 1;
            Intent intent = new Intent(Questao3TesteInicioActivity.this, Questao4TesteInicioActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
        }else{
            ponto = pontoquestao2 + 0;
            Intent intent = new Intent(Questao3TesteInicioActivity.this, Questao4TesteInicioActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao3", ponto);
            startActivity(intent);
        }
    }

}
