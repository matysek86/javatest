package pl.mpas.advancedprogramming.comparing.generic.TestVehicle;

public class Car extends Vehicle {

    private String name;

    public Car() {
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
    }
}
