package pl.mpas.advancedprogramming.abstract_class;

import java.util.Objects;

public abstract class Animal {

    private static final int NAME_MMIn_LEN = 1;
    protected String name;

    public Animal(String name) {
        this.name = Objects.requireNonNull(name, "Co to jest ???");
        //this.name = name;
        //czy ma długosć więcej niz jeden

        if (name.length()< NAME_MMIn_LEN){
            throw  new RuntimeException("Name too short: [" + name + "], minimal lenght is: ' " + NAME_MMIn_LEN);

        }
    }

    public abstract void eat();


    public abstract void play();


}
