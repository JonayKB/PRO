package es.ies.puerto.modelo.ficheros.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import es.ies.puerto.modelo.abstrac.Producto;
import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.productos.Alimento;
import es.ies.puerto.modelo.productos.Aparato;
import es.ies.puerto.modelo.productos.CuidadoPersonal;
import es.ies.puerto.modelo.productos.Souvenir;

public class FileCsv extends Ficheros{



    public String obtenerRuta(String tipo){
        switch (tipo) {
            case ALIMENTO:
                return RUTA_ALIMENTOS_CSV;

            case APARATO:
                return RUTA_APARATOS_CSV;

            case CUIDADO_PERSONAL:
                return RUTA_CUIDADOSPERSONALES_CSV;

            case SOUVENIR:
                return RUTA_SOUVENIRS_CSV;

            default:
                return null;

        }
    }
    public Set<Producto> leer(String tipo) throws IOException, ParseException {
        String path = obtenerRuta(tipo);
        Set<Producto> productos = new HashSet<>();
        if (existe(path)) {
            File fichero = new File(path);
            try ( BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i =0;
                while ((linea=br.readLine()) != null) {
                    if (i>0) {    
                        String[] array = linea.split(",");
                        switch (tipo) {
                            case ALIMENTO:
                                productos.add(crearAlimento(array));
                            break;
                            case APARATO:
                                productos.add(crearAparato(array));
                            break;
                            case CUIDADO_PERSONAL:
                                productos.add(crearCuidadoPersonal(array));
                            break;
                            case SOUVENIR:
                                productos.add(crearSouvenir(array));
                                
                            break;
                            default:
                                productos.add(crearSouvenir(array));
                            break;
                        }
                    }
                    i++;
                }
                return productos;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productos;
    }

    private Producto crearAlimento(String[] array) throws ParseException{
        return new Alimento(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI], array[COLUMNA_FCADUCIDAD]);
    }
    public List<Alimento> obtenerAlimentos()throws IOException,ParseException{
        List<Alimento> alimentos = new ArrayList<>();
        for (Producto producto : leer(ALIMENTO)) {
            if (Alimento.class==producto.getClass()) {
                alimentos.add((Alimento)producto);
            }
        }
        return alimentos;
    }
    public Map<String, Aparato> obtenerAparatos()throws IOException,ParseException{
        Map<String, Aparato> aparatos = new HashMap<>();
        for (Producto producto : leer(APARATO)) {
            if (Aparato.class==producto.getClass()) {
                aparatos.put(producto.getUdi(),(Aparato)producto);
            }
        }
        return aparatos;
    }
    public Set<CuidadoPersonal> obtenerCuidadoPersonal()throws IOException,ParseException{
        Set<CuidadoPersonal> cuidadosPersonales = new HashSet<>();
        for (Producto producto : leer(CUIDADO_PERSONAL)) {
            if (CuidadoPersonal.class==producto.getClass()) {
                cuidadosPersonales.add((CuidadoPersonal)producto);
            }
        }
        return cuidadosPersonales;
    }
    public Set<Souvenir> obtenerSouvenirs()throws IOException,ParseException{
        Set<Souvenir> souvenirs = new HashSet<>();
        for (Producto producto : leer(SOUVENIR)) {
            if (Souvenir.class==producto.getClass()) {
                souvenirs.add((Souvenir)producto);
            }
        }
        return souvenirs;
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

    public boolean almacenar(Producto producto){
        String path = obtenerRuta(producto.getClass().getSimpleName());
        if (existe(path)) {
            escribir(path, producto.toCsv());
        }
        return false;
    }


    
}
