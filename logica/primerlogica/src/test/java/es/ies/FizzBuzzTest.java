package es.ies;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.FizzBuzz;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;
    @BeforeEach
    public void beforeEach(){
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void fizzBuzz(){
        Assertions.assertTrue(fizzBuzz.fizzBuzz().contains("15:fizzbuzz"));
    }
}
