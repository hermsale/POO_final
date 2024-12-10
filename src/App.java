
import controlador.GarajeController;
import dao.VehiculoDAO;
import modelo.Garaje;
import sistemaGaraje.GarajeTest;
import vista.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        // generamos la conexión a la base de datos
        VehiculoDAO.conectar();

        // Garaje garaje = new Garaje(100, 5, null);
        Garaje garaje = GarajeTest.cargaDatos();
        GarajeController controlador = new GarajeController(garaje);
       // VehiculoDAO.verificarConexion();
       
        Menu menuPrincipal = new Menu(controlador);
        menuPrincipal.mostrar();
    }
}