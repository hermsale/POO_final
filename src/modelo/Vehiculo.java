package modelo;

public abstract class Vehiculo {
    /*
     * Vehiculo abstract
     * patente -> para identificar el auto que se va a eliminar del garaje
     * marca
     * kilometraje
     */

    private String patente;
    private String marca;
    private int kilometraje;
    
    public Vehiculo(String patente, String marca, int kilometraje) {
        this.patente = patente;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }

    
    // setters y getters
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}
