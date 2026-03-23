package TreinoConstrutores;

import TreinoConstrutores.Produtos.ProdutoPerecivel;
import TreinoConstrutores.Produtos.Produtos;

import java.util.ArrayList;

public class PrincipalProdutos {
    public static void main(String[] args) {
        var prod01  = new Produtos("Iphone 17 Pro Max", 15000, 1);
        var prod02 = new Produtos("RTX 5090 NVidea", 20000, 1);
        var prod03 = new Produtos("Mouse ViperMini Razer", 800, 4);
        var prod04 = new ProdutoPerecivel("Patinho Moído", 25.90, 1, 15042026);

        ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
        listaProdutos.add(prod01);
        listaProdutos.add(prod02);
        listaProdutos.add(prod03);
        listaProdutos.add(prod04);

        System.out.println("Tamanho da lista de produtos: " + listaProdutos.size());
        System.out.println("Recuperando segundo produto: " + listaProdutos.get(1).getNome() + ", preço: " + listaProdutos.get(1).getPreco());
        System.out.println("Lista de Produtos: " + listaProdutos);
    }
}
