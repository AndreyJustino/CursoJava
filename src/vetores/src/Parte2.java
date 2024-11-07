import entites.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero de produtos: ");
        int number = sc.nextInt();

        Produto[] produtos = new Produto[number];

        for (int i = 0; i < produtos.length; i++) {
            sc.nextLine();

            System.out.print("Nome do produto: ");
            String name = sc.nextLine();

            System.out.print("Preço do produto: ");
            double price = sc.nextDouble();

            produtos[i] = new Produto(price, name);
        }

        double total = 0;

        for (int i = 0; i < produtos.length; i++) {
            total += produtos[i].getPrice();
        }

        double avarage = total / produtos.length;

        System.out.printf("A média dos preços é %.2f%n", avarage);

        sc.close();
    }
}
