package com.locate.ada.alugueis;

import com.locate.ada.clientes.Cliente;
import com.locate.ada.interfaces.ContratoAluguel;
import com.locate.ada.veiculos.AdaVeiculos;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Aluguel implements ContratoAluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime retirada;

    private AdaVeiculos adaVeiculos;

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

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDateTime retirada) {
        this.retirada = retirada;
    }

    @Override
    public void alugarVeiculo(Veiculo veiculo, Cliente cliente, LocalDateTime dataRetirada) {
        if (!veiculo.isDisponivel()) {
            throw new IllegalArgumentException("Veículo indisponível");
        }
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.retirada = dataRetirada;
        veiculo.setDisponivel(false);

    }

    @Override
    public String toString() {
        return String.format(
                "Veículo alugado %s%n" +
                        "Cliente %s%n" +
                        "Data de retirada do Veículo - %s%n",
                veiculo, cliente, retirada
        );
    }
}
