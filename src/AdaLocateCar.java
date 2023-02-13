import com.locate.ada.clientes.AdaClientes;
import com.locate.ada.clientes.Cliente;
import com.locate.ada.veiculos.AdaVeiculos;
import com.locate.ada.veiculos.Veiculo;

public class AdaLocateCar {

    public static void main(String[] args) {

//        AdaVeiculos adaVeiculos = new AdaVeiculos();
//        adaVeiculos.listarVeiculos();
//        System.out.println();
//
//        adaVeiculos.adicionarVeiculo(new Veiculo("HHH-0010", "Chevrolet", "Cruize", "Médio"));
//        adaVeiculos.listarVeiculos();
//        System.out.println();
//
//        adaVeiculos.atualizarVeiculo(adaVeiculos.getVeiculo("AAA-0002"),
//                new Veiculo("AAA-0012", "Kya", "Picanto", "Pequeno"));
//        adaVeiculos.atualizarVeiculo(adaVeiculos.getVeiculo("Cruize"),
//                new Veiculo("AAA-1313", "Ford", "Eco Sport", "SUV"));
//        adaVeiculos.listarVeiculos();
//        System.out.println();
//        System.out.println();
//
//        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("Chevrolet"));
//        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("Fiat"));
//        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("SUV"));
//
//        System.out.println();
//
//        adaVeiculos.listarVeiculosPorParteNome("SUV");
//        System.out.println();
//        adaVeiculos.listarVeiculosPorParteNome("Fiat");
//        System.out.println();
//
//        adaVeiculos.removerVeiculo(adaVeiculos.getVeiculo("BBB-0005"));
//        adaVeiculos.listarVeiculos();
//
//        System.out.println("_________________________________________________");
//        System.out.println();

        AdaClientes adaClientes = new AdaClientes();
        adaClientes.listarClientes();
        System.out.println();

        adaClientes
                .adicionarCliente(new Cliente("Carla Alves", "000.000.000.04", "Pessoa Física"));
        adaClientes
                .adicionarCliente(new Cliente("Lojas Elétricas", "00.000.000/0001-04", "Pessoa Jurídica"));

        adaClientes.listarClientes();
        System.out.println();

        adaClientes.atualizarCliente(adaClientes.getCliente("Consultoria 926"),
                new Cliente("Consultoria 927", "00.000.000/0001-05", "Pessoa Jurídica"));
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



    }
}
