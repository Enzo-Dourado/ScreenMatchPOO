package TreinoPoo.br.com.teste.poo;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicaDesconto(int desconto) {
        double valorDesconto = (double)desconto / 100;
        preco = preco - (preco * valorDesconto);
        System.out.println("Preço com desconto: " + preco);
    }
}
