package inteiro;

public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet() {
        conjunto = new boolean[101];
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        } else {
            System.out.println("intervalo permitido (0-100).");
        }
    }

    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        } else {
            System.out.println("intervalo permitido (0-100).");
        }
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
            }
        }
        return sb.length() > 0 ? sb.toString().trim() : "-";
    }

    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i < conjunto.length; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();

        conjunto1.insereElemento(10);
        conjunto1.insereElemento(20);
        conjunto1.insereElemento(30);

        conjunto2.insereElemento(20);
        conjunto2.insereElemento(30);
        conjunto2.insereElemento(40);

        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());

        InteiroSet uniao = conjunto1.union(conjunto2);
        System.out.println("União: " + uniao.toSetString());

        InteiroSet intersecao = conjunto1.intersecao(conjunto2);
        System.out.println("Interseção: " + intersecao.toSetString());

        System.out.println("Conjuntos 1 e 2 são iguais? " + conjunto1.ehIgualTo(conjunto2));

        conjunto1.insereElemento(40);
        System.out.println("Conjunto 1: " + conjunto1.toSetString());

        System.out.println("Conjuntos 1 e 2 são iguais agora? " + conjunto1.ehIgualTo(conjunto2));
    }
}
