package com.locate.ada.interfaces;

import com.locate.ada.clientes.Cliente;

public interface ClienteCadastravel {

    void adicionarCliente(Cliente cliente);
    void atualizarCliente(Cliente clienteDesatualizado, Cliente Atualizado);
    void removerCliente (Cliente cliente);
    void listarClientes();
    Cliente buscarClientePorParteNome(String nome);
    void listarClientesPorParteNome(String nome);

}
