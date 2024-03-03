package es.ies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.DiasDiferencia;

public class DiasDiferenciaTest {
    DiasDiferencia diasDiferencia;
    @BeforeEach
    public void beforeEach(){
        diasDiferencia = new DiasDiferencia();
    }
    @Test
    public void diasDiferenciaTestPost(){
        String fechaInicio="02/03/2024";
        String fechaFinal="03/03/2024";
        Assertions.assertEquals(1, diasDiferencia.obtenerDiasDiferencia(fechaInicio, fechaFinal));
    }
    @Test
    public void diasDiferenciaTestPre(){
        String fechaInicio="02/03/2024";
        String fechaFinal="01/03/2024";
        Assertions.assertEquals(1, diasDiferencia.obtenerDiasDiferencia(fechaInicio, fechaFinal));
    }
}
