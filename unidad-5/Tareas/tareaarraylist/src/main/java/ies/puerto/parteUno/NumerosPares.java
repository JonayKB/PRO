package ies.puerto.parteUno;

import java.util.ArrayList;

public class NumerosPares {
    static ArrayList<Integer> arrayList = new ArrayList<>();


    public ArrayList<Integer> llenarListaPares(){
        for (int i = 2; i <= 10; i++) {
            if (i%2==0) {
                arrayList.add(i);
            }
        }

        return arrayList;
    }
}