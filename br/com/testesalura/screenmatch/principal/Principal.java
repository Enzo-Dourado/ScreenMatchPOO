package br.com.testesalura.screenmatch.principal;

import br.com.testesalura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.testesalura.screenmatch.calculadora.FiltroRecomendacao;
import br.com.testesalura.screenmatch.modelos.Episodios;
import br.com.testesalura.screenmatch.modelos.Filmes;
import br.com.testesalura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filmes favorito = new Filmes("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.avalia(6.5);

        Filmes outro = new Filmes("John Wick", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);
        outro.avalia(8.5);

        Filmes outroFilme = new Filmes("Vingadores Ultimato", 2019);
        outroFilme.setDuracaoEmMinutos(180);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.avalia(10);

        Filmes filmeConstrutor = new Filmes("Peaky Blinders - O homem imortal", 2026);

        Series serie = new Series("La Casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro  = new FiltroRecomendacao();
        Episodios episodio  = new Episodios();

        episodio.setNome("x");
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(1000);
        filtro.filtra(episodio);

        ArrayList<Filmes> listaFilmes = new ArrayList<>();
        listaFilmes.add(favorito);
        listaFilmes.add(outro);
        listaFilmes.add(outroFilme);
        listaFilmes.add(filmeConstrutor);

        System.out.println("Tamanho da Lista: " + listaFilmes.size());
        System.out.println("Filme da Primeira Posição: " + listaFilmes.getFirst().getNome());
        System.out.println("Filme da Ultima Posição: " + listaFilmes.getLast().getNome());
        System.out.println(listaFilmes);
        System.out.println("toString do Filme: " + listaFilmes.getFirst().toString());
    }
}
