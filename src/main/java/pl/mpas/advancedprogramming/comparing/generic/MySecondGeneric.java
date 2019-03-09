package pl.mpas.advancedprogramming.comparing.generic;

import pl.mpas.advancedprogramming.abstract_class.Animal;

//T oto naj ogółniej
//gdy dajemy tylko zwierzęta to : T extends Animal
// gdy chcemy zwięrzę i cośyższe od niego to : T super Animal się nie da bo wspólne to object !!!!!
//
public class MySecondGeneric <T extends Animal> {
    private T object;

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MYSecretGenercV1{" +
                "object=" + object +
                '}';
    }

    public MySecondGeneric(T object) {
        this.object = object;
    }
}
