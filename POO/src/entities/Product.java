package entities;

public class Product {
    //atributos
    private String name;
    private double price;
    private int quantity;

    public Product(){} // constructor padrão

    public Product(String name, double price, int quantity){ // constructor personalizado
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // get e set , encapsulamentos
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    //---------------------------------------------------------------------------

    // metodos
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
