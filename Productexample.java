package functionOverride;

class Product {
    String name;
    double price;
    int quantity;
    static int totalSold = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + "(s) sold.");
        } else {
            System.out.println("Insufficient quantity of " + name + " to sell.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

public class Productexample {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 120, 10);
        Product product2 = new Product("Banana", 90, 15);
        Product product3 = new Product("Orange", 105, 20);

        product1.sell(5); 
        product2.sell(8); 
        product3.sell(15); 

        System.out.println("Total quantity of products sold: " + Product.getTotalSold());
    }
}
