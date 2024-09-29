package animais;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    public String emitirSom() {
        return "O cachorro late";
    }
}