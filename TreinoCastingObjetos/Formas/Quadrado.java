package TreinoCastingObjetos.Formas;

public class Quadrado implements  Forma {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public void calculaArea() {
        int area = lado * lado;
        System.out.println("Area do Quadrado: " + area);
    }
}
