package generics;

import generics.models.Animal;
import generics.models.Cachorro;
import generics.models.Cavalo;
import generics.models.Gato;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void processElements(List<? extends Animal> animais){
        for(Animal a : animais){
            System.out.println(a.emitirSom());
        }
    }

    public static void main(String[] args) {

        List<Cachorro> cachorroArrayList = new ArrayList<>();
        List<Cavalo> cavaloList = new ArrayList<>();
        List<Gato> gatoList = new ArrayList<>();
        
        orangeList.add(new Orange());
        appleList.add(new Apple());
        fujiAppleList.add(new FujiApple());
        processElements(orangeList);
        processElements(appleList);
        processElements(fujiAppleList);
    }

}
}
