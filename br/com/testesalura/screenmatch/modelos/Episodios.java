package br.com.testesalura.screenmatch.modelos;

import br.com.testesalura.screenmatch.calculadora.Classificavel;

import java.io.Serializable;

public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private Series serie;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    private int totalVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }


    @Override
    public int getClassificacao() {
        if (getTotalVisualizacoes() >= 1000) {
            return 4;
        } else if (getTotalVisualizacoes() >= 500) {
            return 2;
        } else {
            return 1;
        }
    }
}
