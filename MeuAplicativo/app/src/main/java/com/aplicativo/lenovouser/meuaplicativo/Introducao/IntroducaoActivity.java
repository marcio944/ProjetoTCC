package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.R;

public class IntroducaoActivity extends AppCompatActivity {

    Button button;
    int pontoquestao5conceito;
    int pontoquestao5fluxograma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducao);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            pontoquestao5conceito = bundle.getInt("pontoquestao5conceitoalgoritmo");
        }
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            pontoquestao5fluxograma = bundle1.getInt("pontoquestao5fluxograma");
        }
    }

    public void conceitoAlgoritmo(View view){
        Intent intent = new Intent(this,ConceitoAlgoritmoActivity.class);
        startActivity(intent);
    }

    public void partesAlgoritmo(View view){
        Intent intent = new Intent(IntroducaoActivity.this, PartesAlgoritmoActivity.class);
        startActivity(intent);
    }

    public void fluxograma(View view){
        Intent intent = new Intent(IntroducaoActivity.this, FluxogramaActivity.class);
        intent.putExtra("pontoquestao5conceitoalgoritmo", pontoquestao5conceito);
        startActivity(intent);
    }

    public void pseudocodigo(View view){
        Intent intent = new Intent(IntroducaoActivity.this, PseudocodigoActivity.class);
        intent.putExtra("pontoquestao5fluxograma", pontoquestao5fluxograma);
        startActivity(intent);
    }

}
