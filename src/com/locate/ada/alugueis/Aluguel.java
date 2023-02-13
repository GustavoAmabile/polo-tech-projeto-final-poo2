package com.locate.ada.alugueis;

import com.locate.ada.clientes.Cliente;
import com.locate.ada.interfaces.ContratoAluguel;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Aluguel implements ContratoAluguel<Aluguel> {

    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime retirada;



    public Aluguel () {

    }
    public Aluguel(Veiculo veiculo, Cliente cliente, LocalDateTime retirada) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.retirada = retirada;
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
        Aluguel aluguel = new Aluguel(veiculo, cliente, dataRetirada);
        veiculo.setDisponivel(false);

    }

    @Override
    public double calcularDiaria(Veiculo veiculo, Aluguel retirada, Retorno devolucao) {
        long diarias =
                ChronoUnit.DAYS.between(retirada.getRetirada(), devolucao.getRetorno());
        if (veiculo.getTipo().equals("Pessoa Física") && diarias > 5) {
            return (diarias * 100) * 0.95;
        } else if (veiculo.getTipo().equals("Pessoa Jurídica") && diarias > 3) {
            return (diarias * 100) * 0.90;
        }
        return diarias * 100;
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
