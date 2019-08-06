package com.aplicativo.lenovouser.meuaplicativo.Introducao;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.MainActivity;
import com.aplicativo.lenovouser.meuaplicativo.Models.PontuacaoModel;
import com.aplicativo.lenovouser.meuaplicativo.R;
import com.aplicativo.lenovouser.meuaplicativo.Usuário.LoginActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.UUID;

public class Questao5PseudocodigoActivity extends AppCompatActivity {

    RadioButton radioButton;
    int ponto;
    int pontoquestao4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao5_pseudocodigo);
        radioButton = (RadioButton) findViewById(R.id.radioButton26);
        Intent intent = getIntent();
        Bundle bundle = new Bundle();
        bundle = intent.getExtras();
        pontoquestao4 = bundle.getInt("pontoquestao4");
    }

    public void inicio(View view){
        Intent intent = new Intent(Questao5PseudocodigoActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void anterior(View view){
        Intent intent = new Intent(Questao5PseudocodigoActivity.this, Questao4PseudocodigoActivity.class);
        startActivity(intent);
    }

    public void proximo(View view){
        if(radioButton.isChecked()){
            ponto = pontoquestao4 + 1;
            PontuacaoModel pontuacaoModel = new PontuacaoModel();
            pontuacaoModel.setIdPontuacao(UUID.randomUUID().toString());
            pontuacaoModel.setTopico("introducao");
            pontuacaoModel.setPontos(ponto);
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            final DatabaseReference databaseReference = database.getReference();
            databaseReference.child("pontuacao").child(pontuacaoModel.getIdPontuacao()).setValue(pontuacaoModel);
            Toast.makeText(Questao5PseudocodigoActivity.this, "Resposta correta!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao5PseudocodigoActivity.this, IntroducaoActivity.class);
            startActivity(intent);
        }else{
            ponto = pontoquestao4 + 0;
            PontuacaoModel pontuacaoModel = new PontuacaoModel();
            pontuacaoModel.setIdPontuacao(UUID.randomUUID().toString());
            pontuacaoModel.setTopico("introducao");
            pontuacaoModel.setPontos(ponto);
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            final DatabaseReference databaseReference = database.getReference();
            databaseReference.child("pontuacao").child(pontuacaoModel.getIdPontuacao()).setValue(pontuacaoModel);
            Toast.makeText(Questao5PseudocodigoActivity.this, "Resposta errada!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Questao5PseudocodigoActivity.this, IntroducaoActivity.class);
            startActivity(intent);
        }
    }

}
