package TreinoPolimorfismo;

import TreinoPolimorfismo.Animais.TipoAnimais.Cachorro;
import TreinoPolimorfismo.Animais.TipoAnimais.Gato;

public class PrincipalTestes {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.emitiSom();

        Gato g = new Gato();
        g.emitiSom();
    }
}
