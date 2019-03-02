package pl.mpas.advancedprogramming.null_handing_optional;

import pl.mpas.advancedprogramming.null_handing.Chipset;
import pl.mpas.advancedprogramming.null_handing.GraphicCard;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {


        Computer fullOne = new Computer(new GraphicCard(new Chipset("nVidia")));
        Computer nofullGrap = new Computer(new GraphicCard(new Chipset(null)));
        Computer nofullComputer = new Computer(new GraphicCard(null));
        Computer onComputer = new Computer(null);
        Computer maybeComputer = null;




    }
// DO POPRAWKI !!!!
 //   public static String getVendorNameJava8Way(Computer computer){

   //  return Optional.ofNullable(computer)
    //            .flatMap(computer1 -> computer1.getGraphicCard())
    //            .flatMap(graphicCard -> graphicCard.getChipset())
     //           .map(chipset->chipset.getVendorName())
    //            .orElseGet(() -> "brak");


   //         }

}






