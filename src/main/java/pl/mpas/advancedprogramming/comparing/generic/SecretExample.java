package pl.mpas.advancedprogramming.comparing.generic;

import pl.mpas.advancedprogramming.abstract_class.Cat;
import pl.mpas.advancedprogramming.abstract_class.Dog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SecretExample {

    public static void main(String[] args) {

        MyStringSecret drem = new MyStringSecret("hahahaha");
        MyBigDecSecret icons = new MyBigDecSecret(BigDecimal.ZERO);

        MYSecretGenercV1 iteger = new MYSecretGenercV1(Integer.valueOf(1));
        //MYSecretGenercV1 iteger = new MYSecretGenercV1(1);

        Integer secretInteger = (Integer) iteger.getObject();
        iteger.toString();

        MYSecretGenercV1 anotherDream = new MYSecretGenercV1("ddfgghhh");

        checkMySecret(iteger);
        checkMySecret(anotherDream);

        List animal = new ArrayList();
        animal.add(new Dog("Azor"));
        animal.add(new Cat("FiFI"));
        checkAnimal(animal);


        //MySecondGeneric<String> mySecondGeneric = new MySecondGeneric<>("secrete");
        //MySecondGeneric<BigDecimal> mySecondGeneric1 = new MySecondGeneric<>(BigDecimal.valueOf(13455));
        //MySecondGeneric<Object> mySecondGeneric2 = new MySecondGeneric<>(new Object());
        //MySecondGeneric mySecondGeneric3 = new MySecondGeneric(new Object());

        MySecondGeneric2<String,String> mySecondGeneric2 = new MySecondGeneric2<>("sss", "ffff");
    }

    public static void checkAnimal(List animal) {
        for (Object animal1 : animal) {
            if (animal1 instanceof Dog) {
                System.out.println("Dog");
            } else if (animal instanceof Cat) {
                System.out.println("Cat");
            } else {
                System.out.println("uknown Animal");
            }
        }
        }

        public static void checkMySecret (MYSecretGenercV1 secretGenercV1)
        {
            if (secretGenercV1.getObject() instanceof Integer) {
                Integer secret = (Integer) secretGenercV1.getObject();
                System.out.println("Secret: " + secret);
            }
        }

    }
