package pl.mpas.advancedprogramming.null_handing_optional;

import pl.mpas.advancedprogramming.null_handing.GraphicCard;

public class Computer {
    private  GraphicCard graphicCard;



    public Computer(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }


    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicCard=" + graphicCard +
                '}';
    }
}
