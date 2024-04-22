package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Alias;
import es.ies.puerto.modelo.impl.Personaje;
//import es.ies.puerto.modelo.impl.Poder;
import es.ies.puerto.modelo.impl.Poder;
import es.ies.puerto.modelo.interfaces.ICrud;

public class Crud extends Conexion implements ICrud{
    public ResultSet obtener(String sql)throws UsuarioException{
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            try {
                if (getConnection()!=null && !getConnection().isClosed()) {
                    getConnection().close();
                }
                if (statement!=null && !statement.isClosed()) {
                    statement.close();
                }
            } catch (Exception p) {
                throw new UsuarioException(p.getMessage(), p);
            }
            throw new UsuarioException(e.getMessage(), e);  
        }
       
        return resultSet;
    }
    public void cerrar()throws UsuarioException{
        try {
            if (getConnection()!=null && !getConnection().isClosed()) {
                getConnection().close();
            }
        } catch (Exception p) {
            throw new UsuarioException(p.getMessage(), p);
        }
    }
    public Set<Personaje> obtenerPersonajes()throws UsuarioException{
        ResultSet resultSet = obtener("SELECT id,genero,nombre FROM Personajes");
        Set<Personaje> personajes = new HashSet<>();
        try {
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String genero = resultSet.getString("genero");
                String nombre = resultSet.getString("nombre");
                Set<Poder> poderes = obtenerPoderes(id);
                Alias alias = obtenerAlias(id);
                personajes.add(new Personaje(id, nombre, alias, genero, poderes));
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return personajes;
    }
    public Alias obtenerAlias(Integer idPersonaje) throws UsuarioException{
        Alias alias = new Alias();
        try {
            ResultSet resultSet = obtener("SELECT a.id,a.alias FROM Alias as a WHERE a.personaje_id="+idPersonaje);
            while (resultSet.next()) {
                alias.setId(resultSet.getInt("id"));
                alias.setAlias(resultSet.getString("alias"));
                alias.setPersonaje(new Personaje(idPersonaje));
                return alias;
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return alias;
    }
    public Set<Poder> obtenerPoderes(Integer idPersonaje)throws UsuarioException{
        ResultSet resultSet = obtener("SELECT p.id, p.poder FROM Poderes as p JOIN Personajes_Poderes as pp ON p.id=pp.poder_id WHERE pp.personaje_id="+idPersonaje);
        Set<Poder> poderes = new HashSet<>();
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String poder = resultSet.getString("poder");
                poderes.add(new Poder(id, poder, null));
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return poderes;
    }
    @Override
    public Personaje obtenerPersonaje(Personaje personaje) throws UsuarioException {
        ResultSet resultSet = obtener("SELECT id,genero,nombre FROM Personajes WHERE id="+personaje.getId());
        try {
                Integer id = resultSet.getInt("id");
                String genero = resultSet.getString("genero");
                String nombre = resultSet.getString("nombre");
                Set<Poder> poderes = obtenerPoderes(id);
                Alias alias = obtenerAlias(id);
                personaje = new Personaje(id, nombre, alias, genero, poderes);
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }
        cerrar();
        return personaje;
    }
    @Override
    public void agregarPersonaje(Personaje personaje) throws UsuarioException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarPersonaje'");
    }
    @Override
    public void actualizarPersonaje(Personaje personaje) throws UsuarioException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarPersonaje'");
    }
    @Override
    public void eliminarPersonaje(Personaje personaje) throws UsuarioException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPersonaje'");
    }
}

