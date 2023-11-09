import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ies.puerto.Libro;

public class LibroTest {

    Libro libro;
    String titulo = "La Mancha";
    String autor = "Federico";
    int anoPublicacion = 2013;

    @BeforeEach
    public void beforeEach() {
        libro = new Libro(titulo, autor, anoPublicacion);
    }
    
    
    public void imprimirTest(Libro clase, String titulo, String autor , int anoPublicacion){
        String resultado = clase.imprimir();
        String resultadoOK = "Titulo: "+titulo+"\nAutor: "+autor+"\nAño Publicación: "+anoPublicacion;
        Assertions.assertEquals(resultadoOK, resultado, "El imprimir esta mal");
    }


    @Test
    public void constructorDefaultTestOK(){
        Libro libro0 = new Libro();
        imprimirTest(libro0, null, null, 0);
    }
    @Test
    public void constructorTestOK(){
        imprimirTest(libro, titulo, autor, anoPublicacion);
    }
    
    @Test
    public void imprimirLibro3TestOK(){
        imprimirTest(libro, titulo, autor, anoPublicacion);
    }

    @Test
    public void getTituloTestOK(){
        String resultado = libro.getTitulo();
        String resultadoOK = titulo;
        Assertions.assertEquals(resultadoOK,resultado, "El titulo esta mal");
    }
    @Test
    public void getAutorTestOK(){
        String resultado = libro.getAutor();
        String resultadoOK = autor;
        Assertions.assertEquals(resultadoOK,resultado, "El autor esta mal");
    }
    @Test
    public void getAnoPublicacionTestOK(){
        int resultado = libro.getAnoPublicacion();
        int resultadoOK = anoPublicacion;
        Assertions.assertEquals(resultadoOK,resultado, "El año publicacion esta mal");
    }

}
