package ies.puerto.Reproductor.app;

import ies.puerto.Reproductor.abstrac.LecturaDatosAbstract;
import ies.puerto.Reproductor.impl.LecturaDatosBaseDatos;


public class AppLecturaDatos {
    static LecturaDatosAbstract lecturaDatos;
    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();

        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierro());
        tipo(lecturaDatos);
    }


    public static void tipo(LecturaDatosAbstract lecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
}


