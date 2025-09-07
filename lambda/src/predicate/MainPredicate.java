package predicate;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class MainPredicate {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(new ProductPredicate());

        // os "::" serve para fazer referência ao metodo que esta dentro da classe antes dos "::"
        //list.removeIf(Product::staticProductPredicate);

        //list.removeIf(Product::nonStaticProductPredicate);

        //Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        //list.removeIf(pred);

        list.removeIf(p -> p.getPrice() >= 100.0);

        for (Product product : list){
            System.out.println(product);
        }
    }
}