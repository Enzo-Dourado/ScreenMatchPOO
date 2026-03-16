package Treino;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibiFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("AnoLancamento: " + anoLancamento);

    }
    void avaliaMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;

    }
    double obterMedia() {
        return avaliacao / numAvaliacoes;
    }
}
