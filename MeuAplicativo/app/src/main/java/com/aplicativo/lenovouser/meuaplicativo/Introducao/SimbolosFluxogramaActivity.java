package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class SimbolosFluxogramaActivity extends AppCompatActivity {

    int pontoquestao5conceito;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simbolos_fluxograma);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao5conceito = bundle.getInt("pontoquestao5conceitoalgoritmo");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }

    }

    public void inicio(View view){
        Intent intent = new Intent(SimbolosFluxogramaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(SimbolosFluxogramaActivity.this, ExemploFluxogramaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        Intent intent = new Intent(SimbolosFluxogramaActivity.this, Questao1FluxogramaActivity.class);
        intent.putExtra("pontoquestao5conceitoalgoritmo", pontoquestao5conceito);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
