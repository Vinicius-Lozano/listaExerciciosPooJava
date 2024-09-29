package produtos;

public class Eletronico extends Produtos {

    private int garantia;

    public Eletronico (String nome, double preco, int garantia){

        super(nome, preco);
        this.garantia = garantia;

    }

    public int getGarantia(){
        return garantia;
    }

    public void setGarantia(int garantia){
        this.garantia = garantia;
    } 

    public double calcularPrecoComDesconto(){
        return getPreco() * 0.9;
    }   
}
