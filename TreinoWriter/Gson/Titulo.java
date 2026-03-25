package TreinoWriter.Gson;

public class Titulo {
    private String nome;
    private int idade;
    private String descricao;

    public Titulo(String nome, int idade, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDescricao() {
        return descricao;
    }
}
