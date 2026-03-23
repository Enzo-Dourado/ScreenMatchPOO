package br.com.testesalura.screenmatch.principal;

import br.com.testesalura.screenmatch.modelos.Filmes;
import br.com.testesalura.screenmatch.modelos.Series;
import br.com.testesalura.screenmatch.modelos.Titulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filmes filmeMatrix = new Filmes("The Matrix", 1999);
        filmeMatrix.avalia(7);
        Filmes filmeJohn = new Filmes("John Wick", 2014);
        filmeJohn.avalia(8);
        Filmes filmeVingadores = new Filmes("Vingadores Ultimato", 2019);
        filmeVingadores.avalia(9);
        Filmes filmePeakyBlinders = new Filmes("Peaky Blinders - O homem imortal", 2026);
        filmePeakyBlinders.avalia(10);
        Series serie = new Series("La Casa de Papel", 2017);
        serie.avalia(8);

        ArrayList<Titulos> lista = new ArrayList<>();
        lista.add(filmeMatrix);
        lista.add(filmeJohn);
        lista.add(filmeVingadores);
        lista.add(filmePeakyBlinders);
        lista.add(serie);

        for(Titulos item : lista){
            System.out.println(item);
            if (item instanceof Filmes filme){
                System.out.println("Avaliação: " + filme.getClassificacao() + "*");
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ciliam Murphy");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Tom Cruise");

        System.out.println("Busca por artista: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Busca por artista (Ordenado): " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de Titulos: " + lista);

        lista.sort(Comparator.comparing(Titulos::getAnoDeLancamento));
        System.out.println("Lista de Titulos por Lancamento: " + lista);

    }
}
