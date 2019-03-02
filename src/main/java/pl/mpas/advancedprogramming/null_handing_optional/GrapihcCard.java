package pl.mpas.advancedprogramming.null_handing_optional;

import pl.mpas.advancedprogramming.null_handing.GraphicCard;

import java.util.Optional;

public class GrapihcCard {

    private Chipset chipset;

    public GrapihcCard(GraphicCard graphicCard) {this.chipset = chipset ;
    }

    public Optional<Chipset> getGraphicCard() {
        return Optional.ofNullable(chipset);
    }


    @Override
    public String toString() {
        return "GrapihcCard{" +
                "chipset=" + chipset +
                '}';
    }
}
