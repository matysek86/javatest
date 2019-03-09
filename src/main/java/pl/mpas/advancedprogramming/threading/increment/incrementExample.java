package pl.mpas.advancedprogramming.threading.increment;

class Job implements Runnable {
    private int ToIncrement = 0;
    private static int staticIncrement = 1;

   static public void ststicInrcementation(){
       synchronized(Job.class){
          staticIncrement++;
       }
   }


    @Override
    public String toString() {
        return "ToIncrement= " + ToIncrement;
    }

//synchronizacja w dwóh wariwntach
    @Override
    //public synchronized void run()  {
    public void run() {

            for (int i = 0; i < 100000; i++) {
                System.out.println("Inrcemenrt: " + Thread.currentThread().getName());
                synchronized (this) {
                ToIncrement++;

            }
            //synchronizacja tylko w krytycznym momencie
        }
    }
}

public class incrementExample {

    public static void main(String[] args) {
        Job job = new Job();

        Thread worker1 = new Thread(job, "janusz");
        Thread worker2 = new Thread(job, "wojtek");
        worker1.start();
        worker2.start();
        try {
         // join czeka na wykonanie wątku
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current job value: " + job);

    }
}
