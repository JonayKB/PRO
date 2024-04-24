package es.ies.puerto.modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.excepcion.UsuarioException;

    

public class Conexion extends AppConfig{
    Connection con;
    public  Connection getConnection()throws UsuarioException{    
        try {
            con=DriverManager.getConnection("jdbc:sqlite:"+getUrl());
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        return con;
    }

}
