package TreinoPoo.br.com.teste.poo;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibiDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
