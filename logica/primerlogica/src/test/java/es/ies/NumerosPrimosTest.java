package es.ies;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.NumerosPrimos;

public class NumerosPrimosTest {
    NumerosPrimos numerosPrimos;
    @BeforeEach
    public void beforeEach(){
        numerosPrimos = new NumerosPrimos();
    }
    @Test
    public void numerosPrimosTest(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        Assertions.assertEquals(list, numerosPrimos.numerosPrimos());
    }
}
