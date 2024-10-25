package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return this.quantity * price;
    }

    public void addProducts(int quant){
        this.quantity += quant;
    }

    public void removeProducts(int quant){
        if(quant > 0){
            this.quantity -= quant;
        }else{
            System.out.println("Sem este produto no estoque");
        }

    }

    public String toString(){
        return "Products: " +
                name +
                " Price: " +
                String.format("%.2f",price) +
                " Quantity: " +
                quantity +
                " Value total in stock: " +
                String.format("%.2f", totalValueInStock());
    }


}
