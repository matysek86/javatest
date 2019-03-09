package pl.mpas.advancedprogramming.comparing.generic;

import java.util.Objects;

public class MYSecretGenercV1 {

    private Object object;

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MYSecretGenercV1{" +
                "object=" + object +
                '}';
    }

    public MYSecretGenercV1(Object object) {
        this.object = object;
    }
}
