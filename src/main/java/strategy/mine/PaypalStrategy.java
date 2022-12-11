package strategy.mine;



public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    public void pay(int amount) {
        double finalAmount = 0.95 * amount;
        //do some stuff specific to paypal
        System.out.println(amount + " paid using Paypal.");
    }
}
