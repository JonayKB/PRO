package ies.puerto.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppPersona {
    static Map<String, Persona> personaHashMap;
    static List<Persona> personasList;
    public static void main(String[] args) {
        personaHashMap= new HashMap<>();
        personasList= new ArrayList<>();
        Persona persona1 = new Persona("Federico", "12345678A");
        addPersonaList(persona1);
        addPersonaMap(persona1);
        System.out.println(personaHashMap);
        System.out.println(personasList);




    }

    public static boolean addPersonaList(Persona persona){
        if (!existePersonaLista(persona)) {
            return personasList.add(persona);
        }
        return true;
        
    }

    public static boolean existePersonaLista(Persona persona){
        if (personasList.isEmpty()) {
            return false;
        }
        if (!personasList.contains(persona)) {
            return false;
        }
        return true;
    }





    public static boolean addPersonaMap(Persona persona){
        if (!existePersonaHashMap(persona)) {
            personaHashMap.put(persona.getDni(),persona);
        }
        return true;
    }

    public static boolean existePersonaHashMap(Persona persona){
        if (personaHashMap.isEmpty()) {
            return false;
        }
        if (!personaHashMap.containsKey(persona.getDni())) {
            return false;
        }
        return true;
    }


}
