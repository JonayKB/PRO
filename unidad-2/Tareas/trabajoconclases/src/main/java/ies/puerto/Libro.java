package ies.puerto;
/**
 * Crea una clase Libro con las propiedades titulo, autor y añoPublicacion. 
 * Crea objetos de esta clase y realiza operaciones como imprimir la información del libro, cambiar el autor, etc.
 * @author JonayKB
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Libro(){};
    

    /**
     * Constructor
     * @param titulo del libro
     * @param autor del libro
     * @param anoPublicacion del libro
     */
    public Libro(String titulo, String autor, int anoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }
    //Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }


    public String getAutor() {
        return this.autor;
    }


    public int getAnoPublicacion() {
        return this.anoPublicacion;
    }

    /**
     * Función que devuelve toda la información
     * @return String que contiene toda la información
     */
    public String imprimir(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nAño Publicación: "+anoPublicacion;
    }

    
}
