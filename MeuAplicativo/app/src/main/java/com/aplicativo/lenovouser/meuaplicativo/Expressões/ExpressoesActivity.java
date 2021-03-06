package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExpressoesActivity extends AppCompatActivity {

    private String emailusuario;
    int pontosparcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expressoes);
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
        Intent intent3 = getIntent();
        Bundle bundle3 = new Bundle();
        bundle3 = intent3.getExtras();
        if (bundle3 != null){
            pontosparcial = bundle3.getInt("pontosparcial");
        }
    }

    public void aritmeticas(View view){
        Intent intent = new Intent(ExpressoesActivity.this, OperadoresAritmeticosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosparcial", pontosparcial);
        startActivity(intent);
        finish();
    }

    public void logicas(View view){
        Intent intent = new Intent(ExpressoesActivity.this, OperadoresRelacionaisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosparcial", pontosparcial);
        startActivity(intent);
        finish();
    }

}
