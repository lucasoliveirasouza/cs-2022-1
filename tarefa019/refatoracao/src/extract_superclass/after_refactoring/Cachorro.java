package extract_superclass.after_refactoring;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, double peso, double tamanho) {
        super(nome, idade, peso, tamanho);
    }

    @Override
    public String emitirSom() {
        return "Latir";
    }
}
