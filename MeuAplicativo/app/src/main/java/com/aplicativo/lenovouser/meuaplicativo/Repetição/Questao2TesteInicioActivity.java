package com.aplicativo.lenovouser.meuaplicativo.Repetição;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2TesteInicioActivity extends AppCompatActivity {

    RadioButton radioButton;
    String emailusuario;
    int pontoquestao1;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_teste_inicio);
        radioButton = (RadioButton) findViewById(R.id.radioButton75);
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
        Intent intent = new Intent(Questao2TesteInicioActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2TesteInicioActivity.this, Questao1TesteInicioActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao1 + 1;
            Intent intent = new Intent(Questao2TesteInicioActivity.this, Questao3TesteInicioActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
            finish();
        }else{
            ponto = pontoquestao1 = 0;
            Intent intent = new Intent(Questao2TesteInicioActivity.this, Questao3TesteInicioActivity.class);
            intent.putExtra("emailusuario", emailusuario);
            intent.putExtra("pontoquestao2", ponto);
            startActivity(intent);
            finish();
        }
    }

}
