import java.util.Scanner;

class Product{
    private String name;
    private Double price;
    private int quantity;

    Product(String name, Double price, int quantity){
        this.name = name;
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    void getShowInfo(){
        System.out.println("Product Name : " + this.name);
        System.out.println("Product Price : " + this.getPrice());
        System.out.println("Product Quantity : " + this.getQuantity());
    }

    Double calculateTotal(){
        return this.price * this.quantity;
    }

    boolean isPremium(){
        if (this.price > 1000){
            return true;
        }
        return false;
    }
    //Getter for Namw : Name padhane ki khidki
    public String getName(){
        return this.name;
    }
    // Getter for Price : Price padhane ki khidki
    public Double getPrice(){
        return this.price;
    }
    //Getter for Quantity : Quantity padhane ki khidki
    public int getQuantity(){
        return this.quantity;
    }
    // Setter for Price : Naya price update karne ka gaurded gate.
    public void setPrice(Double newPrice){
        if (newPrice > 0) {
            this.price = newPrice; // positive hai to update kar diya jayega.
        } else{
            System.out.println("❌Invalid Price!, Price negative ya Zero nahi ho sakta.");
        }
    }
    // Setter for Quantity : Naya quantity update karne ka gaurded gate.
    public void setQuantity(int newquantity){
        if(newquantity > 0){
            this.quantity = newquantity;
        } else {
            System.out.println("❌Invalid Quantity!, Quantity negative ya Zero nahi ho sakta.");
        }
    }
    public String toString(){
        return "product Name : " + this.name + ", Product Price : " + this.price + ", Product Quantity : " + this.quantity;
    }
}


class Day10{
    public static void main(String[] args){
        Product p1 = new Product("Laptop", 50000.0, 3);
        System.out.println(p1);
        double total = p1.calculateTotal();
        System.out.println("Total Amount = " + total);

        Scanner input = new Scanner(System.in);

        Product[] cart = new Product[3];
        double grandTotal = 0.0;
        int premiumCount = 0;
        for(int i=0; i<cart.length; i++){
            System.out.println("Enter " + (i+1) + " Product : ");
            cart[i] = new Product(input.next(), input.nextDouble(), input.nextInt());

            //cart[i].getShowInfo();
            System.out.println(cart[i]);
            System.out.println("Total = " + cart[i].calculateTotal());
            grandTotal += cart[i].calculateTotal();
            
            if (cart[i].isPremium()) {
                System.out.println("Premium Item : " + cart[i].getName() + " (₹" + cart[i].getPrice() + ")");
                premiumCount++;
            }
        }
        System.out.println("============================================");
        System.out.println("Grand Total = " + grandTotal);
        System.out.println("Total Premium Items = " + premiumCount);

        // Setter : Sahi Price✅
        p1.setPrice(50000.0);
        
        // Setter : Galat Price❌
        // p1.setPrice(-5559499.0);

        System.out.println("============================================");
        for(int i=0; i<cart.length; i++){
            System.out.println(cart[i].getPrice());
        }
        System.out.println("============================================");

        input.close();
    }
}