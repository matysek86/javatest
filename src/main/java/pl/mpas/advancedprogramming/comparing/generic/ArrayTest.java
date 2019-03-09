package pl.mpas.advancedprogramming.comparing.generic;

import pl.mpas.advancedprogramming.abstract_class.Animal;
import pl.mpas.advancedprogramming.abstract_class.Cat;
import pl.mpas.advancedprogramming.abstract_class.Dog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayTest {

    public static void main(String[] args) {
//tabica z obiektu Dog i CAT !!!!


        Dog[] dogs  = new  Dog[2];
        dogs[0] = new Dog("Azor");
        dogs[1] = new Dog("Dinfgo");

        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Fifi");
        cats[1] = new Cat("PIPI");

        Animal[] animals = dogs;
        Object[] objects = animals;

        displayAnimal(cats);
        displayAnimal(dogs);
        addDog(dogs);
       displayAnimal(dogs);
        System.out.println(dogs[0]);

       // addDog(cats);
    }


    public static void addDog(Animal[] animals){
        animals[0]=new Dog("big DOG");

    }

    public static void  displayAnimal (Animal[] animals){
        for (Animal animal:animals) {
            System.out.println(animal);

        }
    }

}
