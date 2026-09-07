import java.util.Scanner;

public class SmartCart {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("                  Welcome to SmartCart!🛒             ");
        System.out.println("======================================================");
        Scanner input = new Scanner(System.in);
        int[] Quantity = {};
        String[] Product_name = {};
        Double[] Product_price = {};
        System.out.println("HOW MANY PRODUCTS DO YOU WANT TO ADD? : ");
        int product_size = input.nextInt(); // 5
        input.nextLine();

        // FIXING THE SIZE OF ALL OF ARRAY
        Product_name = new String[product_size];
        Product_price = new Double[product_size];
        Quantity = new int[product_size];
        for(int i=0; i<product_size; i++){
            System.out.println("ENTER THE NAME OF PRODUCT : ");
            Product_name[i] = input.nextLine();
            System.out.println("ENTER THE PRICE OF " + Product_name[i] + " :");
            Product_price[i] = input.nextDouble();
            System.out.println("ENTER THE QUANTITY OF " + Product_name[i] + " :");
            Quantity[i] = input.nextInt();
            input.nextLine();
        }
        // TASK 1 - SUBTOTAL & GST CALCULATION.
        Double subtotal = 0.0;
        for(int i=0; i<product_size; i++)
        {
            subtotal += Product_price[i] * Quantity[i];

        }
        // GST CALCULATION
        Double Gst_Amount = subtotal * 0.18;
        // FINAL AMOUNT
        Double Final_Amount = subtotal + Gst_Amount;

        // TASK 2 - PREMIUM PRODUCTS
        int PremiumItemCount = 0;
        String[] Premium_product = {};
        Premium_product = new String[product_size];
        for(int i=0; i<product_size; i++){
            if (Product_price[i] >= 1000) {
                PremiumItemCount += 1;
                Premium_product[i] = Product_name[i];
            }
        }

        // TASK 3 -BLUEPRINT: FLASH SALE (CHEAPEST ITEM FREE!)
        Double MinPrice = Product_price[0];
        for(int i=0; i<product_size; i++){
            if (Product_price[i] < MinPrice) {
                MinPrice = Product_price[i]; // 10 20 30 40 10
            }
            else if (Product_price[i] == MinPrice) {
                MinPrice = Product_price[i];
            }
        }
        System.out.println(MinPrice);
        Double discountSubtotal = Final_Amount - MinPrice;

        // PRINTING THE FINAL BILL
        System.out.println("===========================================================");
        System.out.println("              FINAL BILL OF PURCHASED PRODUCT🧾            ");
        System.out.println("===========================================================");
        System.out.printf("%-20s %10s %10s %15s\n", "PRODUCT NAME", "PRICE", "QUANTITY", "TOTAL");
        for(int i=0; i<product_size; i++)
        {
            System.out.printf("%-20s %10.2f %10d %15.2f\n", Product_name[i], Product_price[i], Quantity[i], Product_price[i] * Quantity[i]);
        }
        System.out.println("===========================================================");
        System.out.printf("SUBTOTAL: %20.2f\n", subtotal);
        System.out.printf("GST (18%%): %18.2f\n", Gst_Amount);
        System.out.printf("FINAL AMOUNT: %16.2f\n", Final_Amount);
        System.out.println("-----------------------------------------------------------");
        System.out.printf("PREMIUM PRODUCT QUANTITY: %18d\n", PremiumItemCount);
        for(int i=0; i<product_size; i++){
            if (Premium_product[i] != null) {
                System.out.printf("PREMIUM PRODUCT Name: %22s\n", Premium_product[i]);
            }
        }
        System.out.println("🎉 Flash Sale Discount Applied: " + "₹" + MinPrice + " Off");
        System.out.println("Discount Subtotal = " + discountSubtotal);
        System.out.println("===========================================================");
        input.close();
    }
}
