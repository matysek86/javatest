package pl.mpas.advancedprogramming.threading.second;

public class SecondThreadExample {
    public static void main(String[] args) {
        System.out.println("main() -bginning/.....");
        Runnable job = () -> {
            for (int i = 0; i<10; i++){
                System.out.println("Runa by: "+ Thread.currentThread().getName() +  ", iteration: " + (i+1));
            }
        };
        Thread worker1 = new Thread(job, "Stefan");
        worker1.setDaemon(true);
        Thread worked2 = new Thread(job,"Franek");
        worked2.setDaemon(true);
        worker1.run();
        worker1.start();
        //worked2.run();
        worked2.start();


        System.out.println("mian() - end");
    }
}
