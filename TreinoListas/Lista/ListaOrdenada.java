package TreinoListas.Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada {
    public static void main(String[] args) {
        List<Integer> listaOrdenada = new ArrayList<>();

        listaOrdenada.add(1);
        listaOrdenada.add(2);
        listaOrdenada.add(3);
        listaOrdenada.add(4);
        listaOrdenada.add(5);
        listaOrdenada.add(6);
        listaOrdenada.add(7);
        listaOrdenada.add(8);
        listaOrdenada.add(9);
        listaOrdenada.add(10);
        listaOrdenada.add(11);
        listaOrdenada.add(12);
        listaOrdenada.add(13);
        listaOrdenada.add(14);

        Collections.sort(listaOrdenada);
        System.out.println("Lista Ordenada (crescente): " + listaOrdenada);
        Collections.sort(listaOrdenada.reversed());
        System.out.println("Lista Ordenada (decrescente): " + listaOrdenada);
    }
}
