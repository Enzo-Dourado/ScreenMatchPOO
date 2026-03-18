package TreinoPolimorfismo.Animais.TipoAnimais;

import TreinoPolimorfismo.Animais.Animal;

public class Gato extends Animal {

    @Override
    public void emitiSom() {
        System.out.println("MIAU MIAU");
    }
}
