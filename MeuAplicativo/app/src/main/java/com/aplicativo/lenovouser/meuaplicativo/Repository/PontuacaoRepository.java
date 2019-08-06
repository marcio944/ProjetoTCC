package com.aplicativo.lenovouser.meuaplicativo.Repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.aplicativo.lenovouser.meuaplicativo.Models.PontuacaoModel;

public class PontuacaoRepository extends SQLiteOpenHelper {

    private static final String DATABASE = "Aplicativo";
    private static final String TABELA = "pontuacao";
    private Context contexto;

    public PontuacaoRepository(Context context) {
        super(context, DATABASE, null, 9);
        contexto = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            String sql = "CREATE TABLE pontuacao (" +
                    "id INTEGER PRIMARY KEY NOT NULL," +
                    "topico TEXT NOT NULL ," +
                    "pontos INTEGER NOT NULL," +
                    "CONSTRAINT email_unique UNIQUE(email));";
            db.execSQL(sql);
            Toast.makeText(PontuacaoRepository.this.contexto, "Tabela criada com sucesso", Toast.LENGTH_LONG).show();
        }catch (SQLException ex){
            Toast.makeText(PontuacaoRepository.this.contexto, "Erro ao criar tabela: "+ex, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS " + TABELA;
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(PontuacaoModel pontuacaoModel){
        ContentValues contentValues = new ContentValues();
        contentValues.put("email", pontuacaoModel.getTopico());
        contentValues.put("senha", pontuacaoModel.getPontos());
        getWritableDatabase().insert(TABELA,null,contentValues);
        getWritableDatabase().close();
    }

}
