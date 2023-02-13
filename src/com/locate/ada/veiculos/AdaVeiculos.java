package com.locate.ada.veiculos;

import com.locate.ada.interfaces.VeiculoCadastravel;

import java.util.ArrayList;
import java.util.List;

public class AdaVeiculos implements VeiculoCadastravel {
    private final List<Veiculo> veiculosDaLocadora = new ArrayList<>();
    public AdaVeiculos (){
      inserirVeiculosNaLista();
    }
    private void inserirVeiculosNaLista(){

        Veiculo veiculo1 = new Veiculo("AAA-0001", "Vw", "Up", "pequeno");
        Veiculo veiculo2 = new Veiculo("AAA-0002", "Renault", "Kwid", "pequeno");
        Veiculo veiculo3 = new Veiculo("AAA-0003", "Fiat", "Mobi", "pequeno");
        Veiculo veiculo4 = new Veiculo("BBB-0004", "Vw", "Voyage", "médio");
        Veiculo veiculo5 = new Veiculo("BBB-0005", "Chevrolet", "Onix", "médio");
        Veiculo veiculo6 = new Veiculo("BBB-0006", "Hyundai", "HB20", "médio");
        Veiculo veiculo7 = new Veiculo("CCC-0007", "Honda", "HR-V", "SUV");
        Veiculo veiculo8 = new Veiculo("CCC-0008", "Cherokee", "Compass", "SUV");
        Veiculo veiculo9 = new Veiculo("CCC-0009", "Nissan", "Kics", "SUV");

        veiculosDaLocadora.add(veiculo1);
        veiculosDaLocadora.add(veiculo2);
        veiculosDaLocadora.add(veiculo3);
        veiculosDaLocadora.add(veiculo4);
        veiculosDaLocadora.add(veiculo5);
        veiculosDaLocadora.add(veiculo6);
        veiculosDaLocadora.add(veiculo7);
        veiculosDaLocadora.add(veiculo8);
        veiculosDaLocadora.add(veiculo9);

    }

    public Veiculo getVeiculo(String nome) {
        Veiculo veiculoProcurado = new Veiculo();
        for (Veiculo veiculo: veiculosDaLocadora) {
            if(
                    veiculo.getPlaca().equals(nome)
                    || veiculo.getMarca().equals(nome)
                    || veiculo.getModelo().equals(nome)
                    || veiculo.getTipo().equals(nome)
            ) {
                veiculoProcurado = veiculo;
            }
        }
        return veiculoProcurado;
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        for (Veiculo veiculoParaAdicionar: veiculosDaLocadora) {
            if (veiculoParaAdicionar.getPlaca().equals(veiculo.getPlaca())) {
                throw new IllegalArgumentException("Veículo já cadastrado");
            }
        }
        veiculosDaLocadora.add(veiculo);
    }

    @Override
    public void atualizarVeiculo(Veiculo veiculoDesatualizado, Veiculo veiculoAtualizado) {
        int posicaoVeiculo = veiculosDaLocadora.indexOf(veiculoDesatualizado);
        if (posicaoVeiculo != -1) {
            veiculosDaLocadora.set(posicaoVeiculo, veiculoAtualizado);
        } else {
            throw new IllegalArgumentException("Veículo não encontrado");
        }
    }

    @Override
    public void removerVeiculo(Veiculo veiculo) {
        if (!veiculosDaLocadora.contains(veiculo)) {
            throw new IllegalArgumentException("Veículo já devolvido");
        }
        veiculosDaLocadora.remove(veiculo);
    }

    @Override
    public void listarVeiculos() {
        veiculosDaLocadora.forEach(System.out::println);
    }

    @Override
    public Veiculo buscarVeiculoPorParteNome(String nome) {
        for (Veiculo veiculoProcurado: veiculosDaLocadora) {
            if (
                    veiculoProcurado.getPlaca().contains(nome)
                    || veiculoProcurado.getModelo().contains(nome)
                    || veiculoProcurado.getTipo().contains(nome)
            ) {
                return veiculoProcurado;
            }
        }
        throw new IllegalArgumentException("Veículo não encontrado");
    }

    @Override
    public void listarVeiculosPorParteNome(String nome) {
        List<Veiculo> veiculosProcurados = new ArrayList<>();
        for (Veiculo veiculoProcurado: veiculosDaLocadora) {
            if (
                    veiculoProcurado.getPlaca().contains(nome)
                    || veiculoProcurado.getMarca().contains(nome)
                    || veiculoProcurado.getModelo().contains(nome)
                    || veiculoProcurado.getTipo().contains(nome)
            ) {
                veiculosProcurados.add(veiculoProcurado);
            }
        }
        veiculosProcurados.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return veiculosDaLocadora.toString();
    }
}
