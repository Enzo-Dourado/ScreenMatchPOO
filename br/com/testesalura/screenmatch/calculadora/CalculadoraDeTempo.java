package br.com.testesalura.screenmatch.calculadora;

import br.com.testesalura.screenmatch.modelos.Titulos;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void inclui(Titulos titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

}

