package generics;

import generics.models.Animal;
import generics.models.Cachorro;
import generics.models.Cavalo;
import generics.models.Gato;

import java.util.ArrayList;
import java.util.List;

public class Generics {



    public static void main(String[] args) {

        List<Cachorro> cachorroList = new ArrayList<>();
        List<Cavalo> cavaloList = new ArrayList<>();
        List<Gato> gatoList = new ArrayList<>();

        Generics generico = new Generics();

        cachorroList.add(new Cachorro());
        cachorroList.add(new Cachorro());

        cavaloList.add(new Cavalo());
        cavaloList.add(new Cavalo());

        gatoList.add(new Gato());
        gatoList.add(new Gato());

        generico.emitirSons(cachorroList);
        generico.emitirSons(cavaloList);
        generico.emitirSons(gatoList);
    }

    public void emitirSons(List<? extends Animal> animais){
        for(Animal a : animais){
            System.out.println(a.emitirSom());
        }
    }

}
