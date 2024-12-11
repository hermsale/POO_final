package modelo;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
    /*
     * Garage
     * <!-- atributos -->
     * precio cambio de rueda // se fija al principio de la apertura del programa
     * capacidad vehiculos // se fija al principio de la apertura del programa
     * cantidad vehiculos // cantidad de vehiculos actual - se muestra en el menu
     * siempre actualizado
     * <!-- metodos -->
     * ingreso vehiculo // verifica si hay lugar en el garaje. si hay, realiza el
     * ingreso.
     * egreso vehiculo // elimina un vehiculo del garaje
     * precio cambio de rueda total // precio total de cambio de rueda de todos los
     * vehiculos
     * kilometraje medio // kilometraje medio de todos los vehiculos ingresados
     * cambiar rueda // metodo
     */

    private double precioCambioRueda; // se asigna el precio por el cambio de rueda en el dia
    private int capacidadVehiculos; // capacidad total de almacenamiento de vehiculos
    // private int cantidadVehiculosActuales; // contador de los vehiculos
    // actualmente en el garaje
    private List<Vehiculo> vehiculos; // lista de vehiculos ingresados en el garaje

    public Garaje(double precioCambioRueda, int capacidadVehiculos, List<Vehiculo> vehiculos) {
        this.precioCambioRueda = precioCambioRueda;
        this.capacidadVehiculos = capacidadVehiculos;
        this.vehiculos = new ArrayList<>(); // inicializo la lista
    }

    // metodos

    // metodo polimorfico para agregar motos o autos
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // metodo para ingresar un auto
    public Vehiculo ingresoAuto(String patente, String marca, int kilometraje, int puertas, int ruedas) {
        Auto auto = new Auto(patente, marca, kilometraje, puertas, ruedas);
        agregarVehiculo(auto);
        return auto;
    }

    public Vehiculo ingresoMoto(String patente, String marca, int kilometraje, int cilindrada, int ruedas) {
        Moto moto = new Moto(patente, marca, kilometraje, cilindrada, ruedas);
        agregarVehiculo(moto);
        return moto;
    }

    // metodo para mostrar los vehiculos ingresados en el garaje
    public List<Vehiculo> mostrarVehiculos() {;
            return vehiculos;
    }

    // calculo la cantidad de ruedas total de todos los vehiculos
    public int cantidadRuedas() {
        int totalRuedas = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Auto) {
                totalRuedas += ((Auto) vehiculo).getRuedas();
            } else if (vehiculo instanceof Moto) {
                totalRuedas += ((Moto) vehiculo).getRuedas();
            }
        }
        return totalRuedas;
    }

    // sumamos el kilometraje de todos los vehiculos que haya en el garaje
    public int kilometrajeTotal() {
        int kilometraje = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Auto) {
                kilometraje += ((Auto) vehiculo).getKilometraje();
            } else if (vehiculo instanceof Moto) {
                kilometraje += ((Moto) vehiculo).getKilometraje();
            }
        }
        return kilometraje;
    }

    public boolean eliminarVehiculo(String patente) {
        // Iterar sobre la lista de vehículos
        for (Vehiculo vehiculo : vehiculos) {
            // Comparar la patente del vehículo actual con la dada
            if (vehiculo.getPatente().equalsIgnoreCase(patente)) {
                vehiculos.remove(vehiculo); // Eliminar el vehículo
                return true; // Indico que se elimino con éxito
            }
        }
        return false; // Indicar que no se encontró el vehículo
    }

    // se cuenta los vehiculos ingresados en el garaje
    public int vehiculosAlmacenados() {
        return vehiculos.size();
    }

    // setters y getters
    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    public void setPrecioCambioRueda(double precioCambioRueda) {
        this.precioCambioRueda = precioCambioRueda;
    }

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
