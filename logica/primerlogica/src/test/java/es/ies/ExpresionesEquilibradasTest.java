package es.ies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.ExpresionesEquilibradas;

public class ExpresionesEquilibradasTest {
    ExpresionesEquilibradas expresionesEquilibradas;
    @BeforeEach
    public void beforeEach(){
        expresionesEquilibradas = new ExpresionesEquilibradas();
    }
    @Test
    public  void expresionesEquilibradasTest1(){
        String str1 = "AOEIU";
        String str2 = "AOP";
        Assertions.assertEquals("OUT1: [E, I, U] OUT2: [P]", expresionesEquilibradas.EquilibrarExpresion(str1, str2));
    }
}
