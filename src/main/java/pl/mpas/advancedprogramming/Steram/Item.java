package pl.mpas.advancedprogramming.Steram;

import java.math.BigDecimal;
import java.util.List;

public class Item {
    private String name;
    private BigDecimal price;
    private List<Ingredients> ingredients;

    public Item(String name, BigDecimal price, List<Ingredients> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
