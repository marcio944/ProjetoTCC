package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class PseudocodigoActivity extends AppCompatActivity {

    int pontoquestao5fluxograma;
    private  String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pseudocodigo);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao5fluxograma = bundle.getInt("pontoquestao5fluxograma");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(PseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(PseudocodigoActivity.this, IntroducaoActivity.class);
        startActivity(intent);
    }

    public  void proximo(View view){
        Intent intent = new Intent(PseudocodigoActivity.this, EstruturaPseudocodigoActivity.class);
        intent.putExtra("pontoquestao5fluxograma", pontoquestao5fluxograma);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
