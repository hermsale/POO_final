package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VehiculoDAO {
    private static Connection connection;

    // Método para establecer la conexión a la base de datos
    public static void conectar() {
        try {
            connection = Database.getConnection();
            System.out.println("Conexión establecida con éxito a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Método para verificar la conexión actual
    public static void verificarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT DATABASE()");
                if (resultSet.next()) {
                    System.out.println("Conexión establecida con éxito a la base de datos: " + resultSet.getString(1));
                }
            } else {
                System.out.println("No hay conexión a la base de datos.");
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar la conexión: " + e.getMessage());
        }
    }

    // Método para cerrar la conexión manualmente
    public static void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada con éxito.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
