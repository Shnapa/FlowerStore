package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Generated;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket() {
    }

    public void add(FlowerPack flowerPack) {
        if (flowerPack != null) {
            this.flowerPacks.add(flowerPack);
        }
    }

    public double getPrice() {
      double totalPrice = 0;
      for (FlowerPack pack : flowerPacks) {
          double flowerPrice = pack.getFlower().getPrice();
          int quantity = pack.getQuantity();
          totalPrice += flowerPrice * quantity;
          System.out.println("Pack price: " + (flowerPrice * quantity) + ", Total so far: " + totalPrice);
      }
      return totalPrice;
  }
  
    public void removeFlowerPack(int index) {
        if (index >= 0 && index < this.flowerPacks.size()) {
            this.flowerPacks.remove(index);
        }
    }

    public List<FlowerPack> getFlowerPacks() {
        return new ArrayList<>(this.flowerPacks);
    }

    @Override
    public String toString() {
        return "FlowerBucket{flowerPacks=" + flowerPacks + "}";
    }

    @Generated
    public void setFlowerPacks(List<FlowerPack> flowerPacks) {
        this.flowerPacks = flowerPacks;
    }
}
