package consumer;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainConsumer {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new ProductConsumer());

        //list.forEach(Product::staticProductConsumer);
        //list.forEach(Product::noStaticProductConsumer);

//        Consumer<Product> consumer = product -> {
//            product.setPrice(product.getPrice() * 1.1);
//        };
//
//        list.forEach(consumer);

        list.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
