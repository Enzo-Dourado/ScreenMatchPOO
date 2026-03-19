package TreinoInterfaces.Produtos;

import TreinoInterfaces.Produtos.Interface.Calculavel;

public class ProdutoFisico implements Calculavel {
    private double valor;
    private double desconto;

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return valor - (valor * desconto);
    }
}
