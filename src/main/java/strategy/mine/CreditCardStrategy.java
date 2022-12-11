package strategy.mine;



public class CreditCardStrategy implements PaymentStrategy {
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
        double finalAmount = 0.99 * amount;
        //do some stuff specific to creditCards
        System.out.println(finalAmount + " paid with credit/debit card");
    }
}
