package TreinoTryCatch;

import TreinoTryCatch.excecao.DigitouZeroException;
import br.com.testesalura.screenmatch.excecoes.ErroNoConversorDeAnoDeLancamentoException;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = sc.nextInt();

        System.out.println("Digite outro numero: ");
        double numero2 = sc.nextInt();

        if (numero == 0 || numero2 == 0) {
            throw new DigitouZeroException("Usuario digitou 0 em algum dos campos!");
        }

        try {
            double divisao = numero / numero2;
            System.out.println("Divisao: " + divisao);

        } catch(DigitouZeroException e) {
            System.out.println(e.getMessage());
        }

    }
}
