package pl.mpas.advancedprogramming.comparing;

import java.time.LocalDate;

public class Car implements Comparable<Car> {

    private String brand;
    private String model;
    private String colour;
    private float capacity;
    private LocalDate yearOfProduction;


    public Car(String brand, String model, String colour, float capacity, LocalDate yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.capacity = capacity;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public LocalDate getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", capacity=" + capacity +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public void setYearOfProduction(LocalDate yearOfProduction) {
        this.yearOfProduction = yearOfProduction;


    }

    //prównanie po roku ale gdy chcemy
    @Override
    public int compareTo(Car o) {
        //return this.yearOfProduction.getYear()-o.yearOfProduction.getYear();
        return yearOfProduction.compareTo(o.yearOfProduction);
    }
// jak klasa implementuje clase compare to to

    //czy comparable jest interfejsem funkcyjnym ? Nie JEST
    public void mabeyComparing(Comparable<Car> comparable) {
        System.out.println("tu jestem");
        System.out.println(comparable.compareTo(this));
    }

}
