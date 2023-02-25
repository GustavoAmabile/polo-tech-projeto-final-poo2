package com.locate.ada.alugueis;

import com.locate.ada.enums.TipoPessoa;
import com.locate.ada.interfaces.ContratoRetorno;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Retorno implements ContratoRetorno {

    private Aluguel aluguel;
    private LocalDateTime dataDevolucao;
    private static final double diariaVeiculoPequeno = 100.00;
    private static final double diariaVeiculoMedio = 150.00;
    private static final double diariaVeiculoSUV = 200.00;
    private static final double descontoPessoaFisica = 0.95;
    private static final double descontoPessoaJuridica = 0.90;

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
    public long calcularDiarias() {
        long diarias =
                ChronoUnit.DAYS.between(aluguel.getRetirada(), dataDevolucao);

        return diarias + 1;
    }

    @Override
    public BigDecimal calcularValorComDesconto() {
        long diarias = calcularDiarias();
        BigDecimal taxaDeAluguel = aluguel.getVeiculo().getTipoVeiculo().getTaxaDeAluguel();
        BigDecimal valorSemDesconto = BigDecimal.valueOf(diarias).multiply(taxaDeAluguel);

        BigDecimal proporcaoDeDesconto = calculaDesconto(diarias);

        return valorSemDesconto.multiply(proporcaoDeDesconto);
    }

    private BigDecimal calculaDesconto(long diarias) {
        if (aluguel.getCliente().getTipoPessoa().equals(TipoPessoa.PESSOA_FISICA)
                && diarias > 5
        ) {
            return BigDecimal.valueOf(0.95);
        } else if (aluguel.getCliente().getTipoPessoa().equals(TipoPessoa.PESSOA_JURIDICA)
                && diarias > 3
        ) {
            return BigDecimal.valueOf(0.90);
        }
        return BigDecimal.ONE;
    }


    @Override
    public void devolverVeiculo(Aluguel aluguel) {
        if(aluguel.getVeiculo().isDisponivel()) {
            throw new IllegalArgumentException("Veículo não Alugado");
        }
        aluguel.getVeiculo().setDisponivel(true);
    }
}
