package pl.mpas.advancedprogramming.abstract_class;

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
