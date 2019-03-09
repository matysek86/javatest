package pl.mpas.advancedprogramming.comparing.generic;

import pl.mpas.advancedprogramming.abstract_class.Animal;


public class MySecondGeneric2<T, V> {
    private T object;
    private V object2;

    public MySecondGeneric2(T object, V object2) {
        this.object = object;
        this.object2 = object2;
    }

    public T getObject() {
        return object;
    }

    public V getObject2() {
        return object2;
    }

    @Override
    public String toString() {
        return "MySecondGeneric2{" +
                "object=" + object +
                ", object2=" + object2 +
                '}';
    }
}