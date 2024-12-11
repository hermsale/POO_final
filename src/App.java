
import controlador.GarajeController;
import modelo.Garaje;
import sistemaGaraje.GarajeTest;
import vista.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        
        Garaje garaje = GarajeTest.cargaDatos();
        GarajeController controlador = new GarajeController(garaje);
       
        Menu menuPrincipal = new Menu(controlador);
        menuPrincipal.mostrar();
    }
}