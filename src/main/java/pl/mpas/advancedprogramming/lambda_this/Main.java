package pl.mpas.advancedprogramming.lambda_this;

public class Main {

    public void move(){
        System.out.println("instide move");
    }

    private String name = "ffgggffg";

    public Moveable makeOne(){
      return new Moveable() {
          @Override
          public void move() {
              String name = "interneal";
          }
      };
    }

}
