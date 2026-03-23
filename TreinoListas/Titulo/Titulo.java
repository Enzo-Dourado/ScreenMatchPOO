package TreinoListas.Titulo;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int compareTo(Titulo outroNome) {
        return getNome().compareTo(outroNome.getNome());
    }
}
