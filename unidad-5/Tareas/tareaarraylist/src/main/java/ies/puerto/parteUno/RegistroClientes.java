package ies.puerto.parteUno;

import java.util.ArrayList;

public class RegistroClientes {
    private ArrayList<Cliente> clientes;

    public RegistroClientes(){
    }
    public RegistroClientes(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
    public void añadirCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void eliminarCliente(int indexCliente){
        clientes.remove(indexCliente);
    }
    public void cambiarSaldoCliente(int indexCliente, double nuevaCantidad){
        if (indexCliente<clientes.size() || nuevaCantidad>=0) {
            Cliente cliente = clientes.get(indexCliente);
            cliente.setSaldo(nuevaCantidad);
        }
    }

    @Override
    public String toString() {

        return "Soy el registro de clientes y estos son mis clientes: "+clientes;
    }
}
