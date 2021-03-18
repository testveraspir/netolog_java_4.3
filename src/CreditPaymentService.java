public class CreditPaymentService {
    public long calculate(double amountCredit, double year, double percent) {
        double periodCreditInMonth = year * 12;
        double i = percent / 100 / 12;
        long monthlyPayment = (long) (amountCredit * (i + i / (Math.pow((i + 1), periodCreditInMonth) - 1)));
        return monthlyPayment;
    }
}
