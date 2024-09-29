package animais;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public String emitirSom() {
        return "O gato mia";
    }
}