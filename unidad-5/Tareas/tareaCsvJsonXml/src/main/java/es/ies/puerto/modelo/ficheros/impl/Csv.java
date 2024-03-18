package es.ies.puerto.modelo.ficheros.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.impl.Personaje;

/**
 * Contiene toda las funciones del interfaz necesaria para la administracion de
 * ficheros con CSV
 */
public class Csv extends Ficheros {

    private static final int COLUMNA_PODERES = 3;
    private static final int COLUMNA_GENERO = 2;
    private static final int COLUMNA_ALIAS = 1;
    private static final int COLUMNA_NOMBRE = 0;

    @Override
    public boolean actualizar(List<Personaje> personas) {
        return eliminar(RUTA_CSV) && escribir(personas);
    }

    @Override
    public boolean escribir(List<Personaje> personas) {
        if (existe(RUTA_CSV)) {
            File file = new File(RUTA_CSV);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(toFile(personas));
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public List<Personaje> leer() {
        List<Personaje> personas = new ArrayList<>();
        if (existe(RUTA_CSV)) {
            File file = new File(RUTA_CSV);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(SEPARADOR);
                    List<String> poderes = new ArrayList<>();
                    poderes.addAll(Arrays.asList(Arrays.copyOfRange(datos, COLUMNA_PODERES, datos.length)));
                    Personaje personaNueva = new Personaje(datos[COLUMNA_NOMBRE], datos[COLUMNA_ALIAS],
                            datos[COLUMNA_GENERO], poderes);
                    personas.add(personaNueva);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return personas;
    }

    @Override
    public boolean modificar(List<Personaje> personas) {
        return actualizar(personas);
    }

    /**
     * Formatea una lista a CSV
     * 
     * @param personas lista a formatear
     * @return lista formateada
     */
    public String toFile(List<Personaje> personas) {
        if (personas.isEmpty()) {
            return null;
        }
        StringBuilder contenidoBuilder = new StringBuilder();
        for (Personaje persona : personas) {
            contenidoBuilder.append(persona.toCsv()).append("\n");
        }
        return contenidoBuilder.toString();
    }

}
