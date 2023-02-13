package com.locate.ada.interfaces;

import com.locate.ada.alugueis.Aluguel;
import com.locate.ada.alugueis.Retorno;
import com.locate.ada.clientes.Cliente;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface ContratoAluguel<T> {

    void alugarVeiculo(Veiculo veiculo, Cliente cliente, LocalDateTime dataRetirada);
    double calcularDiaria(Veiculo veiculo, Aluguel aluguel, Retorno retorno);



}
