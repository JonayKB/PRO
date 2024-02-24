package es.ies.puerto.modelo.ficheros.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
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
    public Set<Producto> leer(String path,String tipo) throws IOException, ParseException {
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
    public boolean borrar(String path,String texto){

        try {

            File file = new File(path);
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] emptyContent = {};
            outputStream.write(emptyContent);
            outputStream.close();
            almacenar(path, texto);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public boolean modificar(String path, String text){
        return borrar(path, text);
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
    public boolean escribir(String path, String texto) {
    if (existe(path)) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(texto);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return false;
    }
    @Override
    public boolean almacenar(String path, String texto){
            return escribir(path, texto); 
    }

    public String listaToCsv(List<Alimento> alimentos){
        StringBuilder resultado = new StringBuilder();
        for (Alimento alimento : alimentos) {
            resultado.append(alimento.toCsv()+"\n");
        }
        return resultado.toString();
    }
    public String listaToCsv(Map<String,Aparato> aparatos){
        StringBuilder resultado = new StringBuilder();
        for (Aparato aparato : aparatos.values()) {
            resultado.append(aparato.toCsv()+"\n");
        }
        return resultado.toString();
    }
    public String listaToCsv(Set<?> lista){
        StringBuilder resultado = new StringBuilder();
        String tipo = obtenerTipoSet(lista);
        if (tipo.equals(SOUVENIR)) {
            Set<Souvenir> souvenirs = (Set<Souvenir>)lista;
            for (Souvenir souvenir : souvenirs) {
                resultado.append(souvenir.toCsv()+"\n");
            }
        }else if (tipo.equals(CUIDADO_PERSONAL)) {
            Set<CuidadoPersonal> cuidadoPersonals = (Set<CuidadoPersonal>)lista;
            for (CuidadoPersonal cuidadoPersonal : cuidadoPersonals) {
                resultado.append(cuidadoPersonal.toCsv()+"\n");
            }
        }
        return resultado.toString();
        
    }

    public static String obtenerTipoSet(Set<?> set) {
        if (!set.isEmpty()) {
            Object firstElement = set.iterator().next();
            return firstElement.getClass().getSimpleName();
        }
        return "null";
        
    }
    
    
}
