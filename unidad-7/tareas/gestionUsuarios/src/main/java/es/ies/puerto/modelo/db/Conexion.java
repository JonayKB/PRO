package es.ies.puerto.modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;

import es.ies.puerto.exception.UsuarioException;

public class Conexion {
    private String url;
    private String user;
    private String password;
    private Connection connection;


    public Conexion(String url) {
        this.url = "jdbc:sqlite:"+url;
    }
    public Conexion(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection()throws UsuarioException{
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new UsuarioException("No se ha podido establecer la conexiom",e);
        }
        return connection;
    }

}
