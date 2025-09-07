package function;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainFunction {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //List<String> listString = list.stream().map(new ProductFunction()).toList();

        //List<String> listString = list.stream().map(Product::staticProductFunction).toList();
        //List<String> listString = list.stream().map(Product::noStaticProductFunction).toList();

        //Function<Product, String> function = product -> product.getName().toUpperCase();
        //List<String> listString = list.stream().map(function).toList();

        List<String> listString = list.stream().map(product -> product.getName().toUpperCase()).toList();

        listString.forEach(System.out::println);
    }
}
