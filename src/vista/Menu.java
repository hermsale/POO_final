package vista;

import java.util.Scanner;

public final class Menu {
    // se crea una referencia interna de controladorEmpresa. 
                
        private Scanner sc = new Scanner(System.in);  
        
        // variable utilizada para gestionar las distintas opciones 
        private int opcion; 
    
        // se recibe la inyeccion de dependencias en el constructor, enviado desde menuPrincipal.mostrar(), para gestionar controladorEmpresas desde Menu
        public Menu() {
        }
    

        public void mostrar(){

            do {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Bienvenido al Sistema de Gestión de Garaje");
                System.out.println(); 
                System.out.println("1. Ingresar precio rueda");
                System.out.println("2. Ingresar cantidad vehiculos");
                System.out.println("3. Mostrar información de todos los vehiculos");
                System.out.println("4. Calcular el precio del cambio de ruedas de todos los vehiculos");
                System.out.println("5. Mostrar información del garaje");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();  
    
                switch (opcion) {
                    case 1:
                        // controladorEmpresas.mostrarEmpresas(); // muestra todas las empresas cargadas
                        pausar();
                        break;
    
                    case 2:
                        // controladorEmpresas.mostrarEmpresa(); // solicita un ID de una empresa y muestra sus datos
                        pausar();     
                    break;
                    
                    case 3:
                        // controladorEmpresas.mostrarEmpleados();
                        pausar();
                    break;
                    
                    case 4:
                        // controladorEmpresas.mostrarClientes();
                        pausar();
                    break;

                    case 5:
                        // controladorEmpresas.mostrarDirectivos();
                        pausar();
                    break;

                    case 6:
                    System.out.println("¡Muchas gracias por utilizar la aplicación!");
                    break;
                    
                    default:
                    
                    System.out.print(
                        "--------------------------------------------------------\n" +
                        "| Ingrese una opción valida                             |\n" +
                        "--------------------------------------------------------\n"
                    );
                    pausar();
                    break;
                    
                }
            } while (opcion != 6);
            sc.close();
        }
        
        // funcion que se auto ejecuta, permite hacer una pausa antes de mostrar el menu nuevamente
        public static void pausar() {
            System.out.print("Presione Enter para continuar");
            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
