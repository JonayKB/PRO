package es.ies.puerto.modelo.ficheros.interfaces;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.ies.puerto.modelo.abstrac.Producto;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;


public interface IFicheros {
    public boolean existe(String path);

    public Set<Producto> leer(String path,String tipo) throws IOException, ParseException;
    public boolean escribir(String path, String texto);
    public boolean borrar(String path, String texto);
    public boolean modificar(String path, String texto);

    public boolean almacenar(String path, String texto);

    public Producto crearAlimento(String[] array) throws ParseException;
    public Producto crearAparato(String[] array);
    public Producto crearCuidadoPersonal(String[] array);
    public Producto crearSouvenir(String[] array);

    public String listaToFile(List<Alimento> alimentos);
    public String listaToFile(Map<String,Aparato> aparatos);
    public String listaToFile(Set<?> lista);
}
