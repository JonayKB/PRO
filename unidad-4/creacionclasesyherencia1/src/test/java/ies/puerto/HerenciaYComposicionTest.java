package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HerenciaYComposicionTest {
    static Coche coche;
    static Motocicleta motocicleta;
    static Conductor conductor;

    @BeforeAll
    public static void BeforeAll(){
        conductor = new Conductor(19, "Roberto", "123123F");
        coche=new Coche("marca", "UnModelo", 3000, 125);
        motocicleta=new Motocicleta("marca2", "UnModelo2", 300, conductor);
    }
    @Test
    public void conductorTestOK(){
        String resultadoOK="Soy un Conductor:{DNI: 123123F\nNombre: Roberto\nEdad: 19}";
        String resultado= conductor.toString();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void cocheTestOK(){
        String resultadoOK="Soy un Coche:{Marca: marca\nModelo: UnModelo\nPrecio: 3000.0\nCilindrada: 125}";
        String resultado= coche.toString();

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void motocicletaTestOK(){
        String resultadoOK="Soy una Motocicleta:{Marca: marca2\nModelo: UnModelo2\nPrecio: 300.0\nConductor: Soy un Conductor:{DNI: 123123F\nNombre: Roberto\nEdad: 19}}";
        String resultado= motocicleta.toString();

        Assertions.assertEquals(resultadoOK, resultado);
    }
}
