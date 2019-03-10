package pl.mpas.advancedprogramming.threading.ticktack;


// sleep od waita sie różni - tym, że sleep trzyma locka (nikt inny nie może skorzystać)
// a wait oddaje locka i inne wątki może z tego korzystać


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Job implements Runnable {

    private String toPrint;
    private Object syncObject;

    public Job(String toPrint, Object syncObject){
        this.toPrint= toPrint;
        this.syncObject = syncObject;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        synchronized (syncObject){
            System.out.println(toPrint);
            syncObject.notify();
            try {
                syncObject.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
}


public class tictak2 {
    public static void main(String[] args) {


        Object sync = new Object();
       Job tic = new Job("TIC", sync);
       Job tac = new Job("TAK", sync);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(tic);
        executorService.execute(tac);
    }

}

