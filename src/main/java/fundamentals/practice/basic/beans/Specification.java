package fundamentals.practice.basic.beans;

public class Specification
{
    private double price;
    private String color;
    private String model;

    public Specification(double price, String color, String model) {
        this.price = price;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
