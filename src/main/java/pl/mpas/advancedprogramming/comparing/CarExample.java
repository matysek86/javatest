package pl.mpas.advancedprogramming.comparing;

import pl.mpas.advancedprogramming.comparing.ref_method.CompareByModel;
import pl.mpas.advancedprogramming.comparing.ref_method.SortbyEnything;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarExample {

    public static void main(String[] args) {
        // przykład metody fabrycznej czyli wywolujemy metodę która od rzau tworzy obiekt z bebechami - asList
        List<Car> Cars = Arrays.asList(
                new Car("Ford", "Fiesta", "Black", 1, LocalDate.of(2011, 11, 1)),
                new Car("Ford", "Fous", "White", 1, LocalDate.of(2010, 9, 1)),
                new Car("Ford", "Kuga", "Green", 1, LocalDate.of(2009, 3, 1)),
                new Car("Ford", "MusTanG", "Green", 1, LocalDate.of(2009, 3, 1)),
                new Car("Ford", "Mondeo", "Silver", 1, LocalDate.of(1999, 1, 1))
        );

        System.out.println(Cars);
        // Collections.sort(Cars);
        // przy użyciu Comparable możemy sortować z wykorzystaniem natutralnego porządku z użyciem compareTo .
        Collections.sort(Cars, Car::compareTo);
        System.out.println(Cars);
        Collections.sort(Cars);
        System.out.println(Cars);
        //interfejs funkcyjny jest klasą interfejs i ma jedną metodę apstrakcyjną czyli nie ma ciała metody -

        // Car carToComCare= new Car ("Ford","Mondeo", "Silver", 1, LocalDate.of(1999,1,1));
        // celem Lambdy jest jedna brakujaca metoda. Odna doobudowuje obiekt z wykorzystaniem niezaimplementowaniem metody
        // carToComCare.mabeyComparing((Car o) -> 1 );

        //sorotwanie z metodą fabryczną
        Collections.sort(Cars, new CarBandCompartator());
        System.out.println(Cars);

        // nowy obiekt klasy anonimowej !!!!!! od razu na obiekcie
        Cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }
        });

        Cars.sort((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));
///  REFERENCJE DO METDOD z wykorzystaniem lambdy przenosi zachowani i przenosi je do metody z poza klas dziedziczonych
        CompareByModel anotherModleComaprWay = new CompareByModel();
        //Cars.sort((car1, car2) -> {return anotherModleComaprWay.orderByModel(car1,car2);d

        //posortuj listę Car używając metodę ordebyModel znajdującej sie w anothermodel....
        //czyli ta lambda bierze srotowanie i przekazuje jeje wartości do metody ordebymetod ..
        // referencja do metod to współdzielenie kodu
        Cars.sort(anotherModleComaprWay::orderByModel);

        // klaska która sortuje po

        Cars.sort((o1, o2) -> SortbyEnything.sortByType(o1,o2));
        Cars.sort(SortbyEnything::sortByType);

 // funkcja wyższego rzędu albp przyjmuje jako argument funckeję albo produkuje funkcje





    }
}
