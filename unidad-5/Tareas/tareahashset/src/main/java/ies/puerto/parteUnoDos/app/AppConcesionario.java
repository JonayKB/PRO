package ies.puerto.parteUnoDos.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import ies.puerto.parteUnoDos.vehiculos.Bicicleta;
import ies.puerto.parteUnoDos.vehiculos.Camion;
import ies.puerto.parteUnoDos.vehiculos.Coche;
import ies.puerto.parteUnoDos.vehiculos.Concesionario;
import ies.puerto.parteUnoDos.vehiculos.Motocicleta;

public class AppConcesionario {
    static Camion camion6;
    static Bicicleta bicicleta6;
    static Motocicleta motocicleta6;
    static Coche coche6;
    static Concesionario concesionario;
        
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
        coches.add(coche5);

        
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
        motocicletas.add(motocicleta5);


        Camion camion1 = new Camion("Chevrolet","Silverado","UVW567",150);
        Camion camion2 = new Camion("Ford","Ranger","LMN890",130);
        Camion camion3 = new Camion("Toyota","Hilux","PQR123",140);
        Camion camion4 = new Camion("Nissan","Navara","ABC456",145);
        Camion camion5 = new Camion("Dodge","Ram","XYZ789",160);
        
        Map<String,Camion> camiones =  new HashMap<>();
        camiones.put(camion1.getMatricula(),camion1);
        camiones.put(camion2.getMatricula(),camion2);
        camiones.put(camion3.getMatricula(),camion3);
        camiones.put(camion4.getMatricula(),camion4);
        camiones.put(camion5.getMatricula(),camion5);


        Bicicleta bicicleta1 = new Bicicleta("Trek","MountainBike","PQR456",30);
        Bicicleta bicicleta2 = new Bicicleta("Giant","CityBike","MNO789",25);
        Bicicleta bicicleta3 = new Bicicleta("Specialized","RoadBike","JKL012",28);
        Bicicleta bicicleta4 = new Bicicleta("Cannondale","HybridBike","DEF345",26);
        Bicicleta bicicleta5 = new Bicicleta("Schwinn","Cruiser","MNO678",22);
        
        Map<String,Bicicleta> bicicletas =  new HashMap<>();
        bicicletas.put(bicicleta1.getMatricula(),bicicleta1);
        bicicletas.put(bicicleta2.getMatricula(),bicicleta2);
        bicicletas.put(bicicleta3.getMatricula(),bicicleta3);
        bicicletas.put(bicicleta4.getMatricula(),bicicleta4);
        bicicletas.put(bicicleta5.getMatricula(),bicicleta5);

        

        concesionario = new Concesionario(coches,motocicletas, camiones, bicicletas);


        boolean salida = false;
        do {
            salida = menu();

        } while (salida == false);

        
        
        
    }

    public static boolean menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-Insertar\n-Modificar\n-Eliminar\n-VelocidadMedia\n-Mostrar\n-Salir");
        String eleccionInicial = scanner.nextLine();
        switch (eleccionInicial) {
            case "Insertar":
                System.out.println("\n-Camion\n-Coche\n-Bicicleta\n-Motocicleta");
                switch (scanner.nextLine()) {
                    case "Camion":
                        System.out.println("Introduzca la marca");
                        String marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        String modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        String matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        int velocidad = scanner.nextInt();
                        camion6 = new Camion(marca, modelo, matricula, velocidad);
                        concesionario.addCamion(camion6);
                        System.out.println("Añadido Camion: "+camion6);
                        break;
                
                    case "Coche":
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        coche6 = new Coche(matricula, marca, modelo, velocidad);
                        concesionario.addCoche(coche6);
                        System.out.println("Añadido Coche: "+coche6);
                        break;

                        case "Motocicleta":
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        motocicleta6 = new Motocicleta(matricula, marca, modelo, velocidad);
                        concesionario.addMotocicleta(motocicleta6);
                        System.out.println("Añadida Motocicleta: "+motocicleta6);
                        break;

                        case "Bicicleta":
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        bicicleta6 = new Bicicleta(marca, modelo, matricula, velocidad);
                        concesionario.addBicicleta(bicicleta6);
                        System.out.println("Añadida Bicicleta: "+bicicleta6);
                        break;
                }
                break;
        
            case "Modificar":
                break;
                
            case "Eliminar":
                System.out.println("\n-Camion\n-Coche\n-Bicicleta\n-Motocicleta\n");
                switch (scanner.nextLine()) {
                    case "Camion":
                    System.out.println("\nEscriba la matricula del vehiculo: ");
                    Camion camionInsert = concesionario.obtenerCamion(scanner.nextLine());
                    if (camionInsert!=null) {
                        System.out.println(concesionario.removeCamion(camionInsert)==true ? "Se ha removido" : "No se ha removido");
                    }
                    else{
                        System.out.println("No existe ese vehiculo");
                    }
                    break;
                
                    case "Coche":
                        System.out.println("\nEscriba la matricula del vehiculo: ");
                        Coche cocheInsert = concesionario.obtenerCoche(scanner.nextLine());
                        if (cocheInsert!=null) {
                            System.out.println(concesionario.removeCoche(cocheInsert)== true ? "Se ha removido" : "No se ha removido");
                        }
                        else{
                            System.out.println("No existe ese vehiculo");
                        }
                        break;

                    case "Bicicleta":
                    System.out.println("\nEscriba la matricula del vehiculo: ");
                    Bicicleta bicicletaInsert = concesionario.obtenerBicicletas(scanner.nextLine());
                    if (bicicletaInsert!=null) {
                        System.out.println(concesionario.removeBicicleta(bicicletaInsert)== true ? "Se ha removido" : "No se ha removido");
                    }
                    else{
                        System.out.println("No existe ese vehiculo");
                    }
                    break;

                    case "Motocicleta":
                    System.out.println("\nEscriba la matricula del vehiculo: ");
                    Motocicleta motocicletaInsert = concesionario.obtenerMotocicleta(scanner.nextLine());
                    if (motocicletaInsert!=null) {
                        System.out.println(concesionario.removeMotocicleta(motocicletaInsert)== true ? "Se ha removido" : "No se ha removido");
                    }
                    else{
                        System.out.println("No existe ese vehiculo");
                    }
                    break;
                }
                break;
            case "Velocidad Media":
                break;
            case "Enseñar":
                break;
            case "Salir":
                return true;                
            
        }
        return false;
        }
}

