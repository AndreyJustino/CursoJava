package consumer;

import entities.Product;

import java.util.function.Consumer;

public class ProductConsumer implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        //or ... 0.1 + product.getPrice()
        product.setPrice(product.getPrice() * 1.1);
    }
}
