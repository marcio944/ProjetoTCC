package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.R;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class IntroducaoActivity extends AppCompatActivity {

    Button button;
    int pontoquestao5conceito;
    int pontoquestao5fluxograma;
    private String emailusuario;

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
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void conceitoAlgoritmo(View view){
        Intent intent = new Intent(this,ConceitoAlgoritmoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void fluxograma(View view){
        Intent intent = new Intent(IntroducaoActivity.this, FluxogramaActivity.class);
        intent.putExtra("pontoquestao5conceitoalgoritmo", pontoquestao5conceito);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void pseudocodigo(View view){
        Intent intent = new Intent(IntroducaoActivity.this, PseudocodigoActivity.class);
        intent.putExtra("pontoquestao5fluxograma", pontoquestao5fluxograma);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
