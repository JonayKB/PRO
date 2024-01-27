package ies.puerto.parteUno;

import java.util.ArrayList;

/**
 * Escribe un método en una clase llamada OperacionesArrayList que reciba un ArrayList de cadenas y devuelva la cantidad de elementos que comienzan con la letra 'A'. a la lista.
 */
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
