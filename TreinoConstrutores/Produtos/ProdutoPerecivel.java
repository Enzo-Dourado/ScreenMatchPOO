package TreinoConstrutores.Produtos;


public class ProdutoPerecivel extends Produtos {
    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public int getDataValidade() {
        return dataValidade;
    }


}
