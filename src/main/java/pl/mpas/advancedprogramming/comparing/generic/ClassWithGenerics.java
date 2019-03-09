package pl.mpas.advancedprogramming.comparing.generic;

import java.math.BigDecimal;
import java.util.Objects;

public class ClassWithGenerics {

    private String mayeName;
    private Double maybeIncome;
    private BigDecimal hugeNumber;

    public ClassWithGenerics(String mayeName, Double maybeIncome, BigDecimal hugeNumber) {
        this.mayeName = validateString(mayeName);
        this.maybeIncome = validateDate(maybeIncome);
        this.hugeNumber = validateDate(hugeNumber);

        validateDate(hugeNumber);
    }

    private String validateString(String toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Cannot ne null");
        }
        return toCheck;
    }

    private Double validateDuble(Double toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Cannot ne null");
        }
        return toCheck;
    }


  // <T> paramertyzuje to co wyciąga później ta metoda bo samo T to jest operator a <T> jest mechanizmem do oddawania tego

    private <T> T validateDate (T toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Cannot ne null");
        }
        return toCheck;
    }



}
