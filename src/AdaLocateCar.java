import com.locate.ada.veiculos.AdaVeiculos;
import com.locate.ada.veiculos.Veiculo;

public class AdaLocateCar {

    public static void main(String[] args) {

        AdaVeiculos adaVeiculos = new AdaVeiculos();
        adaVeiculos.listarVeiculos();
        System.out.println();

        adaVeiculos.adicionarVeiculo(new Veiculo("HHH-0010", "Chevrolet", "Cruize", "Médio"));
        adaVeiculos.listarVeiculos();
        System.out.println();

        adaVeiculos.atualizarVeiculo(adaVeiculos.getVeiculo("AAA-0002"),
                new Veiculo("AAA-0012", "Kya", "Picanto", "Pequeno"));
        adaVeiculos.atualizarVeiculo(adaVeiculos.getVeiculo("Cruize"),
                new Veiculo("AAA-1313", "Ford", "Eco Sport", "SUV"));
        adaVeiculos.listarVeiculos();
        System.out.println();
        System.out.println();

        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("Chevrolet"));
        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("Fiat"));
        System.out.println(adaVeiculos.buscarVeiculoPorParteNome("SUV"));

        System.out.println();

        adaVeiculos.listarVeiculosPorParteNome("SUV");
        System.out.println();
        adaVeiculos.listarVeiculosPorParteNome("Fiat");
        System.out.println();

        adaVeiculos.removerVeiculo(adaVeiculos.getVeiculo("BBB-0005"));
        adaVeiculos.listarVeiculos();

    }
}
