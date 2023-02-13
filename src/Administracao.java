import com.locate.ada.alugueis.Aluguel;
import com.locate.ada.alugueis.Retorno;
import com.locate.ada.veiculos.AdaVeiculos;
import com.locate.ada.veiculos.Veiculo;

import java.time.temporal.ChronoUnit;

public class Administracao {


//    private final List<Veiculo> veiculos;
//    private final List<Cliente> clientes;
//    private final List<com.locate.ada.alugueis.Aluguel> retiradas;
//    private final List<com.locate.ada.alugueis.Retorno> devolucoes;

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
//    public List<com.locate.ada.alugueis.Aluguel> getRetiradas() {
//        return retiradas;
//    }
//
//    public List<com.locate.ada.alugueis.Retorno> getDevolucoes() {
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







//    public void alugarVeiculo(Veiculo veiculo, Cliente cliente, LocalDateTime retirada) {
//        if (!veiculo.isDisponivel()) {
//            throw new IllegalArgumentException("Carro indisponível para locação");
//        }
//
//        com.locate.ada.alugueis.Aluguel aluguel = new com.locate.ada.alugueis.Aluguel(veiculo, cliente, retirada);
//        veiculo.setDisponivel(false);
//        retiradas.add(aluguel);
//    }
//
//    public void devolverVeiculo(Veiculo veiculo, Cliente cliente, LocalDateTime devolucao) {
//        if (veiculo.isDisponivel()) {
//            throw new IllegalArgumentException("Carro não alugado");
//        }
//
//        com.locate.ada.alugueis.Retorno retorno = new com.locate.ada.alugueis.Retorno(veiculo, cliente, devolucao);
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
