package TreinoCastingObjetos;

import TreinoCastingObjetos.Animal.Animal;
import TreinoCastingObjetos.Animal.Cachorro;
import TreinoCastingObjetos.ContaBancaria.ContaBancaria;
import TreinoCastingObjetos.Formas.Circulo;
import TreinoCastingObjetos.Formas.Forma;
import TreinoCastingObjetos.Formas.Quadrado;
import TreinoCastingObjetos.Produtos.Produto;

import java.util.ArrayList;

public class PrincipalCasting {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Tobias");
        Cachorro c1 = new Cachorro("Juanito");
        Cachorro c2 = new Cachorro("Roger");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(c1);
        animais.add(c2);
        animais.add(c);

        for(Animal animal: animais) {
            if(animal instanceof Cachorro cachorro) {
                System.out.println(cachorro.getNome());
            } else {
                System.out.println("Não tem cachorro");
            }
        }

        Produto p1 = new Produto("Celular", 1500);
        Produto p2 = new Produto("NoteBook", 4000);
        Produto p3 = new Produto("Pc gamer", 5500);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        int totalProdutos = 0;
        double mediaPreco = 0;
        for(Produto produto: produtos) {
            totalProdutos += produto.getPreco();
            mediaPreco = (double) totalProdutos / produtos.size();

        }
        System.out.println("Total dos produtos: " + totalProdutos);
        System.out.printf("Media total dos produtos: %.2f\n", mediaPreco);


        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(6);
        Circulo circulo3 = new Circulo(9);

        Quadrado quadrado1 = new Quadrado(7);
        Quadrado quadrado2 = new Quadrado(9);
        Quadrado quadrado3 = new Quadrado(12);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo1);
        formas.add(circulo2);
        formas.add(circulo3);
        formas.add(quadrado1);
        formas.add(quadrado2);
        formas.add(quadrado3);

        for(Forma forma: formas) {
            if(forma instanceof Circulo circulo) {
                circulo.calculaArea();
            } else if(forma instanceof Quadrado quadrado) {
                quadrado.calculaArea();
            } else {
                System.out.println("Forma Invalida");
            }
        }

        ContaBancaria conta1 = new ContaBancaria(123, 155.50);
        ContaBancaria conta2 = new ContaBancaria(456, 350.50);
        ContaBancaria conta3 = new ContaBancaria(789, 800);
        ContaBancaria conta4 = new ContaBancaria(101112, 1650.50);
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);

        ContaBancaria contaMaiorSaldo = contas.getFirst();
        for(ContaBancaria conta: contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com maior saldo: " + contaMaiorSaldo);
    }
}
