package ies.puerto.parteUno;

import java.util.ArrayList;


public class OperacionesArrayList {
    ArrayList<String> arrayList;
    public OperacionesArrayList(ArrayList<String> arrayList){
        this.arrayList = arrayList;
    }

    public int cantidadElementosComenzarA(){
        int resultado = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).startsWith("A")) {
               resultado++; 
            }
        }
        return resultado;
    }
}
