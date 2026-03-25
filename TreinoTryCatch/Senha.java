package TreinoTryCatch;

import TreinoTryCatch.excecao.SenhaInvalidaException;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Senha invalida, menor que 8 digitos!");
        }
        try {
            System.out.println("Senha valida!");
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
