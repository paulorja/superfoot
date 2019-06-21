package com.example.superfoot;

public class Time {

    private String nome;
    private String isJogador;
    private int capacidade_estadio;
    private int pontos;
    private int dinheiro;
    private int formacao;
    private int tatica;

    public Time(String nome, String isJogador, int capacidade_estadio, int pontos, int dinheiro, int formacao, int tatica) {
        this.nome = nome;
        this.isJogador = isJogador;
        this.capacidade_estadio = capacidade_estadio;
        this.pontos = pontos;
        this.dinheiro = dinheiro;
        this.formacao = formacao;
        this.tatica = tatica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsJogador() {
        return isJogador;
    }

    public void setIsJogador(String isJogador) {
        this.isJogador = isJogador;
    }

    public int getCapacidade_estadio() {
        return capacidade_estadio;
    }

    public void setCapacidade_estadio(int capacidade_estadio) {
        this.capacidade_estadio = capacidade_estadio;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getFormacao() {
        return formacao;
    }

    public void setFormacao(int formacao) {
        this.formacao = formacao;
    }

    public int getTatica() {
        return tatica;
    }

    public void setTatica(int tatica) {
        this.tatica = tatica;
    }



}
