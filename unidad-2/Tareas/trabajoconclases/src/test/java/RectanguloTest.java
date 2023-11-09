import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Rectangulo;

public class RectanguloTest {
    
    Rectangulo rectangulo0 = new Rectangulo();
    Rectangulo rectangulo1 = new Rectangulo(10, 30);

    @Test
    public void getAnchoTestOK(){
        float resultado = rectangulo0.getAncho();
        float resultadoOK = 0f;
        
        Assertions.assertEquals(resultadoOK, resultado, "El ancho esta mal");
    }

    @Test
    public void getLargoTestOK(){
        float resultado = rectangulo1.getLargo();
        float resultadoOK = 10f;
        
        Assertions.assertEquals(resultadoOK, resultado, "El largo esta mal");
    }

    @Test
    public void calcularAreaTestOK(){
        float resultado = rectangulo1.calcularArea();
        float resultadoOK = 300f;
        
        Assertions.assertEquals(resultadoOK, resultado, "El area esta mal");
    }
    @Test
    public void calcularPerimetroTestOK(){
        float resultado = rectangulo1.calcularPerimetro();
        float resultadoOK = 80f;
        
        Assertions.assertEquals(resultadoOK, resultado, "El perimetro esta mal");
    }
}
