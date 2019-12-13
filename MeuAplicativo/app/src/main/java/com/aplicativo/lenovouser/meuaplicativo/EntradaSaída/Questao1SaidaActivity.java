package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1SaidaActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestoesentrada;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_saida);
        radioButton = (RadioButton) findViewById(R.id.radioButton111);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestoesentrada = bundle.getInt("pontoquestoesentrada");
        }
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1SaidaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1SaidaActivity.this, ExemploSaidaActivity.class);
        intent.putExtra("pontoquestoesentrada", pontoquestoesentrada);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestoesentrada + 1;
            Intent intent = new Intent(Questao1SaidaActivity.this, Questao2SaidaActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }else{
            ponto = pontoquestoesentrada + 0;
            Intent intent = new Intent(Questao1SaidaActivity.this, Questao2SaidaActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

}
