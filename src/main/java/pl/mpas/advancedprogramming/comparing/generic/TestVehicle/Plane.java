package pl.mpas.advancedprogramming.comparing.generic.TestVehicle;

public class Plane extends Vehicle {

    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public Plane() {

    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
