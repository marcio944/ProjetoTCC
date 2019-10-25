package com.aplicativo.lenovouser.meuaplicativo.Dados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1PrimitivosActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    private String emailusuario;
    int pontosintroducao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_primitivos);
        radioButton = (RadioButton) findViewById(R.id.radioButton28);
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
        Intent intent = new Intent(Questao1PrimitivosActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosintroducao);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1PrimitivosActivity.this, Primitivos2Activity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosintroducao);
        startActivity(intent);
    }

    public  void proximo(View view){
        if (radioButton.isChecked()){
            ponto = 1;
            Intent intent = new Intent(Questao1PrimitivosActivity.this, Questao2PrimitivosActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontosintroducao", pontosintroducao);
            startActivity(intent);
        }else {
            ponto = 0;
            Intent intent = new Intent(Questao1PrimitivosActivity.this, Questao2PrimitivosActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontosintroducao", pontosintroducao);
            startActivity(intent);
        }
    }

}
