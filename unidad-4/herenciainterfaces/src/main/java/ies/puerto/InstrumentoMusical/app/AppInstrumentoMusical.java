package ies.puerto.InstrumentoMusical.app;

import ies.puerto.InstrumentoMusical.impl.Guitarra;
import ies.puerto.InstrumentoMusical.implementation.Guitarra2;

public class AppInstrumentoMusical {
    static Guitarra guitarra;
    static Guitarra2 guitarra2;
    public static void main(String[] args) {
        guitarra = new Guitarra();
        guitarra2 = new Guitarra2();

        System.out.println(guitarra.afinar());
        System.out.println(guitarra.tocarNota("DO MENOR"));
        System.out.println(guitarra.cambiarCuerdas());

        System.out.println(guitarra2.afinar());
        System.out.println(guitarra2.tocarNota("DO MENOR"));
        System.out.println(guitarra2.cambiarCuerdas());
    }
}
