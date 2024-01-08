package ies.puerto;
public class Ejemplo {
    static String nombre;
    static int edad;

    public static void main(String[] args) {
        nombre = "Jonay";
        edad = 10;
        Persona persona = new Persona(nombre, edad);
        persona.esMayor();
        System.out.println(persona.esMayor());
    }

    
    public static class Persona {
        
        public Persona(){}
        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad= edad;
        }
        String nombre;
        int edad;

        public boolean esMayor(){
            if (edad< 18) {
                return true;
            }
            return false;
        }
    }
}
