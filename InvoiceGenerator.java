import java.util.Scanner;

public class InvoiceGenerator{

    public static void main(String... args) {
        System.out.println("=============================================================");
        System.out.println("              Automated Retail Invoice Generator             ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);
        System.out.println("HOW MANY PRODUCTS DO YOU WANT TO ADD TO CART.. : ");
        int NumberOfProduct = input.nextInt();
        input.nextLine();

        String[] ProductName = new String[NumberOfProduct]; // STRING ARRAY KO AISE DEFINE KIYA JATA HAI..........
        for(int i = 0; i < NumberOfProduct; i++){
            System.out.println("ENTER YOUR PRODUCT NAME " + (i+1) + " :" );
            ProductName[i] = input.nextLine();
        }
        System.out.println("YOUR PRODUCTS ADDED SUCCESSFULLY....");
        Double ProductPrice[] = new Double[NumberOfProduct];
        int[] ProductQuantity = new int[NumberOfProduct];
        for(int i = 0; i < NumberOfProduct; i++){
            System.out.println("ENTER THE PRICE OF " + ProductName[i]);
            ProductPrice[i] = input.nextDouble();
            System.out.println("ENTER THE QUANTITY OF " + ProductName[i]);
            ProductQuantity[i] = input.nextInt();
        }
        Double PerProductTotalPrice[] = new Double[NumberOfProduct];
        for(int i = 0; i < NumberOfProduct; i++){
            PerProductTotalPrice[i] = ProductPrice[i] * ProductQuantity[i];
        }
        //SUBTOTAL ========================================================
        Double SubTotal = 0.0;
        for(int i = 0; i < NumberOfProduct; i++){
            SubTotal = SubTotal + PerProductTotalPrice[i];
        }
        Double Total = SubTotal;
        Double GST = 0.0;
        //PRODUCT TABLE
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Item Name", "Price", "Qty", "Total");
        System.out.println("-------------------------------------------------------------");
        for(int i = 0; i < NumberOfProduct; i++) {
            System.out.printf("%-20s %-10.2f %-10d %-10.2f\n", ProductName[i], ProductPrice[i], ProductQuantity[i], PerProductTotalPrice[i]);
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("=============================================================");
        System.out.println("                     -: FINAL INVOICE :-                     ");
        System.out.println("=============================================================");
        if (SubTotal > 5000) {
            // DISCOUNT STATEMENTS----------------------------------------------------
            System.out.println("CONGRATULATION!!, YOU WON 10% FLAT DISCOUNT ON " + Total);
            SubTotal = SubTotal - ((SubTotal * 10.0) / 100.0);
            System.out.println("FINAL AMOUNT AFTER 10% DISCOUNT = " + SubTotal);
        }
        else{
            System.out.println("YOU HAVE NOT ANY DISCOUNT ON " + Total);
        }
        // GST STATEMENTS---------------------------------------------------------
            System.out.println("18% GST ON " + SubTotal);
            GST =   (SubTotal * 18.0) / 100.0;
            System.out.println("EXPECTED GST = " + GST);
            SubTotal += GST;
            System.out.println("FINAL PAYABLE AMOUNT - GST + TOTAL = " + SubTotal + "Rs.");

        input.close();
    }
}