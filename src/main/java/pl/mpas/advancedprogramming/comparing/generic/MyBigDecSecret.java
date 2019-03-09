package pl.mpas.advancedprogramming.comparing.generic;

import java.math.BigDecimal;

public class MyBigDecSecret {
    private BigDecimal mysecretBig;

    @Override
    public String toString() {
        return "MyBigDecSecret{" +
                "secretBig=" + mysecretBig +
                '}';
    }

    public MyBigDecSecret(BigDecimal secretBig) {
        this.mysecretBig = secretBig;
    }

    public BigDecimal getSecretBig() {
        return mysecretBig;
    }
}
