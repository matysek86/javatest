package pl.mpas.advancedprogramming.null_handing;

public class GraphicCard {

    private Chipset chipset;

    public GraphicCard(Chipset chipset) {
        this.chipset = chipset;
    }

    public Chipset getChipset() {
         return chipset;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "chipset=" + chipset +
                '}';
    }
}
