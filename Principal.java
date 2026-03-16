public class Principal {
    public static void main(String[] args) {
        Filmes meuFilme = new Filmes();

        meuFilme.nome = "Vingadores Ultimato";
        meuFilme.produtora = "Marvel";
        meuFilme.anoDeLancamento = 2019;
        meuFilme.incluidoNoPlano = false;

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(9.5);
        meuFilme.avalia(4);
        meuFilme.avalia(8.9);
        System.out.println(meuFilme.avaliacao);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.obterMedia());
    }
}
