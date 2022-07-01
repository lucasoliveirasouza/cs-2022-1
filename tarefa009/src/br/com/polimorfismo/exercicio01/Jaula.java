package br.com.polimorfismo.exercicio01;

public class Jaula {
    private Animal animal;

    public Jaula(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
