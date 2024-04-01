package es.ies.puerto.modelo.ficheros.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.modelo.ficheros.abstrac.Ficheros;
import es.ies.puerto.modelo.impl.Personaje;

/**
 * Contiene toda las funciones del interfaz necesaria para la administracion de ficheros con JSON
 */
public class Json extends Ficheros{

    @Override
    public List<Personaje> leer() {
        List<Personaje> personajes = new ArrayList<>();
        try {
            String json = new String(Files.readAllBytes(Paths.get(RUTA_JSON)));
            Type listType = new TypeToken<List<Personaje>>(){}.getType();
            personajes = new Gson().fromJson(json, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personajes;

    }

    @Override
    public boolean actualizar(List<Personaje> personas) {
        return escribir(personas);
    }

    @Override
    public boolean escribir(List<Personaje> personas) {
        try (FileWriter writer = new FileWriter(RUTA_JSON)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personas, writer);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean modificar(List<Personaje> personas) {
        return escribir(personas);
    }





    
    
}
