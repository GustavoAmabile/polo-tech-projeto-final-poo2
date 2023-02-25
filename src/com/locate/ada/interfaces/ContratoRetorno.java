package com.locate.ada.interfaces;

import com.locate.ada.alugueis.Aluguel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface ContratoRetorno {

    long calcularDiarias();

    BigDecimal calcularValorComDesconto();

    void devolverVeiculo(Aluguel aluguel);
}
