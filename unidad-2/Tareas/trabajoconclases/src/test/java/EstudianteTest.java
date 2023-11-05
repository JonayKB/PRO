import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Estudiante;

public class EstudianteTest {
    Estudiante estudiante0 = new Estudiante();
    Estudiante estudiante1 = new Estudiante("Federico");
    Estudiante estudiante2 = new Estudiante("Pablo", 18);
    Estudiante estudiante3 = new Estudiante("Miguel", 20, "Ingienería Informática");
    Estudiante estudiante4 = new Estudiante("Cristian", 17, "Bellas Artes", 9f);
    Estudiante estudiante5 = new Estudiante("Federico", 30, "Ingienería Química", 4.9f);

    @Test
    public void getNombre0TestOK(){
        String resultado = estudiante0.getNombre();
        String resultadoOK = null;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getNombre1estOK(){
        String resultado = estudiante1.getNombre();
        String resultadoOK = "Federico";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getEdadTestOK(){
        int resultado = estudiante2.getEdad();
        int resultadoOK = 18;

        Assertions.assertEquals(resultadoOK, resultado);
    }
    @Test
    public void setEdadTestOK(){
        int resultado = 19;
        estudiante2.setEdad(resultado);
        int resultadoOK = 19;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getCarreraTestOK(){
        String resultado = estudiante3.getCarrera();
        String resultadoOK = "Ingienería Informática";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getPromedioTestOK(){
        float resultado = estudiante4.getPromedio();
        float resultadoOK = 9f;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void setPromedioTestOK(){
        float resultado = 8.9f;
        estudiante4.setPromedio(resultado);
        float resultadoOK = 8.9f;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void mostrarDetallesTestOK(){
        String resultado = estudiante4.mostrarDetalles();
        String resultadoOK = "Nombre: Cristian\nEdad: 17\nCarrera: Bellas Artes\nPromedio: 9.0";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void verificarAprobadoTestOK(){
        verificarAprobado(estudiante4,true);
    }
    @Test
    public void verificarAprobadoTestERROR(){
        verificarAprobado(estudiante5,false);
    }


    public void verificarAprobado(Estudiante clase,boolean resultadoOK){
        boolean resultado = clase.verificarAprobado();
        Assertions.assertEquals(resultadoOK, resultado);
    }






}
