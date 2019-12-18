package com.aplicativo.lenovouser.meuaplicativo.EntradaSaída;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.R;

public class Questao1EntradaActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    String emailusuario;
    int ponto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1_entrada);
        editText1 = (EditText) findViewById(R.id.editText7);
        editText2 = (EditText) findViewById(R.id.editText8);
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            emailusuario = bundle2.getString("emailusuario");
        }
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao1EntradaActivity.this, MainActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao1EntradaActivity.this, ExemploEntradaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
        finish();
    }

    public void proximo(View view){
        if (editText1.getText().toString().equals("leia") && editText2.getText().toString().equals("leia")){
            ponto = 1;
            Intent intent = new Intent(Questao1EntradaActivity.this, Questao2EntradaActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
        }else {
            ponto = 0;
            Intent intent = new Intent(Questao1EntradaActivity.this, Questao2EntradaActivity.class);
            intent.putExtra("pontoquestao1", ponto);
            intent.putExtra("emailusuario", emailusuario);
            startActivity(intent);
            finish();
        }
    }

}
