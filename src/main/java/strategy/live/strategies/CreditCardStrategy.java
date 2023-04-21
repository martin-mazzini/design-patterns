package strategy.live.strategies;


import strategy.mine.PaymentStrategy;

public class CreditCardStrategy implements PaymentMethod {

    private static final double CREDIT_CARD_DISCOUNT = 0.95;
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }

    public void pay(int amount) {
        System.out.println("Paying with Credit Card. Card data: " + name + ", " + cardNumber + ", " + cvv + ", " + dateOfExpiry);
        System.out.println("Validating credit card...");
        System.out.println("Processing payment. Calling some API...");
        double finalAmount = CREDIT_CARD_DISCOUNT * amount;
        System.out.println(finalAmount + " paid with credit/debit card");
    }
}
