package pl.mpas.advancedprogramming.threading.third;

public class Example {

    public static void main(String[] args) {

        Runnable demonWriteJob = () -> {
            for (int i = 0; i<10; i++){
                System.out.println("Runa by: "+ Thread.currentThread().getName() +  ", iteration: " + (i+1));
            }
        };

        Runnable jobdemon = () -> {
            for (int i = 0; i < 3; i++) {
               String deamonName = Thread.currentThread().getName() + "." + "deamon-" + i;
                Thread workerOne = new Thread(demonWriteJob, deamonName);
                workerOne.setDaemon(true);
                workerOne.start();
                try {
                    Thread.sleep(1000); // janusz masz przerwę
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };



       Thread janusz = new Thread(jobdemon, "janusz");
       janusz.setPriority(10);
       janusz.start();
       Thread andrzej = new Thread(jobdemon,"andrzej");
       andrzej.setPriority(1);
       andrzej.start();





    }

}

