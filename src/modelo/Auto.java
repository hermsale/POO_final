package modelo;

public class Auto extends Vehiculo {
    private int puertas;
    private int ruedas;

    public Auto(String patente, String marca, int kilometraje, int puertas, int ruedas) {
        super(patente, marca, kilometraje);
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    // setters y getters
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "--------------------------------------------------------\n" +
                "|                  Datos del Auto                       |\n" +
                "--------------------------------------------------------\n" +
                "| Patente: " + getPatente() + "\n" +
                "| Marca: " + getMarca() + "\n" +
                "| Kilometraje: " + getKilometraje() + " km\n" +
                "| Número de Puertas: " + puertas + "\n" +
                "| Número de Ruedas: " + ruedas + "\n" +
                "--------------------------------------------------------";
    }
}
