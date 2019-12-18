package com.aplicativo.lenovouser.meuaplicativo.Expressões;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1AritmeticasActivity extends AppCompatActivity {

    EditText editText;
    int ponto;
    private String emailusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_aritmeticas);
        editText = (EditText) findViewById(R.id.editText13);
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            emailusuario = bundle1.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1AritmeticasActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1AritmeticasActivity.this, ExemploPrecedenciaAritmeticosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if(editText.getText().toString().equals("8")) {
            ponto = ponto + 1;
            Intent intent = new Intent(Questao1AritmeticasActivity.this, Questao2AritmeticasActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
        }else{
            ponto = ponto + 0;
            Intent intent = new Intent(Questao1AritmeticasActivity.this, Questao2AritmeticasActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
        }
    }

}
