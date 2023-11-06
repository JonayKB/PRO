import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Libro;

public class LibroTest {
    Libro libro1 = new Libro("La Mancha", "Federico", 2013);
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
    public void imprimirLibro3TestOK(){
        imprimirTest(libro1, "La Mancha", "Federico", 2013);
    }
    

    @Test
    public void getTituloTestOK(){
        String resultado = libro1.getTitulo();
        String resultadoOK = "La Mancha";
        Assertions.assertEquals(resultadoOK,resultado);
    }
    @Test
    public void getAutorTestOK(){
        String resultado = libro1.getAutor();
        String resultadoOK = "Federico";
        Assertions.assertEquals(resultadoOK,resultado);
    }
    @Test
    public void getAnoPublicacionTestOK(){
        int resultado = libro1.getAnoPublicacion();
        int resultadoOK = 2013;
        Assertions.assertEquals(resultadoOK,resultado);
    }

}
