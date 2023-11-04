package ies.puerto;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public Libro(){};
    public Libro(String titulo){
        this.titulo = titulo;
    }
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro(String titulo, String autor, int anoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return this.anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public String imprimir(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nAño Publicación: "+anoPublicacion;
    }

    
}
