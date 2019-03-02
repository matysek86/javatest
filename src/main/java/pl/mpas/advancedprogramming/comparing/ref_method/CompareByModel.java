package pl.mpas.advancedprogramming.comparing.ref_method;

import pl.mpas.advancedprogramming.comparing.Car;

public class CompareByModel {

    public int orderByModel(Car first, Car second) {
        return
                first.getModel().compareTo(second.getModel());

    }


}
