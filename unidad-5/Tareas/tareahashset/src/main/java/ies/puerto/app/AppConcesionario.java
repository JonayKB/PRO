package ies.puerto.app;

import java.util.ArrayList;
import java.util.HashSet;

import ies.puerto.vehiculos.Coche;
import ies.puerto.vehiculos.Concesionario;
import ies.puerto.vehiculos.Motocicleta;

public class AppConcesionario {
    
    public static void main(String[] args) {
        Coche coche1 = new Coche("ABC123", "Toyota", "Corolla", 60);
        Coche coche2 = new Coche("XYZ789", "Honda", "Civic", 75);
        Coche coche3 = new Coche("DEF456", "Ford", "Mustang", 100);
        Coche coche4 = new Coche("GHI789", "Chevrolet", "Impala", 80);
        Coche coche5 = new Coche("JKL012", "Volkswagen", "Golf", 65);

        HashSet<Coche> coches = new HashSet<>();
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);

        Motocicleta motocicleta1 = new Motocicleta("MNO345", "Harley-Davidson", "Sportster", 50);
        Motocicleta motocicleta2 = new Motocicleta("PQR678", "Yamaha", "YZF R6", 90);
        Motocicleta motocicleta3 = new Motocicleta("STU901", "Ducati", "Monster", 70);
        Motocicleta motocicleta4 = new Motocicleta("VWX234", "Suzuki", "GSX-R750", 80);
        Motocicleta motocicleta5 = new Motocicleta("ZAB567", "Kawasaki", "Ninja", 85);

        ArrayList<Motocicleta> motocicletas = new ArrayList<>();

        motocicletas.add(motocicleta1);
        motocicletas.add(motocicleta2);
        motocicletas.add(motocicleta3);
        motocicletas.add(motocicleta4);

        Concesionario concesionario =new Concesionario(coches,motocicletas);
        System.out.println("Añadir Motocicleta Duplicada: "+concesionario.addMotocicleta(motocicleta2));
        System.out.println("Añadir Motocicleta: "+concesionario.addMotocicleta(motocicleta5));
        System.out.println("Eliminar Motocicleta: "+concesionario.removeMotocicleta(motocicleta5));
        System.out.println("Obtener Motocicleta: "+concesionario.obtenerMotocicleta("VWX234"));
        System.out.println("Velocidad Media Motocicletas: "+concesionario.velocidadMediaMotocicletas());
        System.err.println();
        System.out.println("Añadir Coche: "+concesionario.addCoche(coche5));
        System.out.println("Eliminar Coche: "+concesionario.removeCoche(coche5));
        System.out.println("Obtener Coche: "+concesionario.obtenerCoche("DEF456"));
        System.out.println("Velocidad Media Coches: "+concesionario.velocidadMediaCoches());
        System.out.println();
        System.out.println("Media vehiculos: "+concesionario.velocidadMediaVehiculos());



    }
}

