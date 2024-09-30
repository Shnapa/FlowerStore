package flower.store;
//
import lombok.Generated;

public class Flower {
   private double sepalLength;
   private FlowerColor color;
   private double price;
   private FlowerType flowerType;

   public Flower(double sepalLength, FlowerColor color, 
   double price, FlowerType flowerType) {
      this.sepalLength = sepalLength;
      this.color = color;
      this.price = price;
      this.flowerType = flowerType; 
   }


   @Generated
   public double getSepalLength() {
      return this.sepalLength;
   }

   @Generated
   public double getPrice() {
      return this.price;
   }

   @Generated
   public FlowerType getFlowerType() {
      return this.flowerType;
   }

   @Generated
   public void setSepalLength(double sepalLength) {
      this.sepalLength = sepalLength;
   }

   @Generated
   public void setColor(FlowerColor color) {
      this.color = color;
   }

   @Generated
   public void setPrice(double price) {
      this.price = price;
   }

   @Generated
   public void setFlowerType(FlowerType flowerType) {
      this.flowerType = flowerType;
   }

   public Flower() {
   }

   public String getColor() {
      return this.color.toString();
   }
}
