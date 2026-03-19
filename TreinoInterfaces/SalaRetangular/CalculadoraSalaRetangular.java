package TreinoInterfaces.SalaRetangular;


import TreinoInterfaces.SalaRetangular.Calculos.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return base *  altura;
    }

    @Override
    public int calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }
}
