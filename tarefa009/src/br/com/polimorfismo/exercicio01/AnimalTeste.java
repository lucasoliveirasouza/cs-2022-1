package br.com.polimorfismo.exercicio01;

public class AnimalTeste {

    public static void main(String[] args) {
        Animal animal1 = new Cachorro("Tiquinha", 1);
        Animal animal2 = new Cavalo("Trovão", 5);
        Animal animal3 = new Preguica("Leo", 2);

        System.out.println("Animal 1: " + animal1.emitirSom());
        System.out.println("Animal 2: " + animal2.emitirSom());
        System.out.println("Animal 3: " + animal3.emitirSom());

        System.out.println("\n\nOs Animais após serem examinados:");

        Veterinario vet = new Veterinario();
        System.out.println("Animal 1: " + vet.examinar(animal1));
        System.out.println("Animal 2: " + vet.examinar(animal2));
        System.out.println("Animal 3: " + vet.examinar(animal3));

        System.out.println("\n\nOs animais do zoo:");
        Zoologico zoo = new Zoologico();

        zoo.setJaulas(new Jaula(new Cachorro("Tiquinha",1)));
        zoo.setJaulas(new Jaula(new Cachorro("Belinha",1)));
        zoo.setJaulas(new Jaula(new Cachorro("Sol",1)));
        zoo.setJaulas(new Jaula(new Cachorro("Kyra",1)));
        zoo.setJaulas(new Jaula(new Cavalo("Trovão",1)));
        zoo.setJaulas(new Jaula(new Cavalo("Barão",1)));
        zoo.setJaulas(new Jaula(new Cavalo("Thor",1)));
        zoo.setJaulas(new Jaula(new Preguica("Maria",1)));
        zoo.setJaulas(new Jaula(new Preguica("Leo",1)));
        zoo.setJaulas(new Jaula(new Preguica("Vitor",1)));

        for(int i = 0; i < zoo.getJaulas().size(); i++){
            System.out.println("Animal " + i + ": " + zoo.getJaulas().get(i).getAnimal().emitirSom());
        }





    }

}
