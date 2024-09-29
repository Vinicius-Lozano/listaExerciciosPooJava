package inteiro;

public class InteiroSetTest {
    public static void main(String[] args) {
        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();
        
        System.out.println("Inserção de elementos");
        conjunto1.insereElemento(5);
        conjunto1.insereElemento(10);
        conjunto1.insereElemento(15);
        System.out.println("Conjunto 1: " + conjunto1.toSetString()); 
        
        conjunto2.insereElemento(10);
        conjunto2.insereElemento(20);
        conjunto2.insereElemento(30);
        System.out.println("Conjunto 2: " + conjunto2.toSetString()); 
        System.out.println("\nTeste: União dos conjuntos");
        InteiroSet uniao = conjunto1.union(conjunto2);
        System.out.println("União: " + uniao.toSetString()); 

        System.out.println("\nTeste: Interseção dos conjuntos");
        InteiroSet intersecao = conjunto1.intersecao(conjunto2);
        System.out.println("Interseção: " + intersecao.toSetString()); 

        System.out.println("\nTeste: Verificar igualdade");
        boolean igualdade = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Conjuntos 1 e 2 são iguais? " + igualdade); 

        System.out.println("\nTeste: Remover elemento");
        conjunto1.deleteElemento(5);
        System.out.println("Conjunto 1 após remover 5: " + conjunto1.toSetString());

        System.out.println("\nTeste: Verificar conjunto vazio");
        InteiroSet conjuntoVazio = new InteiroSet();
        System.out.println("Conjunto Vazio: " + conjuntoVazio.toSetString()); 

        System.out.println("\nTeste: Igualdade após inserção");
        conjunto1.insereElemento(20);
        conjunto1.insereElemento(30);
        igualdade = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Conjuntos 1 e 2 são iguais agora? " + igualdade); 
    }
}