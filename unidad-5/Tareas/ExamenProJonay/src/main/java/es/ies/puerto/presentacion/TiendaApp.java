package es.ies.puerto.presentacion;

import java.io.IOException;
import java.text.ParseException;

import java.util.Scanner;

import es.ies.puerto.modelo.ficheros.csv.FileCsv;



public class TiendaApp {
    static Scanner scanner;
    public static void main(String[] args) throws ParseException,IOException{
        FileCsv fileCsv = new FileCsv();
        System.out.println(fileCsv.leer("src/main/resources/alimentos.csv", "alimento"));
    }

    public void menu(){
        scanner = new Scanner(System.in);
        boolean mantener =true;
        System.out.println("--Menu--\n-Añadir\n-Eliminar\n-Mostrar\n-Modificar\n-Salir");
        do {
            switch (scanner.next().toLowerCase()) {
                case "añadir":
                    menuAñadir();
                    break;

                case "eliminar":
                    menuEliminar();
                    break;

                case "mostrar":
                    menuMostrar();
                    break;

                case "modificar":
                    menuModificar();
                    break;
                
                case "volver":
                    mantener= false;
                    break;
                default:
                    
                    
            }
        } while (mantener);
    }
    public void menuAñadir(){}
    public void menuEliminar(){}
    public void menuMostrar(){
        Boolean mantener= true;
        do {
            System.out.println("--Mostrar--\n-Alimentos\n-Aparatos\n-Souvenirs\n-Cuidado Personal\n-Volver");
            switch (scanner.next().toLowerCase()) {
                case "alimentos":

                    break;
                case "aparatos":
                    
                    break;
                case "souvenirs":
                    
                    break;
                case "cuidado personal":
                    
                    break;
                case "volver":
                    mantener = false;
                    break;
            }
        } while (mantener);
    }
    public void menuModificar(){}


}
