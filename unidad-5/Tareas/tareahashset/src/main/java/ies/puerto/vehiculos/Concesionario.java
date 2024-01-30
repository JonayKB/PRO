package ies.puerto.vehiculos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Concesionario {
    HashSet<Coche> coches = new HashSet<>();
    List<Motocicleta> motocicletas = new ArrayList<>();

    public Concesionario() {
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
    }
    
    public boolean addMotocicleta(Motocicleta motocicleta){
        motocicletas.add(motocicleta);
        return true;
    }
    public boolean removeMotocicleta(Motocicleta motocicleta){
        if (motocicletas.isEmpty()) {
            return false;
        }
        motocicletas.remove(motocicleta);
        return true;
    }
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

    


    public boolean addCoche(Coche coche){
        coches.add(coche);
        return true;
    }
    public boolean removeCoche(Coche coche){
        if (coches.isEmpty()) {
            return false;
        }
        coches.remove(coche);
        return true;
    }
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



    public float velocidadMediaVehiculos(){
        int resultado =0;
        if (coches.isEmpty()||motocicletas.isEmpty()) {
            return resultado;
        }
        for (Coche coche : coches) {
            resultado+=coche.getVelocidad();
        }
        for (Motocicleta motocicleta : motocicletas) {
            resultado+=motocicleta.getVelocidad();
        }
        return resultado/(motocicletas.size()+coches.size());
    }
    
}
