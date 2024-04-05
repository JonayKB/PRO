package es.ies.puerto.modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.UsuarioException;

public class Conexion extends AppConfig {
    private String user;
    private String password;
    private Connection connection;

    public Conexion() {
        String url = "jdbc:sqlite:"+getUrl();
        setUrl(url);
    }
    public Conexion(String user, String password) {
        setUrl("jdbc:sqlite:"+getUrl());
        this.user = user;
        this.password = password;
    }

    public Connection getConnection()throws UsuarioException{
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection(getUrl());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new UsuarioException("No se ha podido establecer la conexiom",e);
        }
        return connection;
    }

}
