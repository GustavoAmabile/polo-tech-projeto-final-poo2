package com.locate.ada.clientes;

import java.util.ArrayList;
import java.util.List;

public class AdaClientes {

    private List<Cliente> clientesDaLocadora = new ArrayList<>();


    public AdaClientes(){
        inserirClientesNaLista();
    }

    private void inserirClientesNaLista() {

        Cliente cliente1 = new Cliente("João Silva", "000.000.000-10", "Pessoa Física");
        Cliente cliente2 = new Cliente("Carlos Alberto", "000.000.000-20", "Pessoa Física");
        Cliente cliente3 = new Cliente("Ana Júlia", "000.000.000-30", "Pessoa Física");
        Cliente cliente4 = new Cliente("Polo Tech SA", "00.000.000/0001-01", "Pessoa Jurídica");
        Cliente cliente5 = new Cliente("Consultoria 926", "00.000.000/0001-02", "Pessoa Jurídica");
        Cliente cliente6 = new Cliente("Ada Tech", "00.000.000/0001-03", "Pessoa Jurídica");

        clientesDaLocadora.add(cliente1);
        clientesDaLocadora.add(cliente2);
        clientesDaLocadora.add(cliente3);
        clientesDaLocadora.add(cliente4);
        clientesDaLocadora.add(cliente5);
        clientesDaLocadora.add(cliente6);
    }

    public List<Cliente> getClientesDaLocadora() {
        return clientesDaLocadora;
    }

    public void setClientesDaLocadora(List<Cliente> clientesDaLocadora) {
        this.clientesDaLocadora = clientesDaLocadora;
    }

    @Override
    public String toString() {
        return "Clientes Ada Locate Car";
    }
}
