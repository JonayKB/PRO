package ies.puerto;

public class App {
    static Coche miCoche;
    static Coche miCocheColor;
    static Coche miCocheMatricula;
    static Bicicleta miBicicleta;
    public static void main(String[] args) {
        miCoche = new Coche();
        miCoche.mover();
        miCoche.miColor();
        System.out.println(miCoche.toString());

        miCocheColor = new Coche("ROJO");
        miCocheColor.mover();
        miCocheColor.miColor();
        System.out.println(miCocheColor.toString());

        miCocheMatricula = new Coche(null,"13123213F");
        System.out.println(miCocheMatricula.toString());

        miBicicleta = new Bicicleta("XL","NEGRO");
        miBicicleta.miColor();
        
        System.out.println(miBicicleta.toString());
    }
}
