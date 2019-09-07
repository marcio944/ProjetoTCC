package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao2RelacionaisLogicasActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao1;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2_relacionais_logicas);
        radioButton = (RadioButton) findViewById(R.id.radioButton129);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao1 = bundle.getInt("pontoquestao1");
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao2RelacionaisLogicasActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao2RelacionaisLogicasActivity.this, Questao1LogicasRelacionaisActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()) {
            ponto = pontoquestao1 + 1;
            Intent intent = new Intent(Questao2RelacionaisLogicasActivity.this, Questao3RelacionaisLogicasActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }else{
            ponto = pontoquestao1 + 0;
            Intent intent = new Intent(Questao2RelacionaisLogicasActivity.this, Questao3RelacionaisLogicasActivity.class);
            intent.putExtra("pontoquestao2", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
        }
    }

}
