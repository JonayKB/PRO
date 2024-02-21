package es.ies.puerto.presentacion;


import java.util.Scanner;

import es.ies.puerto.modelo.ficheros.csv.FileCsv;
import es.ies.puerto.negocio.Tienda;



public class TiendaApp {
    static Scanner scanner;
    static Tienda tienda;
    static FileCsv fileCsv;
    public static void main(String[] args) {
        
    }

    public void menu(){
        scanner = new Scanner(System.in);
        boolean mantener =true;
        System.out.println("--Menu--\n-Añadir\n-Eliminar\n-Mostrar\n-Modificar\n-Salir");
        do {
            switch (scanner.next().toLowerCase()) {
                case "añadir":
                    menuAniadir();
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
    
    public void menuAniadir(){
        //TODO
    }
    public void menuEliminar(){
        //TODO
    }
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
                default:
                    System.out.println("No existe esa opcion");
            }
        } while (mantener);
    }
    public void menuModificar(){
        //TODO
    }


}
