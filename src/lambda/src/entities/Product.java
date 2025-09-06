package entities;

public class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                '}';
    }

    //-------------------------------------- predicate
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate(){ //esse vai agir dentro do proprio produto
        return price >= 100.0;
    }
    //----------------------------------------

    //-------------------------------------- consumer
    public static void staticProductConsumer(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    public void noStaticProductConsumer(){
        this.setPrice(this.getPrice() * 1.1);
    }

    //----------------------------------------

    //-------------------------------------- function
    public static String staticProductFunction(Product p){
        return p.getName().toUpperCase();
    }

    public String noStaticProductFunction(){
        return this.getName().toUpperCase();
    }

    //----------------------------------------


}
