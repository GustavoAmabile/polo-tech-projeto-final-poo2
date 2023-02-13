package com.locate.ada.alugueis;

import com.locate.ada.clientes.Cliente;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDateTime;

public class Retorno {
    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime retorno;

    public Retorno(Veiculo veiculo, Cliente cliente, LocalDateTime retorno) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.retorno = retorno;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getRetorno() {
        return retorno;
    }

    public void setRetorno(LocalDateTime retorno) {
        this.retorno = retorno;
    }

    @Override
    public String toString() {
        return "com.locate.ada.alugueis.Retorno{" +
                "veiculo=" + veiculo +
                ", cliente=" + cliente +
                ", retorno=" + retorno +
                '}';
    }
}
