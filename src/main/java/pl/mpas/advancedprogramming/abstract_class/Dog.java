package pl.mpas.advancedprogramming.abstract_class;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public void huhu(){

    }
}
