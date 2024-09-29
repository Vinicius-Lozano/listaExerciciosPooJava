package animais;

public class AnimalTeste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3);
        System.out.println("Animal: " + cachorro.getNome());
        System.out.println("Som emitido: " + cachorro.emitirSom());
        System.out.println();

        Gato gato = new Gato("Mimi", 2);
        System.out.println("Animal" + gato.getNome());
        System.out.println("Som emitido: " + gato.emitirSom());
    }
}