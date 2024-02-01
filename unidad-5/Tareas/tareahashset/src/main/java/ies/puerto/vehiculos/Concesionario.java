package ies.puerto.vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Concesionario {
    HashSet<Coche> coches = new HashSet<>();
    List<Motocicleta> motocicletas = new ArrayList<>();

    public Concesionario() {
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
    }
    /**
     * Añade una motocicleta a la lista de motos
     * @param motocicleta que añade
     * @return si la añadio o no
     */
    public boolean addMotocicleta(Motocicleta motocicleta){
        if (motocicletas.contains(motocicleta)) {
            return false;
        }
        motocicletas.add(motocicleta);
        return true;
    }
    /**
     * Elimina una motocicleta de la lista de motos
     * @param motocicleta que elimina
     * @return si la elimino o no
     */
    public boolean removeMotocicleta(Motocicleta motocicleta){
        if (motocicletas.isEmpty()) {
            return false;
        }
        motocicletas.remove(motocicleta);
        return true;
    }
    /**
     * Obtiene la motocicleta de la lista 
     * @param matricula de la motocicleta a buscar
     * @return la motocicleta si la encuentra
     */
    public Motocicleta obtenerMotocicleta(String matricula){
        if (motocicletas.isEmpty()) {
            return null;
        }
        for (Motocicleta motocicleta : motocicletas) {
            if (motocicleta.getMatricula()==matricula) {
                return motocicleta;
                
            }
        }
        return null;
    }
    /**
     * La velocidad media de todas las motocicletas en la lista
     * @return la velocidad media
     */
    public float velocidadMediaMotocicletas(){
        int resultado=0;
        if (motocicletas.isEmpty()) {
            return resultado;
        }
        for (Motocicleta motocicleta : motocicletas) {
            resultado+=motocicleta.getVelocidad();
        }
        return resultado/motocicletas.size();
    }

    

    /**
     * Añade un coche a la lista de coches
     * @param coche a añadir
     * @return si lo intente añadir o no
     */
    public boolean addCoche(Coche coche){
        coches.add(coche);
        return true;
    }
    /**
     * Elimina un coche de la lista de coches
     * @param coche a eliminar
     * @return si lo elimino o no
     */
    public boolean removeCoche(Coche coche){
        if (coches.isEmpty()) {
            return false;
        }
        coches.remove(coche);
        return true;
    }
    /**
     * Obtiene un coche por la matricula
     * @param matricula a buscar
     * @return el cochce vinculado si existe
     */
    public Coche obtenerCoche(String matricula){
        if (coches.isEmpty()) {
            return null;
        }
        for (Coche coche : coches) {
            if (coche.getMatricula()==matricula) {
                return coche;
                
            }
        }
        return null;
    }
    /**
     * La velocidad media de todos los coches
     * @return la velocidad media
     */
    public float velocidadMediaCoches(){
        int resultado=0;
        if (coches.isEmpty()) {
            return resultado;
        }
        for (Coche coche : coches) {
            resultado+=coche.getVelocidad();
        }
        return resultado/coches.size();
    }


    /**
     * La velocidad media de todos los vehiculos
     * @return la velocidad media
     */
    public float velocidadMediaVehiculos(){    
        return (velocidadMediaCoches()+velocidadMediaMotocicletas())/(motocicletas.size()+coches.size());
    }
    

    
}

