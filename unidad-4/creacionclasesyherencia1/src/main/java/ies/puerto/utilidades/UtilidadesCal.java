package ies.puerto.utilidades;

public class UtilidadesCal {
    private float num1;
    private float num2;

    public float getNum1() {
        return this.num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return this.num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public UtilidadesCal() {
    }

    /**
     * Constturcott de Utilidadescal
     * @param num1 de utilidades
     * @param num2 de utilidades
     */
    public UtilidadesCal(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float sumar(){
        return num1+num2;
    }
    public float restar(){
        return num1-num2;
    }
    public float multitplicar(){
        return num1*num2;
    }
    public float dividir(){
        return num1/num2;
    }

    @Override
    public String toString() {
        return "num1:"+num1+" num2: "+num2;
    }
}
