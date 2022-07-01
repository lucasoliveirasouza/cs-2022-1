package br.com.polimorfismo.exercicio01;

public class Preguica extends Animal{


    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Grune";
    }

    public String subirEmArvore(){
        return "Subi";
    }

}
