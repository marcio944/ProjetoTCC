package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExemploLogicasCompostasActivity extends AppCompatActivity {

    int pontoquestao4aritmeticas;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_logicas_compostas);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestao4aritmeticas = bundle.getInt("pontoquestao4aritmeticas");
        }
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(ExemploLogicasCompostasActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(ExemploLogicasCompostasActivity.this, ExemploLogicasSimplesActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploLogicasCompostasActivity.this, Questao1LogicasRelacionaisActivity.class);
        intent.putExtra("pontoquestao4aritmeticas", pontoquestao4aritmeticas);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }


}
