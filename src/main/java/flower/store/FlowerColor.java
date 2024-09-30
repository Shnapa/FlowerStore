package flower.store;
//
public enum FlowerColor {
    RED("#FF0000"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00");

    private final String stringRepresentation;

    FlowerColor(String stringRepresentatio) {
        this.stringRepresentation = stringRepresentatio;
    }

    @Override
    public String toString() {
        return this.stringRepresentation;
    }
}
