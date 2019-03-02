package pl.mpas.advancedprogramming.comparing;

import java.util.Comparator;

public class CarBandCompartator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o1.getColour().compareTo(o2.getBrand());
    }

}
