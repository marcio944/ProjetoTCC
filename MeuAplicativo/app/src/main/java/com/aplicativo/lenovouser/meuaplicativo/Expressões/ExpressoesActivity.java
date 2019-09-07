package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class ExpressoesActivity extends AppCompatActivity {

    private String emailusuario;
    int pontoquestao4aritmeticas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expressoes);
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

    public void aritmeticas(View view){
        Intent intent = new Intent(ExpressoesActivity.this, OperadoresAritmeticosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void logicas(View view){
        Intent intent = new Intent(ExpressoesActivity.this, OperadoresRelacionaisActivity.class);
        intent.putExtra("pontoquestao4aritmeticas", pontoquestao4aritmeticas);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
