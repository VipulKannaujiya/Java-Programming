import java.util.Scanner;

public class SmartTollPlaza {

    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("        Smart Toll Plaza Management & Billing System.        ");
        System.out.println("=============================================================\n");
        
        System.out.println("            WELCOME TO NATIONAL HIGHWAY AUTHORITY            \n");
        System.out.println("=============================================================");
        System.out.println("                   Menu Driven Tax Rates                     ");
        System.out.println("=============================================================");
        System.out.printf("%10s %40s", "Vechicle", "Toll Tax\n");
        System.out.println("-------------------------------------------------------------\n");
        System.out.printf("%-40s : %-40s\n", "Bike", "50Rs.");
        System.out.printf("%-40s : %-40s\n", "Car/Jeep", "100Rs.");
        System.out.printf("%-40s : %-40s\n", "Truck/Bus", "250Rs.");
        System.out.println("-------------------------------------------------------------\n");
        
        // TOLL TAX PRICE
        int TollTaxAmount = 0;

        Scanner input = new Scanner(System.in);
        String VehicleNumber = "";
        while (true) {
            System.out.println("ENTER THE VEHICLE NUMBER : ");
            VehicleNumber = input.next();
            if (VehicleNumber.length() >= 5 && VehicleNumber.length() <= 10) {
                System.out.println("-------------------------------------------------------------\n");
                System.out.println("VEHICLE NUMBER IS VERIFIED SUCCESSFULLY.....");
                System.out.println("-------------------------------------------------------------\n");
                break;
            }
            else{
                System.out.println("-------------------------------------------------------------\n");
                System.out.println("VEHICLE NUMBER IS INVALID, TRY AGAIN!!");
                System.out.println("VEHICLE NUMBER MUST BETWEEN 5 TO 10 DIGIT......");
                System.out.println("-------------------------------------------------------------\n");
            }
        }

        //CALCULATION LOGICS
        
        String VehicleType = "";
        int payment = 0;
        int refund = 0;
        while (true) {
            System.out.printf("ENTER YOUR VEHICLE TYPE : \n --BIKE. \n --CAR/JEEP. \n --TRUCK/BUS.\n");
            VehicleType = input.next();
            // FOR BIKE
            if (VehicleType.equalsIgnoreCase("bike")) {
                TollTaxAmount = 50;
                System.out.println("PAY 50Rs. FOR BIKE : ");
                payment = input.nextInt();
                //PAYMENT CHECKING
                if (payment == 50) {
                    System.out.println("PAYMENT - DONE..");
                    break;
                }
                else if (payment > 50) {
                    refund = payment - 50;
                    //System.out.println(refund + "Rs. REFUNDED SUCCESSFULLY.....");
                    break;
                }
                else if (payment < 50) {
                    System.err.println("PAYMENT FAILED - INSUFFICIENT AMOUNT, PAY AGAIN ");
                }
            }
            // FOR CAR
            else if (VehicleType.equalsIgnoreCase("Car")) {
                TollTaxAmount = 100;
                System.out.println("PAY 100Rs. FOR CAR : ");
                payment = input.nextInt();
                //PAYMENT CHECKING
                if (payment == 100) {
                    System.out.println("PAYMENT - DONE..");
                    break;
                }
                else if (payment > 100) {
                    refund = payment - 100;
                    //System.out.println(refund + "Rs. REFUNDED SUCCESSFULLY.....");
                    break;
                }
                else if (payment < 100) {
                    System.err.println("PAYMENT FAILED - INSUFFICIENT AMOUNT, PAY AGAIN ");
                }
            }
            //FOR JEEP
            else if (VehicleType.equalsIgnoreCase("jeep")) {
                TollTaxAmount = 100;
                System.out.println("PAY 100Rs. FOR JEEP : ");
                payment = input.nextInt();
                //PAYMENT CHECKING
                if (payment == 100) {
                    System.out.println("PAYMENT - DONE..");
                    break;
                }
                else if (payment > 100) {
                    refund = payment - 100;
                    //System.out.println(refund + "Rs. REFUNDED SUCCESSFULLY.....");
                    break;
                }
                else if (payment < 100) {
                    System.err.println("PAYMENT FAILED - INSUFFICIENT AMOUNT, PAY AGAIN ");
                }
            }
            // FOR TRUCK
            else if (VehicleType.equalsIgnoreCase("truck")) {
                TollTaxAmount = 250;
                System.out.println("PAY 250Rs. FOR TRUCK : ");
                payment = input.nextInt();
                //PAYMENT CHECKING
                if (payment == 250) {
                    System.out.println("PAYMENT - DONE..");
                    break;
                }
                else if (payment > 250) {
                    refund = payment - 250;
                    //System.out.println(refund + "Rs. REFUNDED SUCCESSFULLY.....");
                    break;
                }
                else if (payment < 250) {
                    System.err.println("PAYMENT FAILED - INSUFFICIENT AMOUNT, PAY AGAIN ");
                }
            }
            // FOR BUS
            else if (VehicleType.equalsIgnoreCase("bus")) {
                TollTaxAmount = 250;
                System.out.println("PAY 250Rs. FOR BUS : ");
                payment = input.nextInt();
                //PAYMENT CHECKING
                if (payment == 250) {
                    System.out.println("PAYMENT - DONE..");
                    break;
                }
                else if (payment > 250) {
                    refund = payment - 250;
                    //System.out.println(refund + "Rs. REFUNDED SUCCESSFULLY.....");
                    break;
                }
                else if (payment < 250) {
                    System.err.println("PAYMENT FAILED - INSUFFICIENT AMOUNT, PAY AGAIN ");
                }
            }
            else{
                System.out.println("PLEASE ENTER VALID VEHICLE TYPE.....");
            }
        }

        // --------------------------------------- RECIEPT ---------------------------------------------

        System.out.println("=============================================================");
        System.out.println("                  NATIONAL HIGHWAY AUTHORITY                 ");
        System.out.println("                       TOLL CASH RECEIPT                     ");
        System.out.println("=============================================================");
        System.out.printf("%-35s : %-20s\n", "Plaza Name", "NHAI-DELHI EXPRESSWAY");
        System.out.printf("%-35s : %-20s\n", "Vehicle Number", VehicleNumber);
        System.out.printf("%-35s : %-20s\n", "Vehicle Type", VehicleType);
        System.out.println("-------------------------------------------------------------\n");
        System.out.printf("%-35s : Rs. %-20s\n", "TOLL TAX AMOUNT", TollTaxAmount);
        System.out.printf("%-35s : Rs. %-20s\n", "CASH RECEIVED", payment);
        System.out.printf("%-35s : Rs. %-20s\n", "CHANGE RETURNED", refund);
        System.out.println("-------------------------------------------------------------");
        System.out.println("                    STATUS: PAID & ALLOWED                   ");
        System.out.println("                      HAVE A SAFE JOURNEY                    ");
        System.out.println("=============================================================");
        input.close();
    }
}