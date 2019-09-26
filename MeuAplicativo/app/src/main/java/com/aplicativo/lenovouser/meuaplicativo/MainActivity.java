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
    private String HOST = "http://algoeduc.000webhostapp.com/appalgoeduc";
    String pontos;
    int pontosquestoesintroducao;
    int pontosquestoesexpressoes;
    int pontosquestoesentradasaida;
    int pontosquestoescondicao;


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
        Intent intent1 = getIntent();
        Bundle bundle1 = new Bundle();
        bundle1 = intent1.getExtras();
        if (bundle1 != null){
            pontosquestoesintroducao = bundle1.getInt("pontosquestoesintroducao");
        }
        Intent intent2 = getIntent();
        Bundle bundle2 = new Bundle();
        bundle2 = intent2.getExtras();
        if (bundle2 != null){
            pontosquestoesexpressoes = bundle2.getInt("pontosquestoesexpressoes");
        }
        Intent intent3 = getIntent();
        Bundle bundle3 = new Bundle();
        bundle3 = intent3.getExtras();
        if (bundle3 != null){
            pontosquestoesentradasaida = bundle3.getInt("pontoquestoesentradasaida");
        }
        Intent intent4 = getIntent();
        Bundle bundle4 = new Bundle();
        bundle4 = intent4.getExtras();
        if (bundle4 != null){
            pontosquestoescondicao = bundle4.getInt("pontosquestoescondicao");
        }
        if (pontosquestoesintroducao >= 13){
            ImageButtonDados.setEnabled(true);
        }
        if (pontosquestoesexpressoes >= 5){
            ImageButtonEntradaSaida.setEnabled(true);
        }
        if (pontosquestoesentradasaida >= 5){
            ImageButtonControle.setEnabled(true);
        }
        if (pontosquestoescondicao >= 5){
            ImageButtonRepeticao.setEnabled(true);
        }
        buscapontosintroducao(emailusuario);
        buscapontosdados(emailusuario);
        buscapontosexpressoes(emailusuario);
        buscapontosentradasaida(emailusuario);
        buscapontoscondicao(emailusuario);
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

                }

            }
        });
    }

    public void buscapontosdados(String emailusuario){
        String URL = HOST + "/buscar_pontos_dados.php";
        Ion.with(MainActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
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
    }

    public void buscapontosexpressoes(String emailusuario){
        String URL = HOST + "/buscar_pontos_expressoes.php";
        Ion.with(MainActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
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
    }

    public void buscapontosentradasaida(String emailusuario){
        String URL = HOST + "/buscar_pontos_entradasaida.php";
        Ion.with(MainActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
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
    }

    public void buscapontoscondicao(String emailusuario){
        String URL = HOST + "/buscar_pontos_condicao.php";
        Ion.with(MainActivity.this).load(URL).setBodyParameter("email_app", emailusuario).asJsonObject().setCallback(new FutureCallback<JsonObject>() {
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
        startActivity(intent);
    }

    public void homogenias(View view){
        Intent intent = new Intent(MainActivity.this, HomogeneasActivity.class);
        startActivity(intent);
    }

}
