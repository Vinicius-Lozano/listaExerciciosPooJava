package faturaLojaDSuplemento;

public class FaturaTeste{
    public static void main(String[] args) {
        Fatura f = new Fatura("Whey", "Max", 2, 1.5);

        System.out.println("comprou o: " + f.getCodigoProduto());
        System.out.println("da marca: " + f.getDescricaoProduto());
        System.out.println("possui o valor de: " + f.getPrecoPorItem());
        System.out.println("quantidade: " + f.getQuantidadeComprada());
        System.out.println("total: " + f.getTotalFatura());
    }
}
