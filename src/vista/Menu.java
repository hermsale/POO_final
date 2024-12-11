package vista;

import java.util.Scanner;

import controlador.GarajeController;
import dao.VehiculoDAO;

public final class Menu {
    // se crea una referencia interna de controladorEmpresa.

    Scanner sc = new Scanner(System.in);

    // variable utilizada para gestionar las distintas opciones
    private int opcion;
    private double precioCambioRueda;
    private GarajeController garajeController;
    private int cantidadVehiculos;

    private int tipoVehiculo; // elegimos entre auto y moto
    private String patente; 
    private String marca;
    private int kilometraje;
    private int puertas; // auto
    private int ruedas; // moto / auto 
    private int cilindrada; // moto

    // se recibe la inyeccion de dependencias en el constructor, enviado desde
    // menuPrincipal.mostrar(), para gestionar controladorEmpresas desde Menu
    public Menu(GarajeController garajeController) {
        this.garajeController = garajeController;
    }

    public void mostrar() {

        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Bienvenido al Sistema de Gestión de Garaje");
            System.out.println();
            System.out.println("1. Modificar precio cambio rueda");
            System.out.println("2. Modificar cantidad máxima de vehiculos");
            System.out.println("3. Mostrar información de todos los vehiculos");
            System.out.println("4. Ingresar vehiculo");
            System.out.println("5. Retirar vehiculo");
            System.out.println("6. Mostrar información del garaje");
            System.out.println("7. Calculo ruedas total y kilometraje medio");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nIndique el precio del cambio de rueda: ");
                    precioCambioRueda = sc.nextDouble();
                    sc.nextLine();
                    garajeController.precioCambioRueda(precioCambioRueda);
                    pausar();
                    break;

                case 2:
                    System.out.println("\nIndique la cantidad de vehiculos que se puodrán ingresar: ");
                    cantidadVehiculos = sc.nextInt();
                    sc.nextLine();
                    garajeController.cantidadVehiculos(cantidadVehiculos);
                    pausar();
                    break;

                case 3:
                    garajeController.mostrarVehiculos();
                    pausar();
                    break;

                case 4:
                    // corroboro que haya espacio en el garaje, si lo hay agrego vehiculo
                    boolean ingreso = garajeController.contarVehiculosIngresados();
                    if(ingreso){
                        agregarVehiculo();
                    }
                    pausar();
                    break;

                case 5:
                    // retirar vehiculo
                    retiroVehiculo();
                    pausar();
                    break;
                case 6:
                    // muestra la cantidad maxima de capacidad y el costo por rueda
                    garajeController.informacionGaraje();
                    pausar();
                    break;
                case 7:
                    // muestra calculo
                    garajeController.costoTotalYKmMedio();
                    pausar();
                    break;
                case 8:
                    System.out.println("¡Muchas gracias por utilizar la aplicación!");
                    // cierro la app y la conexion a la BD
                    VehiculoDAO.cerrarConexion();
                    break;

                default:

                    System.out.print(
                            "--------------------------------------------------------\n" +
                                    "| Ingrese una opción valida                             |\n" +
                                    "--------------------------------------------------------\n");
                    pausar();
                    break;

            }
        } while (opcion != 8);
        sc.close();
    }

    // funcion que se auto ejecuta, permite hacer una pausa antes de mostrar el menu
    // nuevamente
    private static void pausar() {
        System.out.print("Presione Enter para continuar");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void agregarVehiculo(){
        System.out.println("Ingrese el tipo de vehiculo \n1)Auto\n2)Moto");
        System.out.print("Seleccione una opción: ");
        tipoVehiculo = sc.nextInt();
        sc.nextLine();
        switch (tipoVehiculo) {
            case 1:
                menuAgregarAuto();
                break;
            case 2:
                menuAgregarMoto();
                break;
            default:
            System.out.print(
                            "--------------------------------------------------------\n" +
                                    "| Ingrese una opción valida                             |\n" +
                                    "--------------------------------------------------------\n");
                    pausar();
                    break;
        }
    }

    private void menuAgregarAuto(){
        System.out.println("Ingrese la patente: ");
        patente = sc.nextLine();
        System.out.println("Ingrese la marca: ");
        marca = sc.nextLine();
        System.out.println("Ingrese el kilometraje: ");
        kilometraje = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de puertas: ");
        puertas = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de ruedas: ");
        ruedas = sc.nextInt();
        sc.nextLine();

        garajeController.agregarAuto(patente, marca, kilometraje, puertas, ruedas);
    }

    private void menuAgregarMoto(){
        System.out.println("Ingrese la patente: ");
        patente = sc.nextLine();
        System.out.println("Ingrese la marca: ");
        marca = sc.nextLine();
        System.out.println("Ingrese el kilometraje: ");
        kilometraje = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cilindrada: ");
        cilindrada = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de ruedas: ");
        ruedas = sc.nextInt();
        sc.nextLine();

        garajeController.agregarMoto(patente, marca, kilometraje, cilindrada, ruedas);
    }


// funcion para buscar y eliminar un vehiculo del garaje 
    private void retiroVehiculo(){
        System.out.println("Ingrese la patente del vehiculo a retirar: ");
        patente = sc.nextLine();
        garajeController.buscarYEliminarVehiculo(patente);
    }
}
