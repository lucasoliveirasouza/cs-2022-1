package br.com.polimorfismo.exercicio01;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Late";
    }

    public String correr(){
        return "Corri";
    }
}
