package faturaLojaDSuplemento;

public class Fatura{
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItem;

    public Fatura(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem){
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }

    public String getCodigoProduto(){
        return this.codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    
    public String getDescricaoProduto(){
        return this.descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto){
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada(){
        return this.quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada){
        this.quantidadeComprada = 
        quantidadeComprada > 0 ? quantidadeComprada : 0;
    }
    
    public void setPrecoPorItem(double precoPorItem){
        this.precoPorItem = precoPorItem > 0 ? precoPorItem : 0;
    }

    public double getPrecoPorItem(){
        return this.precoPorItem;
    }

    public double getTotalFatura(){
        return precoPorItem * quantidadeComprada;
    }
}