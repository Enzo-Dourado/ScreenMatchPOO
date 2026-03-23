package TreinoCastingObjetos.ArrayListForEach;

import java.util.ArrayList;

public class ArrayForEach {
    public static void main(String[] args) {
        ArrayList<String>nomes = new ArrayList<>();

        nomes.add("Juanito");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Jose");
        nomes.add("Enzo");
        nomes.add("Lucas");

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
