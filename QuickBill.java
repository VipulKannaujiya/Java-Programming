import java.util.Scanner;

public class QuickBill {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                Digital Invoice Bill Generator               ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        System.out.println("ENTER THE PRODUCT NAME : ");
        String ProName = input.nextLine();

        System.out.println("ENTER THE PRICE OF PRODUCT : ");
        Double Price = input.nextDouble();

        System.out.println("ENTER THE QUANTITY OF PRODUCT : ");
        int Quantity = input.nextInt();

        Double Total = Price * Quantity;
        Double GST = Total * 0.18;
        Double FinalBill = Total + GST;

        System.out.println("\n-------------------------------------------");
        System.out.println("               RETAIL INVOICE              ");
        System.out.println("-------------------------------------------");

        System.out.printf("%-15s %-10s %-5s %-10s\n", "Item", "Price", "Qty", "Total");
        System.out.println("-------------------------------------------");
        
        // Data row
        System.out.printf("%-15s %-10.2f %-5d %-10.2f\n", ProName, Price, Quantity, Total);
        System.out.println("-------------------------------------------");
        
        // Final Summary
        System.out.printf("%-32s: Rs. %-10.2f\n", "Sub-Total Amount", Total);
        System.out.printf("%-32s: Rs. %-10.2f\n", "GST Tax (18%)",GST);
        System.out.println("-------------------------------------------");
        System.out.printf("%-32s: Rs. %-10.2f\n", "FINAL NET PAYABLE", FinalBill);
        System.out.println("-------------------------------------------");
        System.out.println("        THANK YOU! VISIT AGAIN 🙏        ");
        System.out.println("======================================");

        input.close();
    }
}
