import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Circulo;

public class CirculoTest {
    Circulo circulo0 = new Circulo();
    Circulo circulo1 = new Circulo(3f);
    
    public void calcularArea(Circulo clase, float resultadoOK){
        float resultado = clase.calcularArea();
        Assertions.assertEquals(resultadoOK, resultado);
    }
    public void calcularCircurferencia(Circulo clase, float resultadoOK){
        float resultado = clase.calcularCircurferencia();
        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void calcularArea0TestOK(){
        calcularArea(circulo0, 0f);
    }
    @Test
    public void calcularArea1TestOK(){
        calcularArea(circulo1, 28.274311f);
    }

    @Test
    public void calcularCircurferencia0TestOK(){
        calcularCircurferencia(circulo0, 0f);
    }
    @Test
    public void calcularCircurferencia1TestOK(){
        calcularCircurferencia(circulo1, 18.84954f);
    }
    
    @Test
    public void getRadioTestOK(){
        float resultado = circulo1.getRadio();
        float resultadoOK = 3f;
        Assertions.assertEquals(resultadoOK, resultado);
    }
    

}
