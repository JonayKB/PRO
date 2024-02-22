package es.ies.puerto.modelo.ficheros.interfaces;

import java.io.IOException;
import java.text.ParseException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.ies.puerto.modelo.abstrac.Producto;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;

public interface IFicheros {
    public boolean existe(String path);
    public String obtenerRuta(String tipo);

    public Set<Producto> leer(String tipo) throws IOException, ParseException;
    public boolean escribir(String path, String texto);
    public boolean borrar(List<Alimento> lista)throws IOException,ParseException;
    public boolean borrar(Set<Producto> lista);
    public boolean borrar(Map<String,Aparato> lista);



    public boolean almacenar(Producto producto);

    public Producto crearAlimento(String[] array) throws ParseException;
    public Producto crearAparato(String[] array);
    public Producto crearCuidadoPersonal(String[] array);
    public Producto crearSouvenir(String[] array);

    public List<Alimento> obtenerAlimentos()throws IOException,ParseException;
    public Map<String, Aparato> obtenerAparatos()throws IOException,ParseException;
    public Set<CuidadoPersonal> obtenerCuidadoPersonal()throws IOException,ParseException;
    public Set<Souvenir> obtenerSouvenirs()throws IOException,ParseException;
}
