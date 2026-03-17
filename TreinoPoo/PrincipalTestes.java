package TreinoPoo;

import TreinoPoo.br.com.teste.poo.*;

public class PrincipalTestes {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();
        Produto  produto = new Produto();
        Aluno aluno = new Aluno();
        Livro livro = new Livro();

        idadePessoa.setIdade(10);
        idadePessoa.verificaIdade();

        produto.setPreco(99.9);
        produto.aplicaDesconto(10);

       aluno.setNotas(10);
       aluno.setNotas(7.5);
       aluno.setNotas(6.5);
       aluno.calculaMedia();

       livro.setTitulo("O primo Rico");
       livro.setAutor("Thiago Nigro");
       livro.exibiDetalhes();
    }
}
