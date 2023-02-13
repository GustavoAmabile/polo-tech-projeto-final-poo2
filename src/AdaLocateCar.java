import com.locate.ada.alugueis.Aluguel;
import com.locate.ada.alugueis.Retorno;
import com.locate.ada.clientes.AdaClientes;
import com.locate.ada.clientes.Cliente;
import com.locate.ada.enums.TipoPessoa;
import com.locate.ada.enums.TipoVeiculo;
import com.locate.ada.interfaces.ContratoAluguel;
import com.locate.ada.veiculos.AdaVeiculos;
import com.locate.ada.veiculos.Veiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AdaLocateCar {
    public static void main(String[] args) {

        AdaVeiculos adaVeiculos = new AdaVeiculos();
        adaVeiculos.listarVeiculos();
        System.out.println();

        adaVeiculos.adicionarVeiculo(new Veiculo("HHH-0010", "Chevrolet", "Cruize", TipoVeiculo.MEDIO));
        adaVeiculos.listarVeiculos();
        System.out.println();

        adaVeiculos.atualizarVeiculo(adaVeiculos.getVeiculo("AAA-0002"),
                new Veiculo("AAA-0012", "Kya", "Picanto", TipoVeiculo.PEQUENO));
        adaVeiculos.atualizarVeiculo(adaVeiculos.getVeiculo("Cruize"),
                new Veiculo("AAA-1313", "Ford", "Eco Sport", TipoVeiculo.SUV));
        adaVeiculos.listarVeiculos();
        System.out.println();
        System.out.println();

        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("Up"));
        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("Eco Sport"));
        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("AAA-1313"));

        System.out.println();

        adaVeiculos.listarVeiculosPorParteNome("SUV");
        System.out.println();
        adaVeiculos.listarVeiculosPorParteNome("Fiat");
        System.out.println();

        adaVeiculos.removerVeiculo(adaVeiculos.getVeiculo("BBB-0005"));
        adaVeiculos.listarVeiculos();

        System.out.println("_________________________________________________");
        System.out.println();

        AdaClientes adaClientes = new AdaClientes();
        adaClientes.listarClientes();
        System.out.println();

        adaClientes
                .adicionarCliente(new Cliente("Carla Alves", "000.000.000.04", TipoPessoa.PESSOA_FISICA));
        adaClientes
                .adicionarCliente(new Cliente("Lojas Elétricas", "00.000.000/0001-04", TipoPessoa.PESSOA_JURIDICA));

        adaClientes.listarClientes();
        System.out.println();

        adaClientes.atualizarCliente(adaClientes.getCliente("Consultoria 926"),
                new Cliente("Consultoria 927", "00.000.000/0001-05", TipoPessoa.PESSOA_JURIDICA));
        adaClientes.listarClientes();
        System.out.println();

        System.out.println(adaClientes.buscarClientePorParteNome("Lojas"));
        System.out.println(adaClientes.buscarClientePorParteNome("Ana"));
        System.out.println();

        adaClientes.listarClientesPorParteNome("Pessoa Física");
        System.out.println();
        adaClientes.listarClientesPorParteNome("Pessoa Jurídica");
        System.out.println();

        adaClientes.removerCliente(adaClientes.getCliente("Carlos Alberto"));
        adaClientes.listarClientes();

        System.out.println("_________________________________________________");

        Aluguel aluguel1 =
                new Aluguel ();
        aluguel1.alugarVeiculo(
                adaVeiculos.getVeiculo("Up"),
                adaClientes.getCliente("Lojas Elétricas"),
                LocalDateTime.now()
        );
        adaVeiculos.listarVeiculos();

        System.out.println(aluguel1);

        Retorno retornoAluguel1 = new Retorno(aluguel1);
        retornoAluguel1.setDataDevolucao((LocalDateTime.now().plusDays(5)));
        System.out.println(retornoAluguel1.calcularDiarias());
        System.out.println();

        retornoAluguel1.devolverVeiculo(aluguel1);
        adaVeiculos.listarVeiculos();

        Aluguel aluguel2 =
                new Aluguel();
        aluguel2.alugarVeiculo(
                adaVeiculos.getVeiculo("Up"),
                adaClientes.getCliente("Lojas Elétricas"),
                LocalDateTime.now()
        );

        System.out.println();
        Veiculo veiculo = new Veiculo("AAB-0909", "Kya", "Sportage", TipoVeiculo.SUV);
        Veiculo veiculo1 = new Veiculo("AAB-0909", "Kya", "Sportage", TipoVeiculo.PEQUENO);
        System.out.println(veiculo);
        System.out.println(veiculo1);
    }
}
