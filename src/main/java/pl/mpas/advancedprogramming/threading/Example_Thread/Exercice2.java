package pl.mpas.advancedprogramming.threading.Example_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercice2 {

         // 3 wątki zwiększają zwiększają zmienną typu long (500 iteracji)
        // wątek zwiększa zmienną co 500ms (w jobie)
        // wątki używają synchronizacji przy zapisie
        // jeden wątek wypisuje (bez synchronizacji) - cały czas
        // obserwujemy wyjście i sprawdzamy czy wypis zgadza się z zapisem
        // do zmiennej
//volatile pozwala zawsze czytać zmiennną counter - to wymyszenie czytania w tempo ZAWSZE !!!

       volatile static long counter = 0;

        public static void main(String[] args) {
            Runnable increaseJob = () -> {
                long currentCounterValue;
                for (int i = 0; i < 2000; i++) {

//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                    synchronized (Exercice2.class) {
                        currentCounterValue = ++counter;
                    }

                    System.out.println(String.format("Current value: [%s], from thred: [%s]",
                            currentCounterValue, Thread.currentThread().getName()));
                }
            };

            Runnable showJob = () -> {
               // while (counter <3 * 500 000) {
                while (true) {
                    System.out.println("Value: [" + counter + "]");
                }
            };

            ExecutorService workers = Executors.newFixedThreadPool(4);
            workers.execute(showJob);
            workers.execute(increaseJob);
            workers.execute(increaseJob);
            workers.execute(increaseJob);


        }
    }




