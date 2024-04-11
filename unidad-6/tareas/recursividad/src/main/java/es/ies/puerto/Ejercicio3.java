package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    List<String> list = new ArrayList<>();
        public List<String> imprimirPares(int n){
            if (n==1) {
                return list;
            }
            if (n%2==0) {
                list.add(n+":Es par");
            }
            imprimirPares(n-1);
            return list;
        }
}
