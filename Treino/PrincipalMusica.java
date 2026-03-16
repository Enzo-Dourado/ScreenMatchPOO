package Treino;

public class PrincipalMusica {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Carnívoro";
        musica.artista = "MC Lele JP";
        musica.anoLancamento = 2026;

        musica.exibiFichaTecnica();
        musica.avaliaMusica(9);
        musica.avaliaMusica(10);
        musica.avaliaMusica(8.5);

        System.out.println(musica.avaliacao);
        System.out.println(musica.numAvaliacoes);
        System.out.println("Média: " + musica.obterMedia());


    }
}
