public class CreditPaymentService {
    public double calculate(int S, int n, double a) { // a should be divided by 100
        var i = a / 12 / 100; // monthly rate
        double K = (i * Math.pow((1+i), n)) / (Math.pow((1+i), n) - 1); //coefficient
        double monthly = K * S;
        //formula reference and explanation: https://money.inguru.ru/potrebitelskie_kredity/stat_annuitetnye_i_differentsirovannye_platezhi
        return monthly;
    }
}
