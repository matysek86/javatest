package pl.mpas.advancedprogramming.comparing.generic;

import java.math.BigDecimal;

public class MyStringSecret {

    private String secret;


    @Override
    public String toString() {
        return "MyStringSecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public MyStringSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }
}
