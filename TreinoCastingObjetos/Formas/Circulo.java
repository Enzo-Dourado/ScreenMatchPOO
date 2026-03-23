package TreinoCastingObjetos.Formas;

public class Circulo implements Forma {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public void calculaArea() {
        double area = (raio * raio) * 3.14;
        System.out.println("Area do Circulo: " + area);
    }
}
