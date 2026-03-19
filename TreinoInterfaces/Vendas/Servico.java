package TreinoInterfaces.Vendas;

import TreinoInterfaces.Vendas.Interface.Vendavel;

public class Servico implements Vendavel {
    private int quantidade;
    private double preco;
    private double desconto;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }


    @Override
    public void calculaPrecoTotal() {

        preco = preco * quantidade;
        desconto = 0.20;

        if (quantidade >= 4) {
            preco = preco - (preco * desconto);
            System.out.println("Desconto aplicado por compras exceder a quantidade de 5 unidades de serviço!");
            System.out.println("Preco Total: " + preco);
        } else {
            System.out.println("Preco Total: " + preco);
        }

    }



}
