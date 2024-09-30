// Source code is decompiled from a .class file using FernFlower decompiler.
package flower.store;

public enum FlowerColor {
   RED("#FF0000"),
   BLUE("#0000FF"),
   YELLOW("#FFFF00");

   private final String stringRepresentation;

   private FlowerColor(String stringRepresentation) {
      this.stringRepresentation = stringRepresentation;
   }

   public String toString() {
      return this.stringRepresentation;
   }
}
