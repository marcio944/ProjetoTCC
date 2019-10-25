package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao5PrimitivosActivity extends AppCompatActivity {

    RadioButton radioButton;
    private String emailusuario;
    int pontoquestao4;
    int ponto;
    int pontosintroducao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5_primitivos);
        radioButton = (RadioButton) findViewById(R.id.radioButton58);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao4 = bundle.getInt("pontoquestao4");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
        Intent intent3 = getIntent();
        Bundle bundle3 = new Bundle();
        bundle3 = intent3.getExtras();
        if (bundle3 != null){
            pontosintroducao = bundle3.getInt("pontosintroducao");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao5PrimitivosActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosintroducao);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao5PrimitivosActivity.this, Questao4PrimitivosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosintroducao);
        startActivity(intent);
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao4 + 1;
            pontosintroducao = pontosintroducao + ponto;
            Intent intent = new Intent(Questao5PrimitivosActivity.this, DadosActivity.class);
            intent.putExtra("pontoquestao5primitivos", ponto);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontosparcial", pontosintroducao);
            startActivity(intent);
        }else {
            ponto = pontoquestao4 + 0;
            pontosintroducao = pontosintroducao + ponto;
            Intent intent = new Intent(Questao5PrimitivosActivity.this, DadosActivity.class);
            intent.putExtra("pontoquestao5primitivos", ponto);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontosparcial", pontosintroducao);
            startActivity(intent);
        }
    }

}
