import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ies.puerto.Estudiante;

public class EstudianteTest {
    Estudiante estudiante0 = new Estudiante();
    Estudiante estudiante1 = new Estudiante("Cristian", 17, "Bellas Artes", 9f);
    Estudiante estudiante2 = new Estudiante("Federico", 30, "Ingienería Química", 4.9f);

    @Test
    public void constructorDefaulTestOK(){
        String resultado = estudiante0.getNombre();
        String resultadoOK = null;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getNombreTestOK(){
        String resultado = estudiante1.getNombre();
        String resultadoOK = "Cristian";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void setEdadTestOK(){
        int resultado = 19;
        estudiante1.setEdad(resultado);
        int resultadoOK = 19;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void getCarreraTestOK(){
        String resultado = estudiante1.getCarrera();
        String resultadoOK = "Bellas Artes";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void setPromedioTestOK(){
        float resultado = 8.9f;
        estudiante1.setPromedio(resultado);
        float resultadoOK = 8.9f;

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void mostrarDetallesTestOK(){
        String resultado = estudiante1.mostrarDetalles();
        String resultadoOK = "Nombre: Cristian\nEdad: 17\nCarrera: Bellas Artes\nPromedio: 9.0";

        Assertions.assertEquals(resultadoOK, resultado);
    }

    @Test
    public void verificarAprobadoTestOK(){
        verificarAprobado(estudiante1,true);
    }
    @Test
    public void verificarAprobadoTestERROR(){
        verificarAprobado(estudiante2,false);
    }


    public void verificarAprobado(Estudiante clase,boolean resultadoOK){
        boolean resultado = clase.verificarAprobado();
        Assertions.assertEquals(resultadoOK, resultado);
    }






}
