package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(){
        List<String> resultado = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <=100; i++) {
            stringBuilder.append(i).append(":");
            if (i%3==0) {
                stringBuilder.append("fizz");
            }
            if (i%5==0) {
                stringBuilder.append("buzz");
            }
            resultado.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.capacity());
        }
        return resultado;
    }
}
