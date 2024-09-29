package hierarquiaDeVeiculos;

public class  Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelol, int ano, int numeroDePortas) {
        super(marca, modelol, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}
