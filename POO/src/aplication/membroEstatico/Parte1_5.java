package aplication.membroEstatico;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Parte1_5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double circu = Calculator.circumference(radius);
        double volu = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n",circu);
        System.out.printf("Volume: %.2f%n",volu);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }


}