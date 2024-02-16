package ies.puerto.parteUnoDos.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import ies.puerto.parteUnoDos.abstrac.Vehiculo;
import ies.puerto.parteUnoDos.vehiculos.Bicicleta;
import ies.puerto.parteUnoDos.vehiculos.Camion;
import ies.puerto.parteUnoDos.vehiculos.Coche;
import ies.puerto.parteUnoDos.vehiculos.Concesionario;
import ies.puerto.parteUnoDos.vehiculos.Motocicleta;

public class AppConcesionario {
    static Concesionario concesionario;
    static Scanner scanner = new Scanner(System.in);
    
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
        
        System.out.println("\n-Insertar\n-Modificar\n-Eliminar\n-Velocidad Media\n-Mostrar\n-Salir");
        String eleccionInicial = scanner.nextLine();
        switch (eleccionInicial.toLowerCase()) {
            case "insertar":
                boolean volver = false;
                do {
                    volver = insertar();
                } while (volver==false);
                break;
        
            case "modificar":
                volver = false;
                do {
                    volver = modificar();
                } while (volver==false);
                break;
                
            case "eliminar":
                volver = false;
                do {
                    volver = eliminar();
                } while (volver==false);
                break;

            case "velocidad media":
                volver = false;
                do {
                    volver = velocidadMedia();
                } while (volver==false);
                break;

            case "mostrar":
                volver = false;
                    do {
                        volver = mostrar();
                    } while (volver==false);
                    break;

            case "salir":
                return true;                
            
        }
        return false;
    }

        public static boolean insertar(){
            System.out.println("\n--AÑADIR--\n-Camion\n-Coche\n-Bicicleta\n-Motocicleta\n-Volver");
            String entradaInsertar= scanner.nextLine();
                switch (entradaInsertar.toLowerCase()) {
                    case "camion":
                        System.out.println("Introduzca la marca");
                        String marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        String modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        String matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        int velocidad = scanner.nextInt();
                        concesionario.addCamion(new Camion(marca, modelo, matricula, velocidad));
                        System.out.println("Añadido Camion: "+concesionario.obtenerCamion(matricula));
                        return false;

                    
                    case "coche":
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.addCoche(new Coche(matricula, marca, modelo, velocidad));
                        System.out.println("Añadido Coche: "+concesionario.obtenerCoche(matricula));
                        return false;


                    case "motocicleta":
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        Motocicleta motocicleta = new Motocicleta(matricula, marca, modelo, velocidad);
                        concesionario.addMotocicleta(motocicleta);
                        System.out.println("Añadida Motocicleta: "+concesionario.obtenerMotocicleta(matricula));
                        return false;


                    case "bicicleta":
                        System.out.println("Introduzca la marca");
                        marca = scanner.nextLine();
                        System.out.println("Introduzca el modelo");
                        modelo = scanner.nextLine();
                        System.out.println("Introduzca la matricula");
                        matricula = scanner.nextLine();
                        System.out.println("Introduzca la velocidad");
                        velocidad = scanner.nextInt();
                        concesionario.addBicicleta(new Bicicleta(marca, modelo, matricula, velocidad));
                        System.out.println("Añadida Bicicleta: "+concesionario.obtenerBicicletas(matricula));
                        return false;


                    case "volver":
                        return true;
                    

                    }
                return false;
        }

        public static boolean eliminar(){
            System.out.println("\n--ELIMIANR--\n-Camion\n-Coche\n-Bicicleta\n-Motocicleta\n-Volver\n");
            switch (scanner.nextLine().toLowerCase()) {
                case "camion":
                    System.out.println("\nEscriba la matricula del vehiculo: ");
                    Camion camionInsert = concesionario.obtenerCamion(scanner.nextLine());
                    if (camionInsert!=null) {
                        System.out.println(concesionario.removeCamion(camionInsert)==true ? "Se ha removido" : "No se ha removido");
                    }
                    else{
                        System.out.println("No existe ese vehiculo");
                    }
                    return false;

            
                case "coche":
                    System.out.println("\nEscriba la matricula del vehiculo: ");
                    Coche cocheInsert = concesionario.obtenerCoche(scanner.nextLine());
                    if (cocheInsert!=null) {
                        System.out.println(concesionario.removeCoche(cocheInsert)== true ? "Se ha removido" : "No se ha removido");
                    }
                    else{
                        System.out.println("No existe ese vehiculo");
                    }
                    return false;


                case "bicicleta":
                    System.out.println("\nEscriba la matricula del vehiculo: ");
                    Bicicleta bicicletaInsert = concesionario.obtenerBicicletas(scanner.nextLine());
                    if (bicicletaInsert!=null) {
                        System.out.println(concesionario.removeBicicleta(bicicletaInsert)== true ? "Se ha removido" : "No se ha removido");
                    }
                    else{
                        System.out.println("No existe ese vehiculo");
                    }
                    return false;


                case "motocicleta":
                    System.out.println("\nEscriba la matricula del vehiculo: ");
                    Motocicleta motocicletaInsert = concesionario.obtenerMotocicleta(scanner.nextLine());
                    if (motocicletaInsert!=null) {
                        System.out.println(concesionario.removeMotocicleta(motocicletaInsert)== true ? "Se ha removido" : "No se ha removido");
                    }
                    else{
                        System.out.println("No existe ese vehiculo");
                    }
                    return false;

                case "volver":
                    return true; 
            }
            return false;

        }

        public static boolean mostrar(){
            System.out.println("\n--MOSTRAR--\n-Camion\n-Coche\n-Bicicleta\n-Motocicleta\n-Volver\n");
            switch (scanner.nextLine().toLowerCase()) {
                case "camion":
                    System.out.println("\nLista\nEspecifico");
                        switch (scanner.nextLine().toLowerCase()) {
                            case "lista":
                                System.out.println(concesionario.getCamiones());
                                return false;
                            case "especifico":
                                System.out.println("\nEscriba la matricula del vehiculo: ");
                                System.out.println(concesionario.obtenerCamion(scanner.nextLine()));
                                return false;
                        }
                    break;
            
                case "coche":
                    System.out.println("\nLista\nEspecifico");
                    switch (scanner.nextLine().toLowerCase()) {
                        case "lista":
                            System.out.println(concesionario.getCoches());
                            return false;
                        case "especifico":
                            System.out.println("\nEscriba la matricula del vehiculo: ");
                            System.out.println(concesionario.obtenerCoche(scanner.nextLine()));
                            return false;
                }

                    break;
                case "bicicleta":
                    System.out.println("\nLista\nEspecifico");
                    switch (scanner.nextLine().toLowerCase()) {
                        case "lista":
                            System.out.println(concesionario.getBicicletas());
                            return false;
                        case "especifico":
                            System.out.println("\nEscriba la matricula del vehiculo: ");
                            System.out.println(concesionario.obtenerBicicletas(scanner.nextLine()));
                            return false;
                }

                    break;
                case "motocicleta":
                    System.out.println("\nLista\nEspecifico");
                    switch (scanner.nextLine().toLowerCase()) {
                        case "lista":
                            System.out.println(concesionario.getMotocicletas());
                            return false;
                        case "especifico":
                            System.out.println("\nEscriba la matricula del vehiculo: ");
                            System.out.println(concesionario.obtenerMotocicleta(scanner.nextLine()));
                            return false;
                    }

                    break;
                case "volver":
                    return true;
            }
            return false;
        }


        public static boolean velocidadMedia(){
            System.out.println("\n--Medias Vehiculos--\nCamiones\nCoches\nMotocicletas\nBicicletas\nTodos\nVolver\n");
            switch (scanner.nextLine().toLowerCase()) {
                case "coches":
                    System.out.println("Velocidad Media: "+concesionario.velocidadMediaCoches());
                    return false;

                case "camiones":
                    System.out.println("Velocidad Media: "+concesionario.velocidadMediaCamiones());  
                    return false;

                case "motocicletas":
                    System.out.println("Velocidad Media: "+concesionario.velocidadMediaMotocicletas());  
                    return false;

                case "bicicletas":
                    System.out.println("Velocidad Media: "+concesionario.velocidadMediaBicicletas());
                    return false;
                case "todos":
                    System.out.println("Velocidad Media: "+concesionario.velocidadMediaVehiculos());
                    return false;
                case "volver":
                    return true;
            }
            return false;
        }



        public static boolean modificar(){
            System.out.println("\n--Modificar--\nCamiones\nCoches\nMotocicletas\nBicicletas\nVolver\n");
            switch (scanner.nextLine().toLowerCase()) {
                case "camiones":
                    System.out.println("\n--Tipo Modificacion--\nMatricula\nMarca\nModelo\nVelocidad\n");
                    switch (scanner.nextLine().toLowerCase()) {
                        
                        case "matricula":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            Camion camion = concesionario.obtenerCamion(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            camion.setMatricula(scanner.nextLine());
                            return false;

                        case "marca":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            camion = concesionario.obtenerCamion(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            camion.setMarca(scanner.nextLine());
                            return false;

                        case "modelo":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            camion = concesionario.obtenerCamion(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            camion.setModelo(scanner.nextLine());
                            return false;

                        case "velocidad":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            camion = concesionario.obtenerCamion(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            camion.setVelocidad(scanner.nextInt());
                            return false;
                    

                    }
                    return false;

                case "coches":
                    System.out.println("\n--Tipo Modificacion--\nMatricula\nMarca\nModelo\nVelocidad\n");
                    switch (scanner.nextLine().toLowerCase()) {
                        
                        case "matricula":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            Coche coche = concesionario.obtenerCoche(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            coche.setMatricula(scanner.nextLine());
                            return false;

                        case "marca":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            coche = concesionario.obtenerCoche(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            coche.setMarca(scanner.nextLine());
                            return false;

                        case "modelo":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            coche = concesionario.obtenerCoche(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            coche.setModelo(scanner.nextLine());
                            return false;

                        case "velocidad":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            coche = concesionario.obtenerCoche(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            coche.setVelocidad(scanner.nextInt());
                            return false;
                    

                    }
                    return false;

                case "motocicletas":
                    System.out.println("\n--Tipo Modificacion--\nMatricula\nMarca\nModelo\nVelocidad\n");
                    switch (scanner.nextLine().toLowerCase()) {
                        
                        case "matricula":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            Motocicleta motocicleta = concesionario.obtenerMotocicleta(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            motocicleta.setMatricula(scanner.nextLine());
                            return false;

                        case "marca":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            motocicleta = concesionario.obtenerMotocicleta(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            motocicleta.setMarca(scanner.nextLine());
                            return false;

                        case "modelo":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            motocicleta = concesionario.obtenerMotocicleta(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            motocicleta.setModelo(scanner.nextLine());
                            return false;

                        case "velocidad":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            motocicleta = concesionario.obtenerMotocicleta(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            motocicleta.setVelocidad(scanner.nextInt());
                            return false;
                    

                    }
                    return false;

                case "bicicletas":
                    System.out.println("\n--Tipo Modificacion--\nMatricula\nMarca\nModelo\nVelocidad\n");
                    switch (scanner.nextLine().toLowerCase()) {
                        
                        case "matricula":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            Bicicleta bicicleta = concesionario.obtenerBicicletas(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            bicicleta.setMatricula(scanner.nextLine());
                            return false;

                        case "marca":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            bicicleta = concesionario.obtenerBicicletas(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            bicicleta.setMarca(scanner.nextLine());
                            return false;

                        case "modelo":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            bicicleta = concesionario.obtenerBicicletas(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            bicicleta.setModelo(scanner.nextLine());
                            return false;

                        case "velocidad":
                            System.out.println("\nIndique la matricula del vehiculo: ");
                            bicicleta = concesionario.obtenerBicicletas(scanner.nextLine());
                            System.out.println("Indique el nuevo valor: ");
                            bicicleta.setVelocidad(scanner.nextInt());
                            return false;
                    

                    }
                    return false;
            
                case "volver":
                    return true;
            }
            return false;
        }
        
    }

