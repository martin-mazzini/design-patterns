package strategy.mine;



public class PaypalStrategy implements PaymentStrategy {
    private static final int PAYPAL_FEE = 10;
    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    public void pay(int amount) {
        System.out.println("Paying with Paypal " + emailId + ", " + password);
        System.out.println("Validating Paypal account..");
        System.out.println("Processing payment. Calling Payapl API...");
        double finalAmount = amount + PAYPAL_FEE;
        System.out.println(finalAmount + " paid with Paypal");
    }
}
