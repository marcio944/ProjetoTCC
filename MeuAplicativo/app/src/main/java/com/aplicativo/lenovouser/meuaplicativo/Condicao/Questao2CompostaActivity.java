package com.aplicativo.lenovouser.meuaplicativo.Condicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2CompostaActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao1;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_composta);
        radioButton = (RadioButton) findViewById(R.id.radioButton97);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            pontoquestao1 = bundle.getInt("pontoquestao1");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2CompostaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2CompostaActivity.this, Questao1CompostaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if (radioButton.isChecked()){
            ponto = pontoquestao1 + 1;
            Intent intent = new Intent(Questao2CompostaActivity.this, Questao3CondicaoCompostaActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
        }else{
            Intent intent = new Intent(Questao2CompostaActivity.this, Questao3CondicaoCompostaActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
        }
    }

}
