public class Main {
    public static void main(String[] args) {
        int creditsum = 1_000_000;
        double annualrate = 9.99;
        CreditPaymentService service = new CreditPaymentService();
        int monthlypayment = (int)service.calculate(creditsum, 1 * 12, annualrate); // duration * 12 bc we need n to be in months
        System.out.println("monthly payment for the following parameters: 1M, 1 year, 9.99%: " + monthlypayment);
        monthlypayment = (int)service.calculate(creditsum, 2 * 12, annualrate); // duration * 12 bc we need n to be in months
        System.out.println("monthly payment for the following parameters: 1M, 2 years, 9.99%: " + monthlypayment);
        monthlypayment = (int)service.calculate(creditsum, 3 * 12, annualrate); // duration * 12 bc we need n to be in months
        System.out.println("monthly payment for the following parameters: 1M, 3 years, 9.99%: " + monthlypayment);

    }
}
