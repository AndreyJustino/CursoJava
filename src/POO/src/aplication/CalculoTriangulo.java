package aplication;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculoTriangulo {

    public static void main(String [] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("area do triangulo X = %.4f%n", areaX);
        System.out.printf("area do triangulo Y = %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior area é o triangulo X");
        }else{
            System.out.println("Maior area é o triangulo Y");
        }

        sc.close();
    }
}
