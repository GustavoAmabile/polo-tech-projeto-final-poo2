package com.locate.ada.interfaces;

import com.locate.ada.alugueis.Aluguel;

import java.time.LocalDateTime;

public interface ContratoRetorno {

    double calcularDiarias();
    void devolverVeiculo(Aluguel aluguel);
}
