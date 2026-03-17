package br.com.testesalura.screenmatch.modelos;

public class Filmes {
    private String nome;
    private String produtora;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalAvaliacoes;

    public void exibiFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Produtora: " + produtora);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    public double obterMedia() {
        return avaliacao / totalAvaliacoes;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }
}
