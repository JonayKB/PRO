package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {
    public List<Integer> numerosPrimos(){
        List<Integer> resultado = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int divisores=0;
            for (int j = 1; j < i; j++) {
                if (i%j==0) {
                    divisores++;
                }
            }
            if (divisores<=1) {
                resultado.add(i);
            }
            
        }
        return resultado;
    }
}