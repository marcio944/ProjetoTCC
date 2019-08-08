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
import com.aplicativo.lenovouser.meuaplicativo.Models.PontuacaoModel;
import com.aplicativo.lenovouser.meuaplicativo.Repetição.RepeticaoActivity;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class MainActivity extends AppCompatActivity {

    private static ImageButton ImageButtonDados;
    private static ImageButton ImageButtonExpressoes;
    private static ImageButton ImageButtonEntradaSaida;
    private static ImageButton ImageButtonControle;
    private static ImageButton ImageButtonRepeticao;
    private static ImageButton ImageButtonHomogenias;

    private String emailusuario;
    private String HOST = "http://192.168.42.249/login";
    String pontos;


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
        buscapontosintroducao(emailusuario);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }
        buscapontosintroducao(emailusuario);
    }

    public void buscapontosintroducao(String emailusuario){
        String URL = HOST + "/buscar_pontos_introducao.php";
        Ion.with(MainActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                try {
                    String RETORNO = result.get("BUSCA").getAsString();
                    int pontos = Integer.parseInt(RETORNO);
                    if (pontos >= 13) {
                        ImageButtonDados = (ImageButton) findViewById(R.id.imageButton_Dados);
                        ImageButtonDados.setEnabled(true);
                    }
                } catch (Exception ex){
                    //Toast.makeText(MainActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void introducao(View view){
        Intent intent = new Intent(MainActivity.this, IntroducaoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void dados(View view){
        Intent intent = new Intent(MainActivity.this, DadosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
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
