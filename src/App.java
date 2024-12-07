
import dao.VehiculoDAO;
import vista.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        // generamos la conexión a la base de datos
        VehiculoDAO.conectar();
       // VehiculoDAO.verificarConexion();
        Menu menuPrincipal = new Menu();
        menuPrincipal.mostrar();
    }
}