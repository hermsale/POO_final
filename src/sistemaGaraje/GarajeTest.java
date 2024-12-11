package sistemaGaraje;


import java.util.Scanner;

import modelo.Garaje;

public class GarajeTest {
    public static Garaje cargaDatos() {
        Scanner sc = new Scanner(System.in);
        // Crear un garaje
        System.out.print("Ingrese precio por cambio de rueda: ");
        double precioCambioRueda = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nIndique la cantidad de vehiculos que se puodrán ingresar: ");
        int cantidadVehiculos = sc.nextInt();
        sc.nextLine();
        Garaje garaje = new Garaje(precioCambioRueda,cantidadVehiculos,null);
        // Crear vehículos
        garaje.ingresoAuto("AA076UL","Ford" , 136000, 5, 4);
        garaje.ingresoMoto("QRU802", "Honda", 62350, 600, 2);

        return garaje;
    }
}
