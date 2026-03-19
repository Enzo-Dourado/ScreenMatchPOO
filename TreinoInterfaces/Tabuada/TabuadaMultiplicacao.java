package TreinoInterfaces.Tabuada;

import TreinoInterfaces.Tabuada.Interface.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {
    private int numero;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostraTabuada() {
        for (int i = 0; i < 10; i++) {
            int tabuada = numero * i;
            System.out.println("Tabuada: " + tabuada);
        }
    }
}
