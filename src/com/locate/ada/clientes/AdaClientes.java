package com.locate.ada.clientes;

import com.locate.ada.interfaces.ClienteCadastravel;

import java.util.ArrayList;
import java.util.List;

public class AdaClientes implements ClienteCadastravel {

    private final List<Cliente> clientesDaLocadora = new ArrayList<>();


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

    public Cliente getCliente(String nome) {
        Cliente clienteProcurado = new Cliente();
        for (Cliente cliente: clientesDaLocadora) {
            if (cliente.getNome().equals(nome)
                    || cliente.getDocumento().equals(nome)
            ) {
                clienteProcurado = cliente;
            }
        }
        return clienteProcurado;
    }



    @Override
    public void adicionarCliente(Cliente cliente) {
        for (Cliente clienteParaAdicionar: clientesDaLocadora) {
            if (clienteParaAdicionar.getDocumento().equals(cliente.getDocumento())) {
                throw new IllegalArgumentException("Cliente já cadastrado");
            }
        }
        clientesDaLocadora.add(cliente);
    }

    @Override
    public void atualizarCliente(Cliente clienteDesatualizado, Cliente clienteAtualizado) {
        int posicaoCliente = clientesDaLocadora.indexOf(clienteDesatualizado);
        if (posicaoCliente != -1) {
           clientesDaLocadora.set(posicaoCliente, clienteAtualizado);
        } else {
            throw new IllegalArgumentException("Cliente não cadastrado");
        }
    }

    @Override
    public void removerCliente(Cliente cliente) {
        if (!clientesDaLocadora.contains(cliente)) {
            throw new IllegalArgumentException("Cliente não encontrado");
        }
        clientesDaLocadora.remove(cliente);
    }

    @Override
    public void listarClientes() {
        clientesDaLocadora.forEach(System.out::println);
    }

    @Override
    public Cliente buscarClientePorParteNome(String nome) {
        for (Cliente clienteProcurado: clientesDaLocadora) {
            if (
                    clienteProcurado.getNome().contains(nome)
                    || clienteProcurado.getDocumento().contains(nome)
            ) {
                return clienteProcurado;
            }
        }
        throw new IllegalArgumentException("Cliente não encontrado");
    }

    @Override
    public void listarClientesPorParteNome(String nome) {
            List<Cliente> clientesProcurados = new ArrayList<>();
            for (Cliente clienteProcurado : clientesDaLocadora) {
                if (
                        clienteProcurado.getNome().contains(nome)
                        || clienteProcurado.getTipo().contains(nome)
                        || clienteProcurado.getDocumento().contains(nome)
                ) {
                    clientesProcurados.add(clienteProcurado);
                }
            }
            clientesProcurados.forEach(System.out::println);
    }
    @Override
    public String toString() {
        return "Clientes Ada Locate Car";
    }
}
