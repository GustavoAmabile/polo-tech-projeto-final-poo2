package com.locate.ada.alugueis;

import com.locate.ada.clientes.Cliente;
import com.locate.ada.interfaces.ContratoRetorno;
import com.locate.ada.veiculos.AdaVeiculos;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Retorno implements ContratoRetorno {

    private Aluguel aluguel;
    private LocalDateTime dataDevolucao;

    private AdaVeiculos veiculos;

    public Retorno(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public double calcularDiarias() {
        long diarias =
                ChronoUnit.DAYS.between(aluguel.getRetirada(), dataDevolucao);
        diarias++;
        if (aluguel.getVeiculo().getTipo().equals("Pessoa Física")
                && diarias > 5
        ) {
            return (diarias * 100) * 0.95;
        } else if (aluguel.getVeiculo().getTipo().equals("Pessoas Jurídicas")
                && diarias > 3
        ) {
            return (diarias * 100) * 0.90;
        }
        return diarias * 100;
    }

    @Override
    public void devolverVeiculo(Aluguel aluguel) {
        if(aluguel.getVeiculo().isDisponivel()) {
            throw new IllegalArgumentException("Veículo não Alugado");
        }
        aluguel.getVeiculo().setDisponivel(true);
    }
}
