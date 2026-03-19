package TreinoInterfaces;

import TreinoInterfaces.Moedas.ConversorMoedas;
import TreinoInterfaces.Produtos.Livro;
import TreinoInterfaces.Produtos.ProdutoFisico;
import TreinoInterfaces.SalaRetangular.CalculadoraSalaRetangular;
import TreinoInterfaces.Tabuada.TabuadaMultiplicacao;
import TreinoInterfaces.Temperatura.ConversorTemperaturaPadrao;
import TreinoInterfaces.Vendas.Produto;
import TreinoInterfaces.Vendas.Servico;

public class PrincipalInterface {
    public static void main(String[] args) {

        ConversorMoedas moedas = new ConversorMoedas();

        moedas.setValor(500);
        System.out.println(moedas.getConverteDolarParaReal());

        CalculadoraSalaRetangular calculos =  new CalculadoraSalaRetangular();

        calculos.setBase(5);
        calculos.setAltura(10);

        System.out.println("Área Retangulo: " +  calculos.calcularArea());
        System.out.println("Perimetro Retangulo: " +  calculos.calcularPerimetro());

        TabuadaMultiplicacao  tabuada = new TabuadaMultiplicacao();
        tabuada.setNumero(5);
        tabuada.mostraTabuada();

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.setTemperatura(40);
        conversor.celsiusParaFahrenheit();
        conversor.fahrenheitParaCelsius();

        Livro  livro = new Livro();
        livro.setValor(56);
        livro.setTaxaAdicional(0.1);
        System.out.println("Livro: " + livro.calcularPrecoFinal());

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setValor(150);
        produtoFisico.setDesconto(0.1);
        System.out.println("Produto Fisico: " + produtoFisico.calcularPrecoFinal());

        Produto produto = new Produto();
        produto.setPreco(30);
        produto.setQuantidade(6);
        produto.calculaPrecoTotal();

        Servico servico = new Servico();
        servico.setPreco(70);
        servico.setQuantidade(4);
        servico.calculaPrecoTotal();

    }
}
