package extract_superclass.after_refactoring;

public class Gato extends Animal{
    public Gato(String nome, int idade, double peso, double tamanho) {
        super(nome, idade, peso, tamanho);
    }

    @Override
    public String emitirSom() {
        return "Miar";
    }
}
