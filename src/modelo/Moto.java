package modelo;

public class Moto extends Vehiculo{
    // cilindrada
    // ruedas

    private int cilindrada;
    private int ruedas;

    public Moto(String patente, String marca, int kilometraje, int cilindrada, int ruedas) {
        super(patente, marca, kilometraje);
        this.cilindrada = cilindrada;
        this.ruedas = ruedas;
    }

    
    // setters y getters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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
           "|                  Datos de la Moto                     |\n" +
           "--------------------------------------------------------\n" +
           "| Patente: " + getPatente() + "\n" +
           "| Marca: " + getMarca() + "\n" +
           "| Kilometraje: " + getKilometraje() + " km\n" +
           "| Cilindrada: " + cilindrada + " cc\n" +
           "| Número de Ruedas: " + ruedas + "\n" +
           "--------------------------------------------------------";
}
}
