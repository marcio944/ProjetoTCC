package com.aplicativo.lenovouser.meuaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Condicao.CondicaoActivity;
import com.aplicativo.lenovouser.meuaplicativo.Dados.DadosActivity;
import com.aplicativo.lenovouser.meuaplicativo.EntradaSaída.EntradaSaidaActivity;
import com.aplicativo.lenovouser.meuaplicativo.Expressões.ExpressoesActivity;
import com.aplicativo.lenovouser.meuaplicativo.Homogêneas.HomogeneasActivity;
import com.aplicativo.lenovouser.meuaplicativo.Introducao.IntroducaoActivity;
import com.aplicativo.lenovouser.meuaplicativo.Repetição.RepeticaoActivity;

import com.google.firebase.auth.FirebaseAuth;
import  com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static ImageButton ImageButtonDados;
    private static ImageButton ImageButtonExpressoes;
    private static ImageButton ImageButtonEntradaSaida;
    private static ImageButton ImageButtonControle;
    private static ImageButton ImageButtonRepeticao;
    private static ImageButton ImageButtonHomogenias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButtonDados = (ImageButton) findViewById(R.id.imageButton_Dados);
        ImageButtonDados.setEnabled(false);
        ImageButtonExpressoes = (ImageButton) findViewById(R.id.imageButton_Expressoes);
        ImageButtonExpressoes.setEnabled(false);
        ImageButtonEntradaSaida = (ImageButton) findViewById(R.id.imageButton9);
        ImageButtonEntradaSaida.setEnabled(false);
        ImageButtonControle = (ImageButton) findViewById(R.id.imageButton_Condicao);
        ImageButtonControle.setEnabled(false);
        ImageButtonRepeticao = (ImageButton) findViewById(R.id.imageButton_Repeticao);
        ImageButtonRepeticao.setEnabled(false);
        ImageButtonHomogenias = (ImageButton) findViewById(R.id.imageButton31);
        ImageButtonHomogenias.setEnabled(false);
    }

    public void introducao(View view){
        Intent intent = new Intent(MainActivity.this, IntroducaoActivity.class);
        startActivity(intent);
    }

    public void dados(View view){
        Intent intent = new Intent(MainActivity.this, DadosActivity.class);
        startActivity(intent);
    }

    public void operadoresexpressoes(View view){
        Intent intent = new Intent(MainActivity.this, ExpressoesActivity.class);
        startActivity(intent);
    }

    public void entradasaida(View view){
        Intent intent = new Intent(MainActivity.this, EntradaSaidaActivity.class);
        startActivity(intent);
    }

    public void condicao(View view){
        Intent intent = new Intent(MainActivity.this, CondicaoActivity.class);
        startActivity(intent);
    }

    public void repeticao(View view){
        Intent intent = new Intent(MainActivity.this, RepeticaoActivity.class);
        startActivity(intent);
    }

    public void homogenias(View view){
        Intent intent = new Intent(MainActivity.this, HomogeneasActivity.class);
        startActivity(intent);
    }

}
