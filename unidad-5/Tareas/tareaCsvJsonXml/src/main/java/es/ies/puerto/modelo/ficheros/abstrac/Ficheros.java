package es.ies.puerto.modelo.ficheros.abstrac;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import es.ies.puerto.modelo.ficheros.interfaces.IFicheros;
/**
 * Contiene la base de archivos que usa la mayoria de gestores de ficheros
 */
public abstract class Ficheros implements IFicheros{
    public static final String RUTA_CSV="src/main/resources/personas.csv";
    public static final String RUTA_XML="src/main/resources/personas.xml";
    public static final String RUTA_JSON="src/main/resources/personas.json";
    public static final String SEPARADOR=",";


    @Override
    public boolean existe(String path){
        if (path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    @Override
    public boolean eliminar(String path){
        if (existe(path)) {
            File file = new File(path);
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                byte[] vacio = {};
                fileOutputStream.write(vacio);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


}
