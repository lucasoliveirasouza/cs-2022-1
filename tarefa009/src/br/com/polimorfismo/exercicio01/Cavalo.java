package br.com.polimorfismo.exercicio01;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emitirSom() {
        return "Relinxa";
    }

    public String correr(){
        return "Corri";
    }


}
