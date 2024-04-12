package es.ies.puerto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio9 {
    public List<Integer> serieNumeros(int n){
        List<Integer> list = new ArrayList<>();
        if (n==0) {
            return list ;
        }
        list.add(n);
        list.addAll(serieNumeros(n-1));
        return list;
    }
}
