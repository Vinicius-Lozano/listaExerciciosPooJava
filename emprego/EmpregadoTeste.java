package emprego;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado ob1 = new Empregado("maria", "santos", 9.0);
    Empregado ob2 = new Empregado("jose", "santos", 10.0);

    System.out.println(ob1.getSalarioAnual());
    System.out.println(ob2.getSalarioAnual());

    System.out.println("Aumento");
    System.out.println(ob1.getSalarioAnual() * 1.1);
    System.out.println(ob2.getSalarioAnual() * 1.1);
    }
}
