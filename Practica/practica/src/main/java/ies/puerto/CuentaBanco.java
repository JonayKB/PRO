package ies.puerto;
/**
 * Implementa un programa que gestione las cuentas de un banco, teniendo en cuenta las siguientes consideraciones:

    La cuenta de ahorro tendrá las siguientes propiedades:
        String titular;
        double saldo;

Se pide:

    Implementa todos los constructores posiblems.
    Getters/Setters de las propiedades.
    Los siguientes métodos:
        Depositar un cantidad de dinero.
        Retirar una cantidad de dinero.
        informacion sobre el titular y la cantidad de dinero que tiene en ese momento en la cuenta.
 *@author JonayKB
 */
public class CuentaBanco {
    private String titular;
    private double saldo;

    
    
    public CuentaBanco() {}
    /**
     * Constructor sin saldo
     * @param titular de la cuenta
     */
    public CuentaBanco(String titular) {
        this.titular = titular;
    }

    /**
     * Constructor final
     * @param titular de la cuenta
     * @param saldo de la cuenta
     */
    public CuentaBanco(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    


    //Getters y Setters
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Función para depositar dinero
     * @param aDepositar cantidad que depositar
     */
    public void depositarDinero(double aDepositar){
        setSaldo(getSaldo()+aDepositar);
    }

    /**
     * Función para retirar dinero de la cuenta
     * @param aRetirar cantidad que retirar
     */
    public void retirarDinero(double aRetirar){
        if((getSaldo()-aRetirar)>=0){
        setSaldo(getSaldo()-aRetirar);
        }
    }


    public String obtenerInformacion(){
        return "\nTitular: "+titular+"\nSaldo: "+saldo;
    }

}
