import com.locate.ada.clientes.Cliente;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDateTime;

public class Aluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime retirada;


    public Aluguel(Veiculo veiculo, Cliente cliente, LocalDateTime retirada) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.retirada = retirada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDateTime retirada) {
        this.retirada = retirada;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "veiculo=" + veiculo +
                ", cliente=" + cliente +
                ", retirada=" + retirada +
                '}';
    }
}
