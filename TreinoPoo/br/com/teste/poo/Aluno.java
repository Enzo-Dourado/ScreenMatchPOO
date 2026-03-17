package TreinoPoo.br.com.teste.poo;

public class Aluno {
    private String nome;
    private double notas;
    public int provas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        provas++;
    }

    public void calculaMedia() {
        double media = notas / provas;
        System.out.println("Media: " + media);

    }
}
