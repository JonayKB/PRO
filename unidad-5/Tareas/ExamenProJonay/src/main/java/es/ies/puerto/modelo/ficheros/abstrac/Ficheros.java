package es.ies.puerto.modelo.ficheros.abstrac;


import java.io.File;

import es.ies.puerto.modelo.ficheros.interfaces.IFicheros;



public abstract class Ficheros implements IFicheros{
    public static final String RUTA_ALIMENTOS_CSV="src/main/resources/alimentos.csv";
    public static final String RUTA_APARATOS_CSV="src/main/resources/aparatos.csv";
    public static final String RUTA_CUIDADOSPERSONALES_CSV="src/main/resources/cuidado-personal.csv";
    public static final String RUTA_SOUVENIRS_CSV="src/main/resources/souvenirs.csv";

    public static final String SOUVENIR = "Souvenir";
    public static final String CUIDADO_PERSONAL = "CuidadoPersonal";
    public static final String APARATO = "Aparato";
    public static final String ALIMENTO = "Alimento";
    public static final int COLUMNA_NOMBRE = 0;
    public static final int COLUMNA_PRECIO = 1;
    public static final int COLUMNA_FENTRADA = 2;
    public static final int COLUMNA_UDI = 3;
    public static final int COLUMNA_FCADUCIDAD = 4;
    public static final int COLUMNA_POPULARIDAD = 4;
    
    @Override
    public boolean existe(String path){
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

}
