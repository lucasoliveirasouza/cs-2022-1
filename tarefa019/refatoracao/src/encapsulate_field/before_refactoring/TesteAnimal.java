package encapsulate_field.before_refactoring;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Belinha",1.2, 2, 25);
        System.out.println(cachorro.nome);
    }
}
