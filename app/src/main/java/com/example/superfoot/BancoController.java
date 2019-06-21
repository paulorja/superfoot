package com.example.superfoot;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.content.ContentValues;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class BancoController {

    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoController(Context context){
        banco = new CriaBanco(context);


        db = banco.getWritableDatabase();
        //db.execSQL("DROP TABLE IF EXISTS times");
        //db.execSQL("DROP TABLE IF EXISTS jogadores");
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
        db.execSQL("CREATE TABLE IF NOT EXISTS jogadores "+"("
                + "_id integer primary key autoincrement,"
                + "time_id int,"
                + "nome text,"
                + "forca int,"
                + "idade int,"
                + "energia int,"
                + "chute int,"
                + "posicao_que_joga int,"
                + "posicao_no_time int,"
                + "perna_boa text,"
                + "cartao_vermelho int,"
                + "qtd_gols int"
                +")");
        db.close();

        Time jogador = findJogador();

        db = banco.getWritableDatabase();
        // CRIA DADOS INICIAIS
        if(jogador == null) {
            ContentValues valores = new ContentValues();
            valores.put("nome", "Nome do time");
            valores.put("jogador", "true");
            valores.put("capacidade_estadio", 0);
            valores.put("pontos", 0);
            valores.put("dinheiro", 500000);
            valores.put("formacao", 1);
            valores.put("tatica", 1);
            db.insert("times", null, valores);

            //Jogadores iniciais
            JogadoresIniciais jogadores = new JogadoresIniciais();
            for(Jogador j: jogadores.js) {
                db.insert("jogadores", null, j.insertValues());
            }
        }
        db.close();

    }

    public Time findJogador() {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM times WHERE jogador = ?", new String[] { "true" });
        Time time = null;
        if(cursor.moveToFirst()) {
            time = new Time(
                    cursor.getInt(cursor.getColumnIndexOrThrow("_id")),
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

    public ArrayList<Jogador>  jogadoresVenda() {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM jogadores WHERE time_id = ?", new String[] { "0" });
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        if(cursor.moveToFirst()) {
            do {
                Jogador jogador = new Jogador(
                        cursor.getInt(cursor.getColumnIndexOrThrow("_id")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("time_id")),
                        cursor.getString(cursor.getColumnIndexOrThrow("nome")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("forca")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("idade")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("energia")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("chute")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("posicao_que_joga")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("posicao_no_time")),
                        cursor.getString(cursor.getColumnIndexOrThrow("perna_boa")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("qtd_gols")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("cartao_vermelho"))
                );
                jogadores.add(jogador);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return jogadores;
    }

    public Time[] findTimes() {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM times", null);
        Time[] times = new Time[1];
        if(cursor.moveToFirst()) {
            times[0] = new Time(
                    cursor.getInt(cursor.getColumnIndexOrThrow("_id")),
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

    public void alteraDinheiroTime(int id, int dinheiro) {
        ContentValues valores;
        String where;
        db = banco.getWritableDatabase();
        where = "_id =" + id;
        valores = new ContentValues();
        valores.put("dinheiro", dinheiro);
        db.update("times",valores,where,null);
        db.close();
    }

    public void alteraTimeJogador(int id, int timeId) {
        ContentValues valores;
        String where;
        db = banco.getWritableDatabase();
        where = "_id =" + id;
        valores = new ContentValues();
        valores.put("time_id", timeId);
        db.update("jogadores",valores,where,null);
        db.close();
    }

    public void alteraCapacidadeEstadio(int id, int dinheiro, int capacidadeEstadio) {
        ContentValues valores;
        String where;
        db = banco.getWritableDatabase();
        where = "_id =" + id;
        valores = new ContentValues();
        valores.put("capacidade_estadio", capacidadeEstadio);
        valores.put("dinheiro", dinheiro);
        db.update("times",valores,where,null);
        db.close();
    }

    @NotNull
    public ArrayList<Jogador> jogadoresTime(int id) {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM jogadores WHERE time_id = ? ORDER BY posicao_que_joga", new String[] { Integer.toString(id) });
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        if(cursor.moveToFirst()) {
            do {
                Jogador jogador = new Jogador(
                        cursor.getInt(cursor.getColumnIndexOrThrow("_id")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("time_id")),
                        cursor.getString(cursor.getColumnIndexOrThrow("nome")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("forca")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("idade")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("energia")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("chute")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("posicao_que_joga")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("posicao_no_time")),
                        cursor.getString(cursor.getColumnIndexOrThrow("perna_boa")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("qtd_gols")),
                        cursor.getInt(cursor.getColumnIndexOrThrow("cartao_vermelho"))
                );
                jogadores.add(jogador);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return jogadores;
    }
}