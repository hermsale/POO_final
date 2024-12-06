// import java.beans.Statement;
// import java.sql.Connection;
// import dao.Database;
// import modelo.Garaje;
// import java.sql.ResultSet;
// import java.sql.SQLException;

import vista.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        
        Menu menuPrincipal = new Menu(); 
        menuPrincipal.mostrar();
    }
}

//Garaje sistemaGarage = new Garaje(0, 0, null);
 // Probar la conexión a la base de datos
 /*
        try {
            // Obtener la conexión a la base de datos
            Connection connection = Database.getConnection();

            // Realizar una consulta simple para verificar la conexión
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = ((java.sql.Statement) statement).executeQuery("SELECT DATABASE()");

            // Imprimir el nombre de la base de datos actual
            if (resultSet.next()) {
                System.out.println("Conectado a la base de datos: " + resultSet.getString(1));
            }

            // Cerrar la conexión
            Database.closeConnection();

        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
  * 
  */