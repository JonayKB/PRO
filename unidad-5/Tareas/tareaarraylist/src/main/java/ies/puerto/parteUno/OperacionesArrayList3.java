package ies.puerto.parteUno;

import java.util.ArrayList;

public class OperacionesArrayList3 {
        private ArrayList<Integer> arrayList;

    public OperacionesArrayList3(){}
    public OperacionesArrayList3(ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }

    public boolean mayorQue10(){
        for (Integer e : arrayList) {
            if (e<10) {
                return false;
            }
        }
        return true;
    }
}
