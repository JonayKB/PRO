package es.ies.puerto.presentacion;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import es.ies.puerto.modelo.productos.Alimento;
import es.ies.puerto.modelo.productos.Aparato;
import es.ies.puerto.modelo.productos.CuidadoPersonal;
import es.ies.puerto.modelo.productos.Souvenir;
import es.ies.puerto.negocio.Tienda;

public class TiendaApp {
    static Scanner scanner;
    public static void main(String[] args) throws ParseException{
        Alimento alimento = new Alimento("Manzanas", 2.50f, "2024-01-09","ALM001","2024-01-15");
        Alimento alimento2 = new Alimento("Arroz",3.75f,	"2024-01-15","ALM003","2024-02-30");
        Aparato aparato2 = new Aparato("Cafetera",39.99f,"2024-02-09","APA003");
        Aparato aparato = new Aparato("Televisor LED",499.99f,"2024-02-09","APA001");
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal("Cepillo de dientes",2.29f,"2024-02-09","CUI003",6);
        CuidadoPersonal cuidadoPersonal2 = new CuidadoPersonal("Champú",3.99f,"2024-02-09","CUI001"	,7);
        Souvenir souvenir = new Souvenir("Imán de nevera",1.99f,"2024-02-09","SOU001");

        ArrayList<Alimento> alimentos = new ArrayList<>();
        alimentos.add(alimento);
        alimentos.add(alimento2);

        HashMap<String, Aparato>aparatos = new HashMap<>();
        aparatos.put(aparato.getUdi(),aparato);
        aparatos.put(aparato2.getUdi(), aparato2);

        HashSet<CuidadoPersonal> cuidadoPersonales = new HashSet<>();
        cuidadoPersonales.add(cuidadoPersonal);
        cuidadoPersonales.add(cuidadoPersonal2);
        
        HashSet<Souvenir> souvenirs = new HashSet<>();
        souvenirs.add(souvenir);

        Tienda tienda = new Tienda(alimentos, aparatos, cuidadoPersonales, souvenirs);
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
