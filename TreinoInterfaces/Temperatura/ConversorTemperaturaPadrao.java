package TreinoInterfaces.Temperatura;

import TreinoInterfaces.Temperatura.Conversor.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void celsiusParaFahrenheit() {
        temperatura = (int) (temperatura * 1.8 + 32);
        System.out.println("Celsius para fahrenheit: " + temperatura);
    }

    @Override
    public void fahrenheitParaCelsius() {
        temperatura = ((temperatura - 32) * 5 / 9);
        System.out.println("Fahrenheit para celsius: " + temperatura);
    }
}
