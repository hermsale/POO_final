package sistemaGaraje;

import modelo.Auto;
import modelo.Moto;
import modelo.Garaje;

public class GarajeTest {
    public static void main(String[] args) {
        // Crear un garaje
        Garaje garaje = new Garaje(100,5,null);

        // Crear vehículos
        Auto auto1 = new Auto("AA076UL", "Ford", 136000, 5, 4);
        Auto auto2 = new Auto("BB987XY", "Chevrolet", 120000, 3, 4);
        Moto moto1 = new Moto("CC345RT", "Yamaha", 45000, 600, 2);
        Moto moto2 = new Moto("DD456YU", "Suzuki", 32000, 250, 2);

        // Agregar vehículos al garaje
        // garaje.recibirVehiculo(auto1);
        // garaje.recibirVehiculo(auto2);
        // garaje.recibirVehiculo(moto1);
        // garaje.recibirVehiculo(moto2);

        // Imprimir información del garaje
        System.out.println(garaje);
    }
}
