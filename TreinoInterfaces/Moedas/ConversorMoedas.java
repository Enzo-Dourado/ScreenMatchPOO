package TreinoInterfaces.Moedas;

import TreinoInterfaces.Moedas.Interface.ConversaoFinaceira;

public class ConversorMoedas implements ConversaoFinaceira {
    private double valor;

    public double getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public double getConverteDolarParaReal() {
        return valor * 5.25;
    }
}
