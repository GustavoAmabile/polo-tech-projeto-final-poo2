import com.locate.ada.clientes.Cliente;
import com.locate.ada.veiculos.AdaVeiculos;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Administracao {


//    private final List<Veiculo> veiculos;
//    private final List<Cliente> clientes;
//    private final List<Aluguel> retiradas;
//    private final List<Retorno> devolucoes;

    private double diaria;
    private AdaVeiculos adaVeiculos;


    public Administracao(AdaVeiculos adaVeiculos) {
//        this.adaVeiculos = adaVeiculos;
//        veiculos = adaVeiculos.getVeiculosDaLocadora();
//        clientes = new ArrayList<>();
//        retiradas = new ArrayList<>();
//        devolucoes = new ArrayList<>();
    }

//    public List<Veiculo> getVeiculos() {
//        return veiculos;
//    }
//
//    public List<Cliente> getClientes() {
//        return clientes;
//    }
//
//    public List<Aluguel> getRetiradas() {
//        return retiradas;
//    }
//
//    public List<Retorno> getDevolucoes() {
//        return devolucoes;
//    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public AdaVeiculos getAdaVeiculos() {
        return adaVeiculos;
    }

    public void setAdaVeiculos(AdaVeiculos adaVeiculos) {
        this.adaVeiculos = adaVeiculos;
    }




//    public List<Veiculo> buscarVeiculoParteNome(String nome) {
//        List<Veiculo> veiculosProcurados = new ArrayList<>();
//        for (Veiculo veiculo: veiculos) {
//            if (veiculo.getModelo().contains(nome)) {
//                veiculosProcurados.add(veiculo);
//            }
//        }
//        return veiculosProcurados;
//    }
//
//    public void adicionarCliente(Cliente cliente) {
//        for (Cliente consumidor: clientes) {
//            if (consumidor.getNome().equals(cliente.getNome())) {
//                throw new IllegalArgumentException("com.locate.ada.clientes.Cliente já cadastrado");
//            }
//        }
//        clientes.add(cliente);
//    }
//
//    public void atualizarCliente(Cliente cliente) {
//        for (int i = 0; i < clientes.size(); i++) {
//            if (clientes.get(i).getNome().equals(cliente.getNome())) {
//                clientes.set(i, cliente);
//            }
//        }
//        throw new IllegalArgumentException("com.locate.ada.clientes.Cliente não cadastrado");
//    }

//    public void alugarVeiculo(Veiculo veiculo, Cliente cliente, LocalDateTime retirada) {
//        if (!veiculo.isDisponivel()) {
//            throw new IllegalArgumentException("Carro indisponível para locação");
//        }
//
//        Aluguel aluguel = new Aluguel(veiculo, cliente, retirada);
//        veiculo.setDisponivel(false);
//        retiradas.add(aluguel);
//    }
//
//    public void devolverVeiculo(Veiculo veiculo, Cliente cliente, LocalDateTime devolucao) {
//        if (veiculo.isDisponivel()) {
//            throw new IllegalArgumentException("Carro não alugado");
//        }
//
//        Retorno retorno = new Retorno(veiculo, cliente, devolucao);
//        veiculo.setDisponivel(true);
//        devolucoes.add(retorno);
//
//    }

    public double calcularDiariaVeiculoPequeno(Aluguel aluguel, Retorno retorno, Veiculo veiculo) {
        long duracaoAluguel =
                ChronoUnit.DAYS.between(aluguel.getRetirada(), retorno.getRetorno());
        if (veiculo.getTipo().equals("Pessoa Física") && duracaoAluguel > 5){
            return (duracaoAluguel * 100) * 0.95;
        } else if (veiculo.getTipo().equals("Pessoa Jurídica") && duracaoAluguel > 3) {
            return (duracaoAluguel * 100) * 0.90;
        }
        return duracaoAluguel * 100;
    }

    public double calcularDiariaVeiculoMedio(Aluguel aluguel, Retorno retorno, Veiculo veiculo) {

        long duracaoAluguel =
                ChronoUnit.DAYS.between(aluguel.getRetirada(), retorno.getRetorno());
        if (veiculo.getTipo().equals("Pessoa Física") && duracaoAluguel > 5){
            return (duracaoAluguel * 150) * 0.95;
        } else if (veiculo.getTipo().equals("Pessoa Jurídica") && duracaoAluguel > 3) {
            return (duracaoAluguel * 150) * 0.90;
        }
        return duracaoAluguel * 150;
    }

    public double calcularDiariaVeiculoSUV(Aluguel aluguel, Retorno retorno, Veiculo veiculo) {
        long duracaoAluguel =
                ChronoUnit.DAYS.between(aluguel.getRetirada(), retorno.getRetorno());
        if (veiculo.getTipo().equals("Pessoa Física") && duracaoAluguel > 5){
            return (duracaoAluguel * 200) * 0.95;
        } else if (veiculo.getTipo().equals("Pessoa Jurídica") && duracaoAluguel > 3) {
            return (duracaoAluguel * 200) * 0.90;
        }
        return duracaoAluguel * 200;
    }


    @Override
    public String toString() {
        return "Administracao";
    }
}
