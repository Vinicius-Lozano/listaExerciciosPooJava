package produtos;

public class ProdutosTest {

    public static void main(String[] args){
        Eletronico eletronico1 = new Eletronico("SmartPhone", 8000, 10);
        System.out.println("Produtos: " + eletronico1.getNome());
        System.out.println("Valor Original: " + eletronico1.getPreco());
        System.out.println("Valor Com Desconto: " + eletronico1.calcularPrecoComDesconto());
        System.out.println("Garantia: " + eletronico1.getGarantia() + "Meses");
        System.out.println();

        Alimento alimento1 = new Alimento("Arroz", 10.00, "03/12");
        System.out.println("Produtos: " + alimento1.getNome());
        System.out.println("Valor Original: " + alimento1.getPreco());
        System.out.println("Valor Com Desconto: " + alimento1.calcularPrecoComDesconto());
        System.out.println("Data de Validade: " + alimento1.getDataDeValidade());
    }
}