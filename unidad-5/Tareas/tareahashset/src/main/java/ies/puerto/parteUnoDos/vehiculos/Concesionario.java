package ies.puerto.parteUnoDos.vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Concesionario {
    HashSet<Coche> coches = new HashSet<>();
    List<Motocicleta> motocicletas = new ArrayList<>();
    Map<String, Camion> camiones = new HashMap<>();
    Map<String, Bicicleta> bicicletas = new HashMap<>();


    public HashSet<Coche> getCoches() {
        return this.coches;
    }

    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }

    public List<Motocicleta> getMotocicletas() {
        return this.motocicletas;
    }

    public void setMotocicletas(List<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }

    public Map<String,Camion> getCamiones() {
        return this.camiones;
    }

    public void setCamiones(Map<String,Camion> camiones) {
        this.camiones = camiones;
    }

    public Map<String,Bicicleta> getBicicletas() {
        return this.bicicletas;
    }

    public void setBicicletas(Map<String,Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public Concesionario() {
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas, Map<String, Camion> camiones, Map<String, Bicicleta> bicicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
        this.camiones = camiones;
        this.bicicletas = bicicletas;
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
            if (motocicleta.getMatricula().equals(matricula)) {
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
        return coches.add(coche);
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
            if (coche.getMatricula().equals(matricula)) {
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
        return (velocidadMediaCoches()+velocidadMediaMotocicletas()+velocidadMediaCamiones()+velocidadMediaBicicletas())/(4);
    }
    
    public boolean addCamion(Camion camion){
        if (!camiones.isEmpty() && !camiones.containsKey(camion.getMatricula())) {
            camiones.put(camion.getMatricula(), camion);
        
        }
        return true;
    }

    public boolean removeCamion(Camion camion){
        if (!camiones.isEmpty() && camiones.containsKey(camion.getMatricula())) {
            camiones.remove(camion.getMatricula());
            return true;
        }
        return false;
    }

    public Camion obtenerCamion(String matricula){
        if (!camiones.isEmpty() ) {
            return camiones.get(matricula);
        }
        return null;
    }

    public float velocidadMediaCamiones(){
        int resultado =0;
        if (!camiones.isEmpty()) {
            for (Camion camion : camiones.values()) {
                resultado +=camion.getVelocidad();
        
            }
            return resultado/camiones.size();
        }
        return resultado;
    }



    public boolean addBicicleta(Bicicleta bicicleta){
        if (!bicicletas.isEmpty() && !bicicletas.containsKey(bicicleta.getMatricula())) {
            bicicletas.put(bicicleta.getMatricula(), bicicleta);
        
        }
        return true;
    }

    public boolean removeBicicleta(Bicicleta bicicleta){
        if (!bicicletas.isEmpty() && bicicletas.containsKey(bicicleta.getMatricula())) {
            bicicletas.remove(bicicleta.getMatricula());
            return true;
        }
        return false;
    }

    public Bicicleta obtenerBicicletas(String matricula){
        if (!bicicletas.isEmpty() ) {
            return bicicletas.get(matricula);
        }
        return null;
    }

    public float velocidadMediaBicicletas(){
        int resultado =0;
        if (!bicicletas.isEmpty()) {
            for (Bicicleta bicicleta : bicicletas.values()) {
                resultado +=bicicleta.getVelocidad();
        
            }
            return resultado/bicicletas.size();
        }
        return resultado;
    }    
    
}

