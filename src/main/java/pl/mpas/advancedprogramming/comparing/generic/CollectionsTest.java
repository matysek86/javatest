package pl.mpas.advancedprogramming.comparing.generic;

import pl.mpas.advancedprogramming.abstract_class.Animal;
import pl.mpas.advancedprogramming.abstract_class.Cat;
import pl.mpas.advancedprogramming.abstract_class.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {


      List<Animal> someList = new ArrayList<>();
      someList.add(new Dog("Azor1"));
      someList.add(new Cat("Azor2"));

      displayAnimals(someList);
      addAnimal(someList);

        List<Dog> dogi = Arrays.asList(
                new Dog("Pysio"),
                new Dog("Dysio")
        );
        List<Cat> caty = Arrays.asList(
                new Cat("PICZA"),
                new Cat("PuPA")
        );


        displayAnimals(caty);
        displayAnimals(dogi);
    }

    // listy i kolekcje nie pamiętają jakiego jest typu


    public static void displayAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);

        }
    }

    // gdy tu jest super : <? super Animal> to  mozemy dodawać już animele i CAT i DOG a wysyłac co to jest wyżej object
    // nie możemy dodawać Object.. bo jess wyżej
    // List<? extends Animal> animals - tu można dodawać to co dotyczy klas poniżej Animal ale nie ANIMALA
    public static void addAnimal (List<? super Animal> animals){
        animals.add(new Dog("Azor"));

    }

}