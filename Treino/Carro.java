package Treino;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibiFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculoIdadeCarro(int anoAtual) {
        return anoAtual - ano;
    }
}
