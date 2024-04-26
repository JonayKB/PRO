package es.ies.puerto.modelo.db;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.excepcion.UsuarioException;
import es.ies.puerto.modelo.impl.Personaje;

public class CrudDb extends Conexion{
    public CrudDb() throws UsuarioException {

    }
    /**
     * Funcion que ejecuta una orden sql
     * @param sql que ejecuta
     * @throws UsuarioException
     */
    public void ejecutar(String sql) throws UsuarioException{
        Statement statement = null;
        try {
            statement = getConnection().createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }finally{
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                cerrar();
            } catch (Exception e) {
                throw new UsuarioException(sql, e);
            }
        }
    }
    /**
     * Obtiene las respuestas de la sentencia sql
     * @param sql a buscar
     * @return los resultados
     * @throws UsuarioException
     */
    public Set<Personaje> obtener(String sql) throws UsuarioException{
        Set<Personaje> personajes = null;
        Set<String> poderes = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(sql);
            personajes = new HashSet<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String alias = resultSet.getString("alias");
                String genero = resultSet.getString("genero");
                poderes = obtenerPoderes(id);
                Personaje personajeNuevo = new Personaje(id, nombre, alias, genero, poderes);
                personajes.add(personajeNuevo);
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }finally{
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                cerrar();
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (Exception e) {
                throw new UsuarioException(sql, e);
            }
        }
        return personajes;
    }
    
    /**
     * Funcion para agregar personajes
     * @param personaje a agregar
     * @throws UsuarioException
     */
	public void agregarPersonaje(Personaje personaje) throws UsuarioException{
        String sql = "INSERT INTO Personajes (id,nombre,alias,genero) "+
        "VALUES ("+personaje.getId()+",'"+personaje.getNombre()+"','"+personaje.getAlias()+"','"+personaje.getGenero()+"')";
        ejecutar(sql);
    }

    /**
     * Agrega un poder
     * @param personaje que va a tener el poder
     * @param poder a agregar
     * @throws UsuarioException
     */
    public void agregarPoder(Personaje personaje, String poder) throws UsuarioException{
        String sql = "INSERT INTO Poderes (personaje_id,poder) VALUES "+
        "("+personaje.getId()+",'"+poder+"') ";
        ejecutar(sql);
    }
    /**
     * Funcion para eliminar un personaje
     * @param personaje a eliminar
     * @throws UsuarioException
     */
    public void eliminarPersonaje(Personaje personaje)throws UsuarioException{
        String sql = "DELETE FROM Personajes WHERE id="+personaje.getId();
        ejecutar(sql);
    }
    /**
     * Elimina un poder
     * @param poder a eliminar
     * @throws UsuarioException
     */
    public void eliminarPoder(String poder) throws UsuarioException{
        String sql = "DELETE FROM Poderes WHERE poder='"+poder+"'";
        ejecutar(sql);
    }
    /**
     * Funcion para modificar un personaje
     * @param personaje a modficar
     * @throws UsuarioException
     */
    public void modificarPersonaje(Personaje personaje)throws UsuarioException{
        String sql = "UPDATE Personajes SET id="+personaje.getId()+",nombre='"+
        personaje.getNombre()+"',alias='"+personaje.getAlias()+"',genero='"+personaje.getGenero()+"' WHERE id="+personaje.getId();
        ejecutar(sql);
        modificarPoderes(personaje, personaje.getPoderes());
    }
    /**
     * Funcion para modificar los poderesde un personaje
     * @param personaje de los poderes
     * @param poderes del personaje
     * @throws UsuarioException
     */
    public void modificarPoderes(Personaje personaje, Set<String> poderes)throws UsuarioException{
        for (String string : obtenerPoderes(personaje.getId())) {
            eliminarPoder(string);
        }
        for (String poder : poderes) {
            agregarPoder(personaje, poder);
        }
    }
    /**
     * Obtiene los poderes de la tabla
     * @param id de los poderes
     * @return
     * @throws UsuarioException
     */
    public Set<String> obtenerPoderes(int id)throws UsuarioException{
        Set<String> poderes = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = getConnection().createStatement();
            String sql = "SELECT poder FROM poderes WHERE personaje_id="+id;
            resultSet = statement.executeQuery(sql);
            poderes = new HashSet<>();

            while (resultSet.next()) {
                
                poderes.add(resultSet.getString("poder"));
            }
        } catch (Exception e) {
            throw new UsuarioException(e.getMessage(), e);
        }finally{
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                cerrar();
                if (resultSet != null && !resultSet.isClosed()) {
                    resultSet.close();
                }
            } catch (Exception e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return poderes;
    }
    /**
     * Obtiene un personaje
     * @param personaje a obtener
     * @return el personaje
     * @throws UsuarioException
     */
    public Personaje obtenerPersonaje(Personaje personaje)throws UsuarioException{
        return obtener("SELECT id,nombre,alias,genero from Personajes WHERE id="+personaje.getId()).iterator().next();
    }
    /**
     * Funcion para obtener personajes
     * @return set de personajes
     * @throws UsuarioException
     */
    public Set<Personaje> obtenerPersonajes()throws UsuarioException{
        return obtener("SELECT id,nombre,alias,genero from Personajes");
    }
}
