package flower.store;
//
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flwr, int qntt) {
        this.flower = flwr;
        this.quantity = qntt;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFlower(Flower flwr) {
        this.flower = flwr;
    }

    public void setQuantity(int qntt) {
        this.quantity = qntt;
    }
}