import java.util.Locale;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de pessoas: ");
        int number = sc.nextInt();

        double[] list = new double[number];

        for (int i = 0; i < number; i++) {
            list[i] = sc.nextDouble();
        }

        double total = 0;

        for (int i = 0; i < list.length; i++) {
             total += list[i];
        }

        System.out.printf("Altura média: %.2f%n", total / list.length);

        sc.close();
    }
}