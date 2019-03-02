package pl.mpas.advancedprogramming.abstract_class;

public class AnimalExaple {

    public static void main(String[] args) {
        //utwórz klasę ZooClass
        //uzyj handleAnima;
        //wyślij 3 zwierzęta w postaci klasy anonimoej
        ZooClass myZoo = new ZooClass();
        myZoo.handelAnimal(new Animal("Azor") {

            @Override
            public void eat() {
                System.out.println("Eating.....");
            }

            @Override
            public void play() {
                System.out.println("Playing.....");
            }
        });

        Animal maybeCat;
        //tylko dla jednego animala rozszeżamy funkcjonalnośc
        new Animal("cat") {
            @Override
            public void eat() {

            }

            @Override
            public void play() {

            }

            public void miauu(){

            }

        }.miauu();
         //   ((Animal) maybeCat).miauu();
    }

}
