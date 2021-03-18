public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99;
        double amountCredit = 1_000_000;
        double year1 = 1;
        long monthlyPaymentFor1Year = service.calculate(amountCredit, year1, percent);
        System.out.println(monthlyPaymentFor1Year);
        double year2 = 2;
        long monthlyPaymentFor2Years = service.calculate(amountCredit, year2, percent);
        System.out.println(monthlyPaymentFor2Years);
        double year3 = 3;
        long monthlyPaymentFor3Years = service.calculate(amountCredit, year3, percent);
        System.out.println(monthlyPaymentFor3Years);
    }
}
