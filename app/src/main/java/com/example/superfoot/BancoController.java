package com.example.superfoot;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.content.ContentValues;



public class BancoController {

    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoController(Context context){
        banco = new CriaBanco(context);


        db = banco.getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS times");
        db.execSQL("CREATE TABLE IF NOT EXISTS times "+"("
                + "_id integer primary key autoincrement,"
                + "nome text,"
                + "jogador text,"
                + "capacidade_estadio int,"
                + "pontos int,"
                + "dinheiro int,"
                + "formacao int,"
                + "tatica int"
                +")");
        db.close();

        Time jogador = findJogador();

        db = banco.getWritableDatabase();
        // CRIA DADOS INICIAIS
        if(jogador == null) {
            ContentValues valores = new ContentValues();
            valores.put("nome", "Nome do time");
            valores.put("jogador", "true");
            valores.put("capacidade_estadio", 10000);
            valores.put("pontos", 0);
            valores.put("dinheiro", 10);
            valores.put("formacao", 1);
            valores.put("tatica", 1);
            db.insert("times", null, valores);
        }
        db.close();

    }

    public Time findJogador() {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM times WHERE jogador = ?", new String[] { "true" });
        Time time = null;
        if(cursor.moveToFirst()) {
            time = new Time(
                    cursor.getString(cursor.getColumnIndexOrThrow("nome")),
                    cursor.getString(cursor.getColumnIndexOrThrow("jogador")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("capacidade_estadio")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("pontos")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("dinheiro")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("formacao")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("tatica"))
            );
        }
        cursor.close();
        db.close();
        return time;
    }

    public Time[] findTimes() {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM times", null);
        Time[] times = new Time[1];
        if(cursor.moveToFirst()) {
            times[0] = new Time(
                    cursor.getString(cursor.getColumnIndexOrThrow("nome")),
                    cursor.getString(cursor.getColumnIndexOrThrow("jogador")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("capacidade_estadio")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("pontos")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("dinheiro")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("formacao")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("tatica"))
            );
        }
        cursor.close();
        db.close();
        return times;
    }

    public String insereDado(String titulo, String autor, String editora){
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();


        valores = new ContentValues();
        valores.put(CriaBanco.TITULO, titulo);
        valores.put(CriaBanco.AUTOR, autor);
        valores.put(CriaBanco.EDITORA, editora);

        resultado = db.insert(CriaBanco.TABELA, null, valores);
        db.close();

        if (resultado ==-1) {
            return "Erro ao inserir registro";
        } else {
            return "Registro Inserido com sucesso";
        }

    }
}