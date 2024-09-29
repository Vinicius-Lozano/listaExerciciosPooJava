package hierarquiaDeVeiculos;

public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Genérica", "Modelo X", 2000);
        System.out.println("Detalhes do Veiculo:");
        veiculo.exibirDetalhes();
        System.out.println();

        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();
        System.out.println();

        Moto moto = new Moto("Honda", "CB500", 2021, "Esportivo");
        System.out.println("Detalhe da Moto:");
        moto.exibirDetalhes();
    }
}
