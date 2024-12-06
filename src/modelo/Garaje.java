package modelo;

import java.util.List;

public class Garaje {
   /*
            Garage
    <!-- atributos  -->
    precio cambio de rueda // se fija al principio de la apertura del programa
    capacidad vehiculos // se fija al principio de la apertura del programa
    cantidad vehiculos // cantidad de vehiculos actual - se muestra en el menu siempre actualizado
    <!-- metodos -->
    ingreso vehiculo // verifica si hay lugar en el garaje. si hay, realiza el ingreso. 
    egreso vehiculo // elimina un vehiculo del garaje
    precio cambio de rueda total // precio total de cambio de rueda de todos los vehiculos
    kilometraje medio // kilometraje medio de todos los vehiculos ingresados
    cambiar rueda // metodo
   */ 

   private double precioCambioRueda; // se asigna el precio por el cambio de rueda en el dia
   private int capacidadVehiculos; // capacidad total de almacenamiento de vehiculos
   //private int cantidadVehiculosActuales; // contador de los vehiculos actualmente en el garaje
   private List<Vehiculo> vehiculos; // lista de vehiculos ingresados en el garaje

   public Garaje(double precioCambioRueda, int capacidadVehiculos, List<Vehiculo> vehiculos) {
    this.precioCambioRueda = precioCambioRueda;
    this.capacidadVehiculos = capacidadVehiculos;
    this.vehiculos = vehiculos;
}
//    metodos

    public void agregarVehiculo(){
        // logica
    }

    public void eliminarVehiculo(){
        // logica
    }

    public void obtenerCostoCambioRuedasTotal(){
        // logica
    }

    public void obtenerKilometrajeMedio(){
        // logica
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
