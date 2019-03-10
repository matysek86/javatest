package pl.mpas.advancedprogramming.threading.ticktack;

public class ticktack {
    public static void main(String[] args) {

        Runnable ticktack = () -> {
            for (int i = 0; i < 30; i++) {
                 String deamonName = Thread.currentThread().getName() + "." + "thread-" + i;
                System.out.println("TIK");
                try {
                       Thread.sleep(200); // janusz masz przerwę
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("TAK");


            }

        };

        Thread janusz = new Thread(ticktack, "janusz");
        janusz.start();

        Thread andrzej = new Thread(ticktack, "andrzej");
        andrzej.start();

    }
}

