package TreinoPolimorfismo.Animais.TipoAnimais;

import TreinoPolimorfismo.Animais.Animal;

public class Cachorro extends Animal {
    @Override
    public void emitiSom() {
        System.out.println("AU AU AU AU");
    }
}
