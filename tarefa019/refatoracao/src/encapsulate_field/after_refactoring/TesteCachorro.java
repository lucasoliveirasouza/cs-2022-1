package encapsulate_field.after_refactoring;



public class TesteCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Belinha",1.2, 2, 25);
        System.out.println(cachorro.getNome());
    }
}
