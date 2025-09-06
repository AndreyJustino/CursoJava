package bonusFunctionInFunction;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class FunctionInFunction {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        //double sum = ps.filteredSum(list, product -> product.getName().toUpperCase().charAt(0) == 'T');
        double sum = ps.filteredSum(list, product -> product.getPrice() < 100);

        System.out.printf("Sum = %.2f \n", sum);
    }
}
