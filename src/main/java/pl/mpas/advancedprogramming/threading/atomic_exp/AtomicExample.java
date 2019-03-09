package pl.mpas.advancedprogramming.threading.atomic_exp;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();
        Runnable jab =() -> {
       i.incrementAndGet(); //++i
       i.getAndIncrement(); //i++

        int currentValue = 0;

        do {
            currentValue = i.intValue();

        }
        while (!i.compareAndSet(currentValue,currentValue+2));

        };

    }
}
