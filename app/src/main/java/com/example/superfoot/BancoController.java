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
//        db.execSQL("DROP TABLE IF EXISTS times");
//        db.execSQL("DROP TABLE IF EXISTS jogadores");
//        db.execSQL("DROP TABLE IF EXISTS partidas");
        db.execSQL("CREATE TABLE IF NOT EXISTS partidas "+"("
                + "_id integer primary key autoincrement,"
                + "time_casa int,"
                + "time_convidado int,"
                + "gols_casa int,"
                + "gols_convidado int"
                +")");
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
            valores.put("nome", "NOME DO TIME");
            valores.put("jogador", "true");
            valores.put("capacidade_estadio", 0);
            valores.put("pontos", 0);
            valores.put("dinheiro", 500000);
            valores.put("formacao", 1);
            valores.put("tatica", 1);
            db.insert("times", null, valores);

            ContentValues flamengo = new ContentValues();
            flamengo.put("nome", "Flamengo");
            flamengo.put("jogador", "false");
            flamengo.put("capacidade_estadio", 0);
            flamengo.put("pontos", 0);
            flamengo.put("dinheiro", 500000);
            flamengo.put("formacao", 1);
            flamengo.put("tatica", 1);
            db.insert("times", null, flamengo);

            ContentValues figueirense = new ContentValues();
            figueirense.put("nome", "Figueirense");
            figueirense.put("jogador", "false");
            figueirense.put("capacidade_estadio", 0);
            figueirense.put("pontos", 0);
            figueirense.put("dinheiro", 500000);
            figueirense.put("formacao", 1);
            figueirense.put("tatica", 1);
            db.insert("times", null, figueirense);

            ContentValues avai = new ContentValues();
            avai.put("nome", "Avai");
            avai.put("jogador", "false");
            avai.put("capacidade_estadio", 0);
            avai.put("pontos", 0);
            avai.put("dinheiro", 500000);
            avai.put("formacao", 1);
            avai.put("tatica", 1);
            db.insert("times", null, avai);

            ContentValues sp = new ContentValues();
            sp.put("nome", "Sao Paulo");
            sp.put("jogador", "false");
            sp.put("capacidade_estadio", 0);
            sp.put("pontos", 0);
            sp.put("dinheiro", 500000);
            sp.put("formacao", 1);
            sp.put("tatica", 1);
            db.insert("times", null, sp);

            ContentValues inter = new ContentValues();
            inter.put("nome", "Internacional");
            inter.put("jogador", "false");
            inter.put("capacidade_estadio", 0);
            inter.put("pontos", 0);
            inter.put("dinheiro", 500000);
            inter.put("formacao", 1);
            inter.put("tatica", 1);
            db.insert("times", null, inter);

            ContentValues santos = new ContentValues();
            santos.put("nome", "Santos");
            santos.put("jogador", "false");
            santos.put("capacidade_estadio", 0);
            santos.put("pontos", 0);
            santos.put("dinheiro", 500000);
            santos.put("formacao", 1);
            santos.put("tatica", 1);
            db.insert("times", null, santos);

            ContentValues bahia = new ContentValues();
            bahia.put("nome", "Bahia");
            bahia.put("jogador", "false");
            bahia.put("capacidade_estadio", 0);
            bahia.put("pontos", 0);
            bahia.put("dinheiro", 500000);
            bahia.put("formacao", 1);
            bahia.put("tatica", 1);
            db.insert("times", null, bahia);

            ContentValues gremio = new ContentValues();
            gremio.put("nome", "Gremio");
            gremio.put("jogador", "false");
            gremio.put("capacidade_estadio", 0);
            gremio.put("pontos", 0);
            gremio.put("dinheiro", 500000);
            gremio.put("formacao", 1);
            gremio.put("tatica", 1);
            db.insert("times", null, gremio);

            ContentValues corinthians = new ContentValues();
            corinthians.put("nome", "Corinthians");
            corinthians.put("jogador", "false");
            corinthians.put("capacidade_estadio", 0);
            corinthians.put("pontos", 0);
            corinthians.put("dinheiro", 500000);
            corinthians.put("formacao", 1);
            corinthians.put("tatica", 1);
            db.insert("times", null, corinthians);


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
        Cursor cursor = db.rawQuery("SELECT * FROM jogadores WHERE time_id = ? ORDER BY forca DESC", new String[] { "0" });
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

    public ArrayList<Time> findTimes() {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM times ORDER BY pontos DESC", null);
        ArrayList<Time> times = new ArrayList<Time>();
        if(cursor.moveToFirst()) {
            do {
                Time time = new Time(
                    cursor.getInt(cursor.getColumnIndexOrThrow("_id")),
                    cursor.getString(cursor.getColumnIndexOrThrow("nome")),
                    cursor.getString(cursor.getColumnIndexOrThrow("jogador")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("capacidade_estadio")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("pontos")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("dinheiro")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("formacao")),
                    cursor.getInt(cursor.getColumnIndexOrThrow("tatica"))
                );
                times.add(time);
            } while (cursor.moveToNext());
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

    public Time findTimeById(int id) {
        db = banco.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM times WHERE _id = ?", new String[] { Integer.toString(id) });
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

    public void addPartida(int time_casa_id, int time_convidado_id, int gols_time_casa, int gols_time_convidado) {
        db = banco.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("time_casa", time_casa_id);
        valores.put("time_convidado", time_convidado_id);
        valores.put("gols_casa", gols_time_casa);
        valores.put("gols_convidado", gols_time_convidado);
        db.insert("times", null, valores);
    }

    public void addPontos(int time_id, int pontos) {
        ContentValues valores;
        String where;
        db = banco.getWritableDatabase();
        where = "_id =" + time_id;
        valores = new ContentValues();
        valores.put("pontos", pontos);
        db.update("times",valores,where,null);
        db.close();
    }
}