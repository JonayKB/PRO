package es.ies.puerto.modelo.ficheros.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;

public class FileCsv extends Ficheros{


    public void leer(String path) throws IOException {
        if (existe(path)) {
            File fichero = new File(path);
            try ( BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea=br.readLine()) != null) {
                    String[] array = linea.split(",");
                    System.out.println(array);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void escribir() {

    }
    
}
