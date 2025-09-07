package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        String name = sc.next();

        System.out.println("Digite o preço do produto");
        double price = sc.nextDouble();

        System.out.println("Digite a quantidade do produto");
        int quantity = sc.nextInt();

        Product product1 = new Product(name, price, quantity); // agora é obrigatorio passa parametro

        System.out.println(product1.toString());

        System.out.println("Deseja add mais desse produto no estoque? [S/N]");
        char answer = sc.next().toUpperCase().charAt(0);

        while (answer == 'S'){
            System.out.println("Digite a quantidade do produto");
            int quant = sc.nextInt();

            product1.addProducts(quant);

            System.out.println("Deseja add mais desse produto no estoque? [S/N]");
            answer = sc.next().toUpperCase().charAt(0);
        }

        System.out.println(product1.toString());

        System.out.println("Deseja remove quantidades desse produto no estoque? [S/N]");
        answer = sc.next().toUpperCase().charAt(0);

        while (answer == 'S'){
            System.out.println("Digite a quantidade do produto a remover:");
            int quant = sc.nextInt();

            product1.removeProducts(quant);

            System.out.println("Deseja remove mais desse produto no estoque? [S/N]");
            answer = sc.next().toUpperCase().charAt(0);
        }

        System.out.println(product1.toString());

        sc.close();
    }
}
