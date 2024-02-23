package es.ies.puerto.modelo.ficheros.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
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
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;

public class FileCsv extends Ficheros{


    @Override
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
    @Override
    public Set<Producto> leer(String tipo) throws IOException, ParseException {
        String path = obtenerRuta(tipo);
        Set<Producto> productos = new HashSet<>();
        if (existe(path)) {
            File fichero = new File(path);
            try ( BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea=br.readLine()) != null) {
    
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
                return productos;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productos;
    }
    @Override
    public boolean borrar(List<Alimento> lista)throws IOException,ParseException{
         String path = obtenerRuta(ALIMENTO);
        try {

            File file = new File(path);
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] emptyContent = {};
            outputStream.write(emptyContent);
            outputStream.close();
            for (Alimento alimento : lista) {
                escribir(path, alimento.toCsv());
            }
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean borrar(Set<Producto> lista){
        String path = elegirPathSet(lista);
        try {
            File file = new File(path);
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] emptyContent = {};
            outputStream.write(emptyContent);
            outputStream.close();
            escribirSet(lista, path);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean borrar(Map<String, Aparato> lista){
        String path = obtenerRuta(APARATO);
        try {

            File file = new File(path);
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] emptyContent = {};
            outputStream.write(emptyContent);
            outputStream.close();
            for (Aparato aparato : lista.values()) {
                escribir(path, aparato.toCsv());
            }
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    
    @Override
    public Producto crearAlimento(String[] array) throws ParseException{
        return new Alimento(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI], array[COLUMNA_FCADUCIDAD]);
    }

    @Override
    public Producto crearAparato(String[] array) {
        return new Aparato(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI]);
    }
    @Override
    public Producto crearCuidadoPersonal(String[] array) {
        return new CuidadoPersonal(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI],Integer.parseInt(array[COLUMNA_POPULARIDAD]));
    }
    @Override
    public Producto crearSouvenir(String[] array) {
        return new Souvenir(array[COLUMNA_NOMBRE], Float.parseFloat(array[COLUMNA_PRECIO]), array[COLUMNA_FENTRADA], array[COLUMNA_UDI]);
    }
    @Override
    public List<Alimento> obtenerAlimentos()throws IOException,ParseException{
        List<Alimento> alimentos = new ArrayList<>();
        for (Producto producto : leer(ALIMENTO)) {
            if (producto instanceof Alimento) {
                alimentos.add((Alimento)producto);
            }
        }
        return alimentos;
    }
    @Override
    public Map<String, Aparato> obtenerAparatos()throws IOException,ParseException{
        Map<String, Aparato> aparatos = new HashMap<>();
        for (Producto producto : leer(APARATO)) {
            if (producto instanceof Aparato) {
                aparatos.put(producto.getUdi(),(Aparato)producto);
            }
        }
        return aparatos;
    }
    @Override
    public Set<CuidadoPersonal> obtenerCuidadoPersonal()throws IOException,ParseException{
        Set<CuidadoPersonal> cuidadosPersonales = new HashSet<>();
        for (Producto producto : leer(CUIDADO_PERSONAL)) {
            if (producto instanceof CuidadoPersonal) {
                cuidadosPersonales.add((CuidadoPersonal)producto);
            }
        }
        return cuidadosPersonales;
    }
    @Override
    public Set<Souvenir> obtenerSouvenirs()throws IOException,ParseException{
        Set<Souvenir> souvenirs = new HashSet<>();
        for (Producto producto : leer(SOUVENIR)) {
            if (producto instanceof Souvenir) {
                souvenirs.add((Souvenir)producto);
            }
        }
        return souvenirs;
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
    @Override
    public boolean almacenar(Producto producto){
        String path = obtenerRuta(producto.getClass().getSimpleName());
        if (existe(path)) {
            escribir(path, producto.toCsv());
            return true;
        }
        return false;
    }

    public String elegirPathSet(Set<Producto> lista){
        String path="";
        try {
            for (Producto producto : lista) {
                Souvenir souvenir = (Souvenir)producto;
                path = obtenerRuta(souvenir.getClass().getSimpleName());
            }
        } catch (Exception e) {
            for (Producto producto : lista) {
                CuidadoPersonal cuidadoPersonal = (CuidadoPersonal)producto;
                path = obtenerRuta(cuidadoPersonal.getClass().getSimpleName());
            }
        }
        return path;
    }
    public void escribirSet(Set<Producto> lista, String path){
        if (path.equals(RUTA_SOUVENIRS_CSV)) {
            for (Producto producto : lista) {
                Souvenir souvenir = (Souvenir) producto;
                escribir(path, souvenir.toCsv());
            }
        }else{
            for (Producto producto : lista) {
                CuidadoPersonal cuidadoPersonal = (CuidadoPersonal) producto;
                escribir(path, cuidadoPersonal.toCsv());
            }
        }
        
    }


    
}
