package encapsulate_field.before_refactoring;

public class Cachorro {
    String nome;
    double tamanho;
    double peso;
    int idade;

    Cachorro(String nome, double tamanho, double peso, int idade){
        this.nome = nome;
        this.tamanho = tamanho;
        this.peso = peso;
        this.idade = idade;
    }

}
