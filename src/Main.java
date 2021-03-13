public class Main {
    public static void main(String[] args) {
        int creditsum = 1_000_000;
        int duration = 1;
        double annualrate = 9.99;
        CreditPaymentService service = new CreditPaymentService();
        int monthlypayment = (int)service.calculate(creditsum, duration * 12, annualrate); // duration * 12 bc we need n to be in months
        System.out.println(monthlypayment);

    }
}
