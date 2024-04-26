package BaseDatos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import BaseDatos.interfaces.ICrudBase;
import impl.Perro;

public class BaseDatos implements ICrudBase{
    Conexion conexion;

    public BaseDatos() {
        conexion = new Conexion("");
    }
    

    @Override
    public boolean update(String sql) {
        PreparedStatement statement;
        Connection connection=null;
        try {
            connection = conexion.connect();
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally{
            conexion.close(connection);
        }
    }

    @Override
    public boolean insert(String sql) {
        return update(sql);
    }

    @Override
    public boolean delete(String sql) {
       return update(sql);
    }

    @Override
    public Set<Perro> select(String sql) {
        Set<Perro> perros = new HashSet<>();
        Connection connection = null;
        try {
            connection = conexion.connect();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Perro perroAniadir = new Perro(resultSet.getInt("chip"), resultSet.getString("nombre"), resultSet.getString("raza"));
                perros.add(perroAniadir);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            perros = null;
        }finally{
            conexion.close(connection);
        }
        return perros;
    }

    
    
}
