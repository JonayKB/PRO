<div align = "Justify">


# Tarea Metodos Dos Jonay Contreras

## Ejercicio 1


 <details>
 <summary>Pseudocódigo</summary>

1. __Declaramos__ que el sueldo es __igual__ al numero de horas __por__ diez
2. __Devolvemos__ el sueldo

</details>

<details>
<summary>Código en JAVA</summary>

### Ejercicio

```java
package ies.puerto;
/**
 * Realizar un programa que calcule el sueldo de un trabajador, 
 * el programa debe de tener un método que reciba el numero de horas que has trabajado en un mes, 
 * las horas se pagan a 10€.
 */
public class Ejercicio1 {


    /**
     * Función que calcula el sueldo que obtiene en función de las horas
     * @param numeroHoras el númeor de horas que realiza
     * @return devuelve el sueldo
     */
    public int calcularSueldoHoras(int numeroHoras){
        int sueldo = numeroHoras*10;
        return sueldo;
    }
}
```
### Tests
```java
package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    public void verificarTestSueldoHoras(int numeroHoras, int resultadoEsperado){
        int resultado = ejercicio1.calcularSueldoHoras(numeroHoras);
        Assertions.assertEquals(resultadoEsperado,resultado, "No se ha obtenido el valor esperado");
    }
    
    @Test
    public void calcularSueldoHorasTestOK1(){
        verificarTestSueldoHoras(1,10);
    }

    @Test
    public void calcularSueldoHorasTestOK10(){
        verificarTestSueldoHoras(10,100);
    }
}
```
</details>




</div>