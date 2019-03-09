package pl.mpas.advancedprogramming.comparing.generic.TestVehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleProcessor {

    public static void main(String[] args) {
        List<Plane> planes = new ArrayList<>();
        List<Vehicle> mabyCars = new ArrayList<>();

        addNewCarOntoList(mabyCars);
        displayVehicles(planes);
        // addNewCarOntoList();

        rawAdder(planes);
        planes.get(0);
        displayVehicles(planes);

        Plane p = planes.get(0);
    }

    static void addNewCarOntoList(List<? super Vehicle> vehicles){
        vehicles.add(new Car());
        //vehicles.add(new Vehicle());

        }


    //lista roższeża coś co nie jest pojazdem
    static void displayVehicles(List<? extends Vehicle> vehicle) {
     //
        for (Vehicle vehicle1 : vehicle) {
            System.out.println(vehicle);

           // vehicle.forEach(o -> System.out.println(o));
           // vehicle.forEach(System.out::println);
        }
    }
    static void rawAdder(List maybeCars){
        maybeCars.add(new Plane());
    }
}