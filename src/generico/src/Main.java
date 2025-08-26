import parte1.PrintService;
import parte2.CalculationService;
import parte2.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void parte1(){
        Scanner sc = new Scanner(System.in);

        //PrintService<String> ps = new PrintService<>(); //desse jeito, força o programador a respeitar o tipo
        PrintService<Integer> ps = new PrintService(); //ou desse jeito

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("The first is: " + ps.first());

        sc.close();
    }

    public static void parte2(){
        List<Product> list = new ArrayList<>();

        String path = "src/parte2/file.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        //parte1();
        //parte2();
    }


}