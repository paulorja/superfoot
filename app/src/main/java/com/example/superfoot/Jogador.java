package com.example.superfoot;

import android.content.ContentValues;

public class Jogador {

    private int id;
    private int timeId;
    private String nome;
    private int forca;
    private int idade;
    private int energia;
    private int chute;
    private int posicaoQueJoga;
    private int posicaoNoTime;
    private String pernaBoa;
    private int qtdGols;
    private int cartaoVermelho;

    public Jogador(int id, int timeId, String nome, int forca, int idade, int energia, int chute, int posicaoQueJoga, int posicaoNoTime, String pernaBoa, int qtdGols, int cartaoVermelho) {
        this.id = id;
        this.timeId = timeId;
        this.nome = nome;
        this.forca = forca;
        this.idade = idade;
        this.energia = energia;
        this.chute = chute;
        this.posicaoQueJoga = posicaoQueJoga;
        this.posicaoNoTime = posicaoNoTime;
        this.pernaBoa = pernaBoa;
        this.qtdGols = qtdGols;
        this.cartaoVermelho = cartaoVermelho;
    }

    public ContentValues insertValues() {
        ContentValues j = new ContentValues();
        j.put("time_id", timeId);
        j.put("nome", nome);
        j.put("forca", forca);
        j.put("idade", idade);
        j.put("energia", energia);
        j.put("chute", chute);
        j.put("posicao_que_joga", posicaoQueJoga);
        j.put("posicao_no_time", posicaoNoTime);
        j.put("perna_boa", pernaBoa);
        j.put("qtd_gols", qtdGols);
        j.put("cartao_vermelho", cartaoVermelho);
        return j;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getChute() {
        return chute;
    }

    public void setChute(int chute) {
        this.chute = chute;
    }

    public int getPosicaoQueJoga() {
        return posicaoQueJoga;
    }

    public void setPosicaoQueJoga(int posicaoQueJoga) {
        this.posicaoQueJoga = posicaoQueJoga;
    }

    public int getPosicaoNoTime() {
        return posicaoNoTime;
    }

    public void setPosicaoNoTime(int posicaoNoTime) {
        this.posicaoNoTime = posicaoNoTime;
    }

    public String getPernaBoa() {
        return pernaBoa;
    }

    public void setPernaBoa(String pernaBoa) {
        this.pernaBoa = pernaBoa;
    }

    public int getQtdGols() {
        return qtdGols;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols = qtdGols;
    }

    public int getCartaoVermelho() {
        return cartaoVermelho;
    }

    public void setCartaoVermelho(int cartaoVermelho) {
        this.cartaoVermelho = cartaoVermelho;
    }

    public int getPreco() {
        Double potencia = Math.pow(forca, 1.4);
        return potencia.intValue() * 1000;
    }
}
