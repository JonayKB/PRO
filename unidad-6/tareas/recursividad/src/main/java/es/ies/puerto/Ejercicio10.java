package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {
    public List<String> imprimirImpares(int n){
        List<String> list = new ArrayList<>();

        if (n==1) {
            return list;
        }
        if (n%2==1) {
            list.add(n+":Es impar");
        }
        list.addAll(imprimirImpares(n-1));
        return list;
    }
}
