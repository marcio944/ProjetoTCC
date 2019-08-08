package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2PseudocodigoActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao1;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_pseudocodigo);
        radioButton = (RadioButton) findViewById(R.id.radioButton25);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao1 = bundle.getInt("pontoquestao1");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2PseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public  void anterior(View view){
        Intent intent = new Intent(Questao2PseudocodigoActivity.this, Questao1PseudocodigoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao1 + 1;
            Intent intent = new Intent(Questao2PseudocodigoActivity.this, Questao3PseudocodigoActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        } else{
            ponto = pontoquestao1 + 0;
            Intent intent = new Intent(Questao2PseudocodigoActivity.this, Questao3PseudocodigoActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

}
