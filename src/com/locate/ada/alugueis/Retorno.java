package com.locate.ada.alugueis;

import com.locate.ada.enums.TipoPessoa;
import com.locate.ada.interfaces.ContratoRetorno;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Retorno implements ContratoRetorno {

    private Aluguel aluguel;
    private LocalDateTime dataDevolucao;
    private static final double diariaVeiculoPequeno = 100.00;
    private static final double diariaVeiculoMedio = 150.00;
    private static final double diariaVeiculoSUV = 200.00;
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
        return (double) diarias * 100;
    }

    @Override
    public double calcularDiariasComDesconto() {
        long diarias =
                ChronoUnit.DAYS.between(aluguel.getRetirada(), dataDevolucao);
        if (aluguel.getCliente().getTipoPessoa().equals(TipoPessoa.PESSOA_FISICA)
                && diarias > 5
        ) {
            return (diarias * 100) * 0.95;
        } else if (aluguel.getCliente().getTipoPessoa().equals(TipoPessoa.PESSOA_JURIDICA)
                && diarias > 3
        ) {
            return (diarias * 100) * 0.90;
        }
        return (double) diarias;
    }

    @Override
    public void devolverVeiculo(Aluguel aluguel) {
        if(aluguel.getVeiculo().isDisponivel()) {
            throw new IllegalArgumentException("Veículo não Alugado");
        }
        aluguel.getVeiculo().setDisponivel(true);
    }
}
