package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    // Esta clase gestiona la conexión con la base de datos

    private static final String URL = "jdbc:mysql://localhost:3306/mygarage"; // Ruta de la base de datos
    private static final String USER = "root"; // Usuario de la base de datos
    private static final String PASSWORD = ""; // Contraseña del usuario
    private static Connection connection; // Conexión única (Singleton)

    static {
        try {
            // Registrar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el driver de MySQL: " + e.getMessage());
        }
    }

    // Obtener la conexión
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) { // Singleton Pattern
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión establecida con éxito a la base de datos: " + URL);
            } catch (SQLException e) {
                System.err.println("Error al conectar a la base de datos: " + e.getMessage());
                throw e;
            }
        }
        return connection;
    }

    // Cerrar la conexión
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada con éxito.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
