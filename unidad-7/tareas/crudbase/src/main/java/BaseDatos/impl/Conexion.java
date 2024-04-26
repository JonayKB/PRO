package BaseDatos.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexion {
    private String url;
    private Connection connection;
    public void crearTabla(){
        try {
            PreparedStatement sentencia = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Perros"
                + "(chip INTEGER PRIMARY KEY NOT NULL,"
                + "nombre TEXT NOT NULL,"
                + "raza TEXT NOT NULL"
                + ")");
            sentencia.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close(connection);
    }
    public Connection connect() {
        Connection connection = null;
        try {
            connection= DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();;
        }
        return connection;
    }
    public boolean close(Connection connection) {
        try {
            if (connection!=null) {
                connection.close();
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }



    public Conexion(String url) {
        this.url = url;
        this.connection = connect();
        crearTabla();
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    

}
