package flower;

import java.util.LinkedList;

import flower.Delivery.Delivery;
import flower.Payment.Payment;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void SetPaymentStrategy(Payment paymentStrategy){
        this.payment = paymentStrategy;
    }

    public void SetDeliveryStrategy(Delivery deliveryStrategy){
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice(){
        double price = 0;
        for(Item item: items){
            price += item.getPrice();
        }
        return price;
    }

    public void processOrder(){
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }
    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
