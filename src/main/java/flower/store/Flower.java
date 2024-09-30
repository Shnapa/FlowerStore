package flower.store;

public class Flower {
   private double sepalLength;
   private FlowerColor color;
   private double price;
   private FlowerType flowerType;

   // Constructor
   public Flower(double sepaLength, FlowerColor clr, double prc, FlowerType flwrTp) {
      this.sepalLength = sepaLength;
      this.color = clr;
      this.price = prc;
      this.flowerType = flwrTp; 
   }

   // Default constructor
   public Flower() {
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
   public void setSepalLength(double sepaLength) {
      this.sepalLength = sepaLength;
   }

   public void setColor(FlowerColor clr) {
      this.color = clr;
   }

   public void setPrice(double prc) {
      this.price = prc;
   }

   public void setFlowerType(FlowerType flwrType) {
      this.flowerType = flwrType;
   }
}
