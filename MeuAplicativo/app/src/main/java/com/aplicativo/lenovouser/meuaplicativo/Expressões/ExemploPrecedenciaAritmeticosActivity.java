package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExemploPrecedenciaAritmeticosActivity extends AppCompatActivity {

    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_precedencia_aritmeticos);
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(ExemploPrecedenciaAritmeticosActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(ExemploPrecedenciaAritmeticosActivity.this, PrecedenciaAritmeticosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(ExemploPrecedenciaAritmeticosActivity.this, Questao1AritmeticasActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }


}
