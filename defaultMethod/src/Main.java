import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        sc.close();

        InterestService is = new BrazilianInterestService(2.0);
        double payment = is.paymente(amount, months);

        System.out.printf("Payment after %d months: \n", months);
        System.out.printf("%.2f", payment);

        String.valueOf()
    }
}