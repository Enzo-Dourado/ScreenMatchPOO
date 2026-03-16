package Treino;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Nivus";
        carro.ano = 2018;
        carro.cor = "Branco";

        carro.exibiFichaTecnica();
        System.out.println("Tempo do Carro: " + carro.calculoIdadeCarro(2026) +  " anos");
    }
}
