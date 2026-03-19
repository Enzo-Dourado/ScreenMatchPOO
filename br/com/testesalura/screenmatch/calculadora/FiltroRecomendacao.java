package br.com.testesalura.screenmatch.calculadora;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Entre os Melhores do Momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Classificação boa!");
        } else {
            System.out.println("Adicione a sua lista");
        }
    }

}
