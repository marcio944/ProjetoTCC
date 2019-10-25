package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao3PseudocodigoActivity extends AppCompatActivity {

    EditText editText;
    int ponto;
    int pontoquestao2;
    private String emailusuario;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3_pseudocodigo);
        radioButton = (RadioButton) findViewById(R.id.radioButton162);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao2 = bundle.getInt("pontoquestao2");
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao3PseudocodigoActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao2 + 1;
            Intent intent = new Intent(Questao3PseudocodigoActivity.this, Questao4PseudocodigoActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }else{
            ponto = pontoquestao2 + 0;
            Intent intent = new Intent(Questao3PseudocodigoActivity.this, Questao4PseudocodigoActivity.class);
            intent.putExtra("pontoquestao3", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao3PseudocodigoActivity.this, Questao2PseudocodigoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
