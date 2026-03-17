import br.com.testesalura.screenmatch.modelos.Filmes;

public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();

        meuFilme.setNome("Vingadores Ultimato");
        meuFilme.setProdutora("Marvel");
        meuFilme.setAnoDeLancamento(2019);


        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(9.5);
        meuFilme.avalia(4);
        meuFilme.avalia(8.9);
        System.out.println("Avaliação: " + meuFilme.getAvaliacao());
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Media: " + meuFilme.obterMedia());
    }
}
