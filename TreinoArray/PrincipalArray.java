package TreinoArray;

import TreinoArray.Pessoa.Pessoa;

import java.util.ArrayList;

public class PrincipalArray {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        p1.setNome( "Fulano" );
        p1.setIdade( 18 );

        Pessoa p2 = new Pessoa();
        p2.setNome( "Maria" );
        p2.setIdade( 19 );

        Pessoa p3 = new Pessoa();
        p3.setNome( "Juan" );
        p3.setIdade( 20 );

        listaPessoa.add(p1);
        listaPessoa.add(p2);
        listaPessoa.add(p3);

        System.out.println("Tamanho da Lista: " + listaPessoa.size());
        System.out.println("Primeira Pessoa: " +  listaPessoa.getFirst().getNome());
        System.out.println("Lista completa: " + listaPessoa);
    }
}
