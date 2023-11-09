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
    public void BeforeEach() {
        libro = new Libro(titulo, autor, anoPublicacion);
    }
    
  
    public void imprimirTest(Libro clase, String titulo, String autor , int anoPublicacion){
        String resultado = clase.imprimir();
        String resultadoOK = "Titulo: "+titulo+"\nAutor: "+autor+"\nAño Publicación: "+anoPublicacion;
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void ConstructorTestOK(){
        imprimirTest(libro, titulo, autor, anoPublicacion);
    }
    
    @Test
    public void imprimirLibro3TestOK(){
        imprimirTest(libro, titulo, autor, anoPublicacion);
    }

    @Test
    public void gettersTestOK(){
        
        Assertions.assertEquals(titulo,libro.getTitulo(), "El titulo esta mal");
        Assertions.assertEquals(autor,libro.getAutor(), "El autor esta mal");
        Assertions.assertEquals(anoPublicacion,libro.getAnoPublicacion(), "El año publicacion esta mal");
    }


}
