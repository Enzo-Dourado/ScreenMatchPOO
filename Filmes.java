public class Filmes {
    String nome;
    String produtora;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalAvaliacoes;

    void exibiFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Produtora: " + produtora);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    double obterMedia() {
        return avaliacao / totalAvaliacoes;
    }
}
