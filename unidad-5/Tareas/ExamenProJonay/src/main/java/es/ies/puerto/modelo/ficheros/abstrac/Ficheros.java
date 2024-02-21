package es.ies.puerto.modelo.ficheros.abstrac;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Set;

import es.ies.puerto.modelo.abstrac.Producto;


public abstract class Ficheros {
    public static final String RUTA_ALIMENTOS_CSV="/src/resources/alimentos.csv";
    public static final String RUTA_APARATOS_CSV="/src/resources/aparatos.csv";
    public static final String RUTA_CUIDADOSPERSONALES_CSV="/src/resources/cuidadosPersonales.csv";
    public static final String RUTA_SOUVENIRS_CSV="/src/resources/souvenirs.csv";

    public static boolean existe(String path){
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
    public abstract Set<Producto> leer(String path, String tipo) throws IOException, ParseException;
    public abstract boolean escribir(String path, String texto);
}
