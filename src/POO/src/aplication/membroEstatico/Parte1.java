package aplication.membroEstatico;

import java.util.Locale;
import java.util.Scanner;

public class Parte1 {
    public static final double PI = 3.14; // <- constante

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circu = circumference(radius);
        double volu = volume(radius);

        System.out.printf("Circumference: %.2f%n",circu);
        System.out.printf("Volume: %.2f%n",volu);
        System.out.printf("PI value: %.2f%n",PI);

        sc.close();
    }

    public static double circumference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * Math.pow(radius, 3) / 3;
    }
}