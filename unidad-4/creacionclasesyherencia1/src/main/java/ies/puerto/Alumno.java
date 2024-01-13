package ies.puerto;



public class Alumno extends Persona {
    private String curso;
    private float[] notas;

    public Alumno() {
    }
    /**
     * Constructor para alumno
     * @param edad de la persona
     * @param nombre de la persona
     * @param dni de la persona
     * @param curso del alumno
     * @param notas del alumno
     */
    public Alumno(int edad, String nombre, String dni, String curso, float[] notas){
        super(edad, nombre, dni);
        this.curso= curso;
        this.notas = notas;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float[] getNotas() {
        return this.notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }


    public String notasString(){
        String resultado = "";
        for (float f : notas) {
            resultado += f+" ";
        }
        return resultado;
    }
    @Override
    public String toString(){
        return "Soy un Alumno:{DNI: "+dni+"\nNombre: "+nombre+"\nEdad: "+edad+"\nCurso: "+curso+"\nNotas: "+notasString()+"}";
    }


}
