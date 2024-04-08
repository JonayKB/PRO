package es.ies.puerto.modelo.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.excepcion.UsuarioException;

public class Conexion extends AppConfig{

    public Conexion() throws UsuarioException {
    }

    Connection con;
    public Connection getConnection() throws UsuarioException{
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:"+getUrl());
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        return con;
    }
    public void cerrar()throws UsuarioException{
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            throw new UsuarioException(e.getMessage(), e);
        }
    }


    public Connection getCon() {
        return this.con;
    }


}
