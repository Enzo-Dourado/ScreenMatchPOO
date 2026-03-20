package br.com.testesalura.screenmatch.modelos;

import br.com.testesalura.screenmatch.calculadora.Classificavel;

public class Filmes extends Titulos implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Filmes(){}
    public Filmes(String nome) {
        this.setNome(nome);
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoDeLancamento() + ")";
    }
}