package com.locate.ada.interfaces;

import com.locate.ada.veiculos.Veiculo;

import java.util.List;

public interface VeiculoCadastravel<T> {

    void adicionarVeiculo(Veiculo veiculo);
    void atualizarVeiculo(Veiculo veiculoDesatualizado, Veiculo veiculoAtualizado);
    void removerVeiculo(Veiculo veiculo);

    void listarVeiculos();
    Veiculo buscarVeiculoPorParteNome(String nome);
    void listarVeiculosPorParteNome(String nome);

}
