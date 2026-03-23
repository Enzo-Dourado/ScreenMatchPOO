package TreinoListas;

import TreinoListas.Titulo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalLista {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Lucas");
        Titulo titulo2 = new Titulo("João");
        Titulo titulo3 = new Titulo("Maria");
        Titulo titulo4 = new Titulo("Andre");


        List<Titulo> listaTitulos = new LinkedList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);

        Collections.sort(listaTitulos);
        System.out.println("Lista de Titulos: " + listaTitulos);

    }
}
