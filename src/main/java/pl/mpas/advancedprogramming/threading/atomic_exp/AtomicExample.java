package pl.mpas.advancedprogramming.threading.atomic_exp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
// wszystkie oedtody Stirng Buffer są synchronzowane
    // wszystkie metody StringBulider nie są synchronizowane
    // te metody służa do obłsugi stringow ...
public static int Increment = 0;

    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger(0);
        AtomicInteger j = new AtomicInteger(0);
        AtomicInteger k = new AtomicInteger(0);


        Runnable jab =() -> {
            i.incrementAndGet(); //++i
            i.getAndIncrement(); //i++

            int currentValue = 0;

            do {
                currentValue = i.intValue();

            }
            while (!i.compareAndSet(currentValue,currentValue+2));

        };


        Runnable jobincreament = () -> {
            for (int l=0;l<100; l++){
                     int tmp = k.incrementAndGet();
                     Increment = tmp;
          System.out.println("Value of k: " + k + " doing by  -" + Thread.currentThread().getName());

        }
        };

        ExecutorService workers = Executors.newFixedThreadPool(3);
        workers.execute(jobincreament);
        workers.execute(jobincreament);
        workers.execute(jobincreament);
        workers.shutdown();
        do {
            try {
                workers.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }while (!workers.isTerminated());

             System.out.println("Increment " + Increment + " " + k);



        };


    }

