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
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void pseudocodigo(View view){
        Intent intent = new Intent(IntroducaoActivity.this, PseudocodigoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
