package bonusFunctionInFunction;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> predicate){
        double sum = 0.0;

        for (Product p : list){

            if (predicate.test(p)){
                sum += p.getPrice();
            }

        }

        return sum;
    }
}
