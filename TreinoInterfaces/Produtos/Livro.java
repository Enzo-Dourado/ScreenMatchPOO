package TreinoInterfaces.Produtos;

import TreinoInterfaces.Produtos.Interface.Calculavel;

public class Livro implements Calculavel {
    private double valor;
    private double taxaAdicional;

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        return valor + (valor * taxaAdicional);
    }
}
