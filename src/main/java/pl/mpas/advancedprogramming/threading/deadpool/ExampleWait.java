package pl.mpas.advancedprogramming.threading.deadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleWait {
public static int Increment = 0;


    public static void main(String[] args) {


        ExecutorService workersSDA = Executors.newFixedThreadPool(4);
        //int[] i ={0};
        Runnable jobSDA = () -> {
            synchronized (ExampleWait.class) {
                Increment++;
            }
            };

        for (int i=0; i< 2000000; i++){
            workersSDA.execute(jobSDA);
        }
        workersSDA.shutdown();

        do
            try {
                workersSDA.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        while (!workersSDA.isTerminated());

        System.out.println("increment = " + Increment);
    }
}
