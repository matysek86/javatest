package pl.mpas.advancedprogramming.comparing.generic.Optionl;

import java.util.Optional;
import java.util.function.Predicate;

public class GenericOptionalTest {

    public static void main(String[] args) {
        Optional<String> maybeMyName = Optional.of("Mariusz");
        System.out.println(checkIfNameMatch("Mariusz", maybeMyName));
        System.out.println(checkIfNameMatch("Maniek", maybeMyName));
        //System.out.println(checkIfNameMatch(null, maybeMyName));

        //referencja do metody


    }

    // Optional to pojemnik który może mieć ale nie musi, obsługuje NULLe
//
    public static boolean checkIfNameMatch(String name, Optional<String> maybeName) {

        Predicate<String> stringPredicatetest = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return name.equals(s);
            }
        };

        Predicate<CharSequence> charSequencePredicate = new Predicate<CharSequence>() {
     //metoda ??? jakaś
            @Override
            public boolean test(CharSequence charSequence) {
                return name.equals(charSequence);
            }
        };

        System.out.println("Testing....");
        //przesłanie chrsequence do metody test z użyciem filter jak predicate

        System.out.println("pierwszy " + maybeName.filter(s -> charSequencePredicate.test(s)));
        //System.out.println("pierwszy " + maybeName.filter(charSequencePredicate::test));


        System.out.println("Testing....");
        System.out.println("pierwszy " + maybeName.filter(stringPredicatetest));

        return (maybeName.filter(s -> s.equals(name)).isPresent());
    }
}



