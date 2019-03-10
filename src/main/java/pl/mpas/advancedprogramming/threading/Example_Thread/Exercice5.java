package pl.mpas.advancedprogramming.threading.Example_Thread;

public class Exercice5 {

    public static void main(String[] args) {
      Person Wacek = new Person("Wacek","Maliowski",null);
        try {
            System.out.println("dddddd");
            synchronized (Wacek) {
            // wait dopisuje ątki do głownego watku. Daltego tzreba ynchronizować sie na danym wątku arzeby inne watki nie napisały naraz danego obieektu

                Wacek.wait(5);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("fffffff");
    }
}
