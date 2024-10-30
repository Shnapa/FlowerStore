package flower.Payment;

import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy implements Payment{
    private String description;

    public CreditCardPaymentStrategy(){
        description = "Paid with credit card";
    }

    @Override
    public void pay(double price){
        
    }
}