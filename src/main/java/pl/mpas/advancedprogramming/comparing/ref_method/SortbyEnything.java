package pl.mpas.advancedprogramming.comparing.ref_method;

import pl.mpas.advancedprogramming.comparing.Car;

public class SortbyEnything {

    public static int sortByType(Car first, Car second) {

     int comparingResult = first.getBrand().compareTo(second.getBrand());
       if (0 !=comparingResult){
           return comparingResult;
       }
comparingResult = first.getModel().compareTo(second.getModel());
       if (0 != comparingResult) {
           return comparingResult;
       }
       return  first.getYearOfProduction().compareTo(second.getYearOfProduction());
           }
}