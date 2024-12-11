package controlador;
import java.util.List;

import modelo.Garaje;
import modelo.Vehiculo;


public class GarajeController {

    private Garaje garaje;   
   
    public GarajeController(Garaje garaje) {
        this.garaje = garaje;
       
    }


// guardo el precio del cambio de rueda de los vehiculos
    public void precioCambioRueda(double precioCambioRueda){
        if(precioCambioRueda>0){
            garaje.setPrecioCambioRueda(precioCambioRueda);
        }else{
            System.out.println("El precio no puede ser menor o igual a 0");
        }
    }
// seteo la cantidad de vehiculos que se pueden ingresar 
    public void cantidadVehiculos(int cantidadVehiculos){
        if(cantidadVehiculos>0){
            garaje.setCapacidadVehiculos(cantidadVehiculos);
        }else{
            System.out.println("La cantidad de vehiculos no puede ser menor o igual a 0");
        }
    }

    // corrobora si se puede ingresar un vehiculo o no
    public boolean contarVehiculosIngresados(){
        int vehiculosAlmacenados = garaje.vehiculosAlmacenados();
        int capacidadVehiculos = garaje.getCapacidadVehiculos();

        if(vehiculosAlmacenados<capacidadVehiculos){
            return true;
        }else{
            System.out.println("No se puede ingresar vehiculo. La capacidad limite fue alcanzada.");
            return false;
        }
    }

//  muestro los vehiculos ingresados en el garaje 
    public void mostrarVehiculos(){
        List<Vehiculo> vehiculos = garaje.mostrarVehiculos();
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos ingresados en el garaje.");
            return;
        }
    
        System.out.println("Vehículos ingresados en el garaje:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo); // Imprime la información de cada vehículo
        }
    }

    public void informacionGaraje() {
        System.out.println("---------------------------------------------------");
        System.out.println("Información del Garaje");
        System.out.println("---------------------------------------------------");
        System.out.println("Cantidad de vehículos almacenados: " + garaje.vehiculosAlmacenados());
        System.out.println("Capacidad máxima del garaje: " + garaje.getCapacidadVehiculos());
        System.out.println("Precio por cambio de rueda: $" + garaje.getPrecioCambioRueda());
        System.out.println("---------------------------------------------------");
    }
    

// muestro el costo total por cambiar todas las ruedas y el kilometraje medio de los vehiculos ingresados
    public void costoTotalYKmMedio() {
        // Costo de cambiar una rueda
        double precioRueda = garaje.getPrecioCambioRueda();
        // Total de vehículos almacenados
        int vehiculosAlmacenados = garaje.vehiculosAlmacenados();
        // Cantidad total de ruedas
        int cantidadRuedas = garaje.cantidadRuedas();
        // Kilometraje total de los vehículos
        int kilometrajeVehiculos = garaje.kilometrajeTotal();
    
        System.out.println("---------------------------------------------------");
        System.out.println("Resumen del Garaje");
        System.out.println("---------------------------------------------------");
        System.out.println("Cantidad total de ruedas en el garaje: " + cantidadRuedas);
        System.out.println("Costo total para cambiar todas las ruedas: $" + (cantidadRuedas * precioRueda));
        System.out.println("Cantidad total de vehículos almacenados: " + vehiculosAlmacenados);
    
        if (vehiculosAlmacenados > 0) {
            System.out.println("Promedio de kilometraje de los vehículos: " 
                + (kilometrajeVehiculos / vehiculosAlmacenados) + " km");
        } else {
            System.out.println("No hay vehículos en el garaje para calcular el promedio de kilometraje.");
        }
        System.out.println("---------------------------------------------------");
    }
    

    public void agregarAuto(String patente, String marca, int kilometraje, int puertas, int ruedas){
        System.out.println("Datos ingresados:");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("puertas: " + puertas);
        System.out.println("ruedas: " + ruedas);
        garaje.ingresoAuto(patente,marca,kilometraje,puertas,ruedas);
    }

    public void agregarMoto(String patente, String marca, int kilometraje, int cilindrada, int ruedas){
        System.out.println("Datos ingresados:");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("cilindrada: " + cilindrada);
        System.out.println("ruedas: " + ruedas);
        garaje.ingresoMoto(patente,marca,kilometraje,cilindrada,ruedas);
    }

    public void buscarYEliminarVehiculo(String patente){
        if(garaje.eliminarVehiculo(patente)){
            System.out.println("El vehículo con patente " + patente + " ha sido retirado.");
            System.out.println("¡Muchas gracias vuelva pronto!");
        }else{
            System.out.println("No se encontró ningún vehículo con la patente " + patente + ".");
        }
    }
}
