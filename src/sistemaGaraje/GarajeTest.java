package sistemaGaraje;


import java.util.Scanner;

import modelo.Garaje;

public class GarajeTest {
    public static Garaje cargaDatos() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        // Crear un garaje
        System.out.print("Ingrese precio por cambio de rueda: ");
        double precioCambioRueda = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nIndique la cantidad de vehiculos que se puodrán ingresar: ");
        int cantidadVehiculos = sc.nextInt();
        sc.nextLine();
        Garaje garaje = new Garaje(precioCambioRueda,cantidadVehiculos,null);

        return garaje;
    }
}
