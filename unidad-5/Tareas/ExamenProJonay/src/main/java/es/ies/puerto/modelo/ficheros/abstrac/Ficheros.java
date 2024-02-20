package es.ies.puerto.modelo.ficheros.abstrac;


import java.io.File;
import java.io.IOException;


public abstract class Ficheros {
    public final String RUTA_ALIMENTOS_CSV="/src/resources/alimentos.csv";
    public final String RUTA_APARATOS_CSV="/src/resources/aparatos.csv";
    public final String RUTA_CUIDADOSPERSONALES_CSV="/src/resources/cuidadosPersonales.csv";
    public final String RUTA_SOUVENIRS_CSV="/src/resources/souvenirs.csv";

    public static boolean existe(String path){
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
    public abstract void leer(String path) throws IOException;
    public abstract void escribir();
}
