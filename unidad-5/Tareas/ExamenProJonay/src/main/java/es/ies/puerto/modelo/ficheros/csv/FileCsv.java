package es.ies.puerto.modelo.ficheros.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import es.ies.puerto.modelo.abstrac.Producto;
import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.productos.Alimento;
import es.ies.puerto.modelo.productos.Aparato;
import es.ies.puerto.modelo.productos.CuidadoPersonal;
import es.ies.puerto.modelo.productos.Souvenir;

public class FileCsv extends Ficheros{


    private static final int COLUMNA_NOMBRE = 0;
    private static final int COLUMNA_PRECIO = 1;
    private static final int COLUMNA_FENTRADA = 2;
    private static final int COLUMNA_UDI = 3;
    private static final int COLUMNA_FCADUCIDAD = 2;
    private static final int COLUMNA_POPULARIDAD = 4;

    public Set<Producto> leer(String path, String tipo) throws IOException, ParseException {
        if (existe(path)) {
            Set<Producto> productos = new HashSet<>();
            File fichero = new File(path);
            try ( BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea=br.readLine()) != null) {
                    String[] array = linea.split(",");
                    switch (tipo) {
                        case "alimento":
                           productos.add(crearAlimento(array));
                        case "aparato":
                            productos.add(crearAparato(array));

                        case "cuidadoPersonal":
                            productos.add(crearCuidadoPersonal(array));
                            
                        case "souvenir":
                            productos.add(crearSouvenir(array));
                            
                    
                        default:
                            productos.add(crearSouvenir(array));
                    }
                }
                return productos;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Producto crearAlimento(String[] array) throws ParseException{
        return new Alimento(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI], array[COLUMNA_FCADUCIDAD]);
    }

    private Producto crearAparato(String[] array) {
        return new Aparato(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI]);
    }

    private Producto crearCuidadoPersonal(String[] array) {
        return new CuidadoPersonal(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI],Integer.parseInt(array[COLUMNA_POPULARIDAD]));
    }

    private Producto crearSouvenir(String[] array) {
        return new Souvenir(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI]);
    }

    @Override
    public boolean escribir(String path, String texto) {
    if (existe(path)) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(texto);
            bw.newLine();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return false;
    }


    
}
