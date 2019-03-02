package pl.mpas.advancedprogramming.null_handing;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {


        Computer fullOne = new Computer(new GraphicCard(new Chipset("nVidia")));
        Computer nofullGrap = new Computer(new GraphicCard(new Chipset(null)));
        Computer nofullComputer = new Computer(new GraphicCard(null));
        Computer onComputer = new Computer(null);
        Computer maybeComputer = null;

        Optional<String> maybeMeName = Optional.ofNullable(null);
        if (maybeMeName.isPresent()){
            System.out.println(maybeMeName.get());

        }
        //jeżeli w srodku jest obiekt to wykonaj - za pomocą consumera i przejmij go i wydrukuj skę z funkcji accept
        maybeMeName.ifPresent(s-> System.out.println(s));
        maybeMeName.ifPresent(System.out::println);

    }




    public static String getVendorNameSuperNativeImpl(Computer computer) {
        return computer.getGraphicCard().getChipset().getVendorName();
    }

    public static String getVendorNameSaveImpl(Computer computer) {
        String result = "unknown";

        if (null != computer) {
            GraphicCard maybCard = computer.getGraphicCard();
            if (null != maybCard) {
                Chipset mabyChipset = maybCard.getChipset();
                if (null != mabyChipset) {
                    String manyVendorName = mabyChipset.getVendorName();
                    if (null != manyVendorName) {
                        result = manyVendorName;
                    }

                }

            }
        }
        return result;
    }

    public static Optional<String> getVedorNameJava8Way(Computer computer) {
        Optional.ofNullable(computer)
                .map(computer1 -> computer1.getGraphicCard())
                .map(graphicCard -> graphicCard.getChipset())
                .map(chipset -> chipset.getVendorName());

        return Optional.empty();
    }


    public static Optional<String> getVedorNameJava8Way2(Computer computer) {
        Optional.ofNullable(computer)
                .map(computer1 -> computer1.getGraphicCard())
                .map(graphicCard -> graphicCard.getChipset())
                .map(chipset -> chipset.getVendorName())
                .orElseGet(() -> "unknow");

        return Optional.empty();

    }

    public static Optional<String> getVedorNameJava8Way3(Computer computer) {
        Optional.ofNullable(computer)
                .map(Computer::getGraphicCard)
                .map(GraphicCard::getChipset)
                .map(Chipset::getVendorName);


        return Optional.empty();

    }


    }


