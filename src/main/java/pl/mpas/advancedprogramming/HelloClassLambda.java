package pl.mpas.advancedprogramming;

import static java.lang.System.*;

@FunctionalInterface
interface SayHallo {
    void sayHallo();
default void goodbye(){
    out.println("Goodbye");
}
}

@FunctionalInterface
interface Test {
    void testmetod (int a, String nazwa);
    default void goHome(){out.println("Goodbye HOME");};
    default void goBack(int a, String s){out.println("Goodbye BACK");};


}
public class HelloClassLambda {



    public static void main(String[] args) {
        SayHallo hello = () -> {
        };
        hello.sayHallo();
        //1 raz aa -- ss
        useTest((a, b) -> out.println("" + (a + a) + "--" + b + b), 5, "Mariusz");
        //wpisać aaa --- sss
        useTest((a, b) -> out.println("" + a + a + a + "--" + b + b + b), 6, "Zenek");

        usseTet(new Test() {
            @Override
            public void testmetod(int a, String nazwa) {

            }
        });
    }

    private static void usseTet(Test test) {
    }


    static void useTest(Test test, int a, String s){
        test.testmetod(a, s);
        out.println();
    }


}
