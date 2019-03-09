package pl.mpas.advancedprogramming.Steram;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        //2x order
        //3 do 4 item
        // 2 ingeradients

        List<Item> myItem = Arrays.asList(
                new Item("pierwsze", BigDecimal.valueOf(35.01), Arrays.asList(new Ingredients("paprica"))),
                new Item("drugie", BigDecimal.valueOf(15.02), Arrays.asList(new Ingredients("chees"))));

        Order saturdayShopping = new Order(myItem);

        getIngredientsName(Arrays.asList(saturdayShopping, saturdayShopping));

        System.out.println(getSumOfBigDecimal(Arrays.asList(saturdayShopping, saturdayShopping)));
    }

    public static List<String> getIngredientsName(List<Order> orders) {
        ///    IntStream.range(1,100);
        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngredients().stream())
                .map(Ingredients::getName)
                .distinct()
                .collect(Collectors.toList());

    }

    public static List<String> getSumOfBigDecimal(List<Order> orders) {
        orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .map(item -> item.getPrice())
                .reduce(BigDecimal.ZERO, (bigDecimal, bigDecimal2) -> bigDecimal.add(bigDecimal2));
        // .reduce((bigDecimal, bigDecimal2) -> bigDecimal.plus(bigDecimal2.);


        return Collections.emptyList();
    }

    public static List<String> getIngredientsName2(List<Order> orders) {
        ArrayList<String> ListofString = new ArrayList<>();
        ///    IntStream.range(1,100);
        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngredients().stream())
                .map(Ingredients::getName)
                .distinct()
                .reduce(ListofString, (strings, s) -> {
                    strings.add(s);
                    return strings;
                    // poniżej jest Combiner
                }, (strings, string2) -> ListofString );
        // (strings, strings2) -> strings.addAll(strings2);
        // result strings;

    }
}


