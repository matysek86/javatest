package pl.mpas.advancedprogramming.threading.deadpool;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {

    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Performcnce :" + Thread.currentThread().getName());
        };

        Runnable jobabc = () -> {
            System.out.println("ABCAB : " + Thread.currentThread().getName());
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);

        for (int i=0; i<200; i++ ) {
            workers.execute(job);
            workers.execute(jobabc);

        }
        // zamykamy tym kolejkę
        workers.shutdown();
        System.out.println("after seconding .......");

    }
}
