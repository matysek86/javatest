package pl.mpas.advancedprogramming.threading.first;

public class FirstThreadExample {

    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Worker:  " +   Thread.currentThread().getName());
            System.out.println("Run Forsts RUN !!");
        };

            job.run();
          //albo tworzymy wątek od interfaceu job z mazwą w konstuktorze
            Thread worker = new Thread(job, "Worker1");
            worker.setName("Worker1");
            worker.run();
            worker.start();
           // worker.start();
    }
}
