package com.example.superfoot;

import org.jetbrains.annotations.Nullable;

public class Time {

    private int id;
    private String nome;
    private String isJogador;
    private int pontos;
    private int dinheiro;
    private int formacao;
    private int tatica;
    private int capacidadeEstadio;
    private int capacidadeEstadioTotal;

    public Time(int id, String nome, String isJogador, int capacidade_estadio, int pontos, int dinheiro, int formacao, int tatica) {
        this.id = id;
        this.nome = nome;
        this.isJogador = isJogador;
        this.capacidadeEstadio = capacidade_estadio;
        this.pontos = pontos;
        this.dinheiro = dinheiro;
        this.formacao = formacao;
        this.tatica = tatica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCapacidadeEstadio() {
        return capacidadeEstadio;
    }

    public void setCapacidadeEstadio(int capacidade_estadio) {
        this.capacidadeEstadio = capacidade_estadio;
    }

    public int getCapacidadeEstadioTotal() {
        return 10000 + capacidadeEstadio*1000;
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
