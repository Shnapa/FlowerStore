package flower;

public class Flower {
    private int sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    // Constructor with all parameters
    public Flower(int sepalLength, FlowerColor color, double price, FlowerType flowerType) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    // Default Constructor
    public Flower() {
        this.color = null;
        this.sepalLength = 0;
        this.price = 0.0;
        this.flowerType = null;
    }

    // Constructor with different parameter order
    public Flower(FlowerColor color, int sepalLength, FlowerType flowerType, double price) {
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
        this.flowerType = flowerType;
    }

    // Copy Constructor
    public Flower(Flower flower) {
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.flowerType = flower.flowerType;
    }

    // Getters
    public double getSepalLength() {
        return this.sepalLength;
    }

    public double getPrice() {
        return this.price;
    }

    public FlowerType getFlowerType() {
        return this.flowerType;
    }

    public String getColor() {
        return this.color.toString();
    }

    // Setters
    public void setSepalLength(int sepalLength) {
        this.sepalLength = sepalLength;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}
