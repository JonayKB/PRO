import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Libro;

public class LibroTest {
    Libro libro3 = new Libro("La Mancha", "Federico", 2013);
    Libro libro2 = new Libro("La Mancha", "Federico");
    Libro libro1 = new Libro("La Mancha");
    Libro libro0 = new Libro();


    
    public void imprimirTest(Libro clase, String titulo, String autor , int anoPublicacion){
        String resultado = clase.imprimir();
        String resultadoOK = "Titulo: "+titulo+"\nAutor: "+autor+"\nAño Publicación: "+anoPublicacion;
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void imprimirLibro0TestOK(){
        imprimirTest(libro0, null, null, 0);
    }
    @Test
    public void imprimirLibro1TestOK(){
        imprimirTest(libro1, "La Mancha", null, 0);
    }
    @Test
    public void imprimirLibro2TestOK(){
        imprimirTest(libro2, "La Mancha", "Federico", 0);
    }
    @Test
    public void imprimirLibro3TestOK(){
        imprimirTest(libro3, "La Mancha", "Federico", 2013);
    }
    

    @Test
    public void getTituloTestOK(){
        String resultado = libro3.getTitulo();
        String resultadoOK = "La Mancha";
        Assertions.assertEquals(resultadoOK,resultado);
    }
    @Test
    public void getAutorTestOK(){
        String resultado = libro3.getAutor();
        String resultadoOK = "Federico";
        Assertions.assertEquals(resultadoOK,resultado);
    }
    @Test
    public void getAnoPublicacionTestOK(){
        int resultado = libro3.getAnoPublicacion();
        int resultadoOK = 2013;
        Assertions.assertEquals(resultadoOK,resultado);
    }

}
