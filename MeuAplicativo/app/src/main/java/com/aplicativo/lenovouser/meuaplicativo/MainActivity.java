package com.aplicativo.lenovouser.meuaplicativo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Condicao.CondicaoActivity;
import com.aplicativo.lenovouser.meuaplicativo.Dados.DadosActivity;
import com.aplicativo.lenovouser.meuaplicativo.EntradaSaída.EntradaSaidaActivity;
import com.aplicativo.lenovouser.meuaplicativo.Expressões.ExpressoesActivity;
import com.aplicativo.lenovouser.meuaplicativo.Homogêneas.HomogeneasActivity;
import com.aplicativo.lenovouser.meuaplicativo.Introducao.IntroducaoActivity;
import com.aplicativo.lenovouser.meuaplicativo.Models.PontuacaoModel;
import com.aplicativo.lenovouser.meuaplicativo.Repetição.RepeticaoActivity;

import com.aplicativo.lenovouser.meuaplicativo.Usuário.LoginActivity;
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
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";
    String pontos;
    int pontosquestoesintroducao;

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

        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        if (bundle != null){
            emailusuario = bundle.getString("emailusuario");
        }

        String URL = HOST + "/buscar_pontos_introducao.php";
            Ion.with(MainActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                @Override
                public void onCompleted(Exception e, JsonObject result) {
                    try {
                        String RETORNO = result.get("BUSCA").getAsString();
                        int pontos = Integer.parseInt(RETORNO);
                        if (pontos >= 12) {
                            ImageButtonDados = (ImageButton) findViewById(R.id.imageButton_Dados);
                            ImageButtonDados.setEnabled(true);
                        }
                    } catch (Exception ex){

                    }

                }
            });

        String URL1 = HOST + "/buscar_pontos_dados.php";
        Ion.with(MainActivity.this).load(URL1).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                try {
                    String RETORNO = result.get("BUSCA").getAsString();
                    int pontos = Integer.parseInt(RETORNO);
                    if (pontos >= 11) {
                        ImageButtonExpressoes = (ImageButton) findViewById(R.id.imageButton_Expressoes);
                        ImageButtonExpressoes.setEnabled(true);
                    }
                } catch (Exception ex){
                    //Toast.makeText(MainActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                }

            }
        });

        String URL2 = HOST + "/buscar_pontos_expressoes.php";
        Ion.with(MainActivity.this).load(URL2).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                try {
                    String RETORNO = result.get("BUSCA").getAsString();
                    int pontos = Integer.parseInt(RETORNO);
                    if (pontos >= 5) {
                        ImageButtonEntradaSaida = (ImageButton) findViewById(R.id.imageButton9);
                        ImageButtonEntradaSaida.setEnabled(true);
                    }
                } catch (Exception ex){
                    //Toast.makeText(MainActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                }

            }
        });

        String URL3 = HOST + "/buscar_pontos_entradasaida.php";
        Ion.with(MainActivity.this).load(URL3).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                try {
                    String RETORNO = result.get("BUSCA").getAsString();
                    int pontos = Integer.parseInt(RETORNO);
                    if (pontos >= 5) {
                        ImageButtonControle = (ImageButton) findViewById(R.id.imageButton_Condicao);
                        ImageButtonControle.setEnabled(true);
                    }
                } catch (Exception ex){
                    //Toast.makeText(MainActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                }

            }
        });

        String URL4 = HOST + "/buscar_pontos_condicao.php";
        Ion.with(MainActivity.this).load(URL4).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                try {
                    String RETORNO = result.get("BUSCA").getAsString();
                    int pontos = Integer.parseInt(RETORNO);
                    if (pontos >= 5) {
                        ImageButtonRepeticao = (ImageButton) findViewById(R.id.imageButton_Repeticao);
                        ImageButtonRepeticao.setEnabled(true);
                    }
                } catch (Exception ex){
                    //Toast.makeText(MainActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                }

            }
        });

        String URL5 = HOST + "/buscar_pontos_repeticao.php";
        Ion.with(MainActivity.this).load(URL5).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
            @Override
            public void onCompleted(Exception e, JsonObject result) {
                try {
                    String RETORNO = result.get("BUSCA").getAsString();
                    int pontos = Integer.parseInt(RETORNO);
                    if (pontos >= 9) {
                        ImageButtonHomogenias = (ImageButton) findViewById(R.id.imageButton31);
                        ImageButtonHomogenias.setEnabled(true);
                    }
                } catch (Exception ex){
                    //Toast.makeText(MainActivity.this, "Erro: " + ex, Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sair:
                Intent i = new Intent(this, LoginActivity.class);
                this.startActivity(i);
                this.finish();
                return true;
            case R.id.pontuacao_total:
                String URL = HOST + "/buscar_pontuacaototal.php";
                Ion.with(MainActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
                    @Override
                    public void onCompleted(Exception e, JsonObject result) {
                        try {
                            String RETORNO = result.get("BUSCA").getAsString();
                            int pontos = Integer.parseInt(RETORNO);
                            if (pontos > 0) {
                                Intent intent = new Intent(MainActivity.this, PontuacaoTotalActivity.class);
                                intent.putExtra("emailusuario", emailusuario);
                                startActivity(intent);
                            }
                        } catch (Exception ex){

                        }

                    }
                });
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void introducao(View view){
        Intent intent = new Intent(MainActivity.this, IntroducaoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void dados(View view){
        Intent intent = new Intent(MainActivity.this, DadosActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        intent.putExtra("pontosintroducao", pontosquestoesintroducao);
        startActivity(intent);
    }

    public void operadoresexpressoes(View view){
        Intent intent = new Intent(MainActivity.this, ExpressoesActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void entradasaida(View view){
        Intent intent = new Intent(MainActivity.this, EntradaSaidaActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void condicao(View view){
        Intent intent = new Intent(MainActivity.this, CondicaoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void repeticao(View view){
        Intent intent = new Intent(MainActivity.this, RepeticaoActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

    public void homogenias(View view){
        Intent intent = new Intent(MainActivity.this, HomogeneasActivity.class);
        intent.putExtra("emailusuario", emailusuario);
        startActivity(intent);
    }

}
