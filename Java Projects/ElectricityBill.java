import java.util.Scanner;

public class ElectricityBill {
    
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("         Electricity Bill Calculator & Slab Estimator.       ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = input.nextLine();

        System.out.println("Enter Your Unit Consumption : ");
        Double unitConsumption = input.nextDouble();

        String meterCategory = "Domestic (Residential)";
        int fixedCharge = 110;

        Double baseamount = 0.0;
        if (unitConsumption <= 100) {
            baseamount = unitConsumption * 4.50;
        }
        else if (unitConsumption <= 300) {
            baseamount = (100 * 4.50) + (unitConsumption  - 100) * 6.50;
        }
        else if (unitConsumption > 300) {
            baseamount = (100 * 4.50) + (200 * 6.50) + (unitConsumption - 300) * 9.00;
        }

        // Slabs se baseAmount nikalne ke baad
        double electricityDuty = baseamount * 0.05; // 5% Duty Tax
        // Final Total Bill calculation
        double totalBill = baseamount + fixedCharge + electricityDuty;


        // ============================  BILL PRINTING CODE =========================================

        System.out.println("=============================================================");
        System.out.println("                    STATE ELECTRICITY BOARD                  ");
        System.out.println("                      MONTHLY UTILITY BILL                   ");
        System.out.println("=============================================================");
        System.out.printf("%-20s : %-9s\n", "Customer Name", name);
        System.out.printf("%-20s : %-9s %-9s\n", "Unit Consumed", unitConsumption, "khw");
        System.out.printf("%-20s : %-9s\n", "Meter Category", meterCategory);
        System.out.printf("---------------------------------------------------------\n");
        System.out.printf("%-20s : Rs. %-9s\n", "Energy Base Charge", baseamount);
        System.out.printf("%-20s : Rs. %-9s\n", "Fixed Meter Rent", fixedCharge);
        System.out.printf("%-20s : Rs. %-9s\n", "Electricity Duty(5%)", electricityDuty);
        System.out.printf("---------------------------------------------------------\n");
        System.out.printf("%-20s : Rs. %-9s\n", "TOTAL AMOUNT PAYABLE", totalBill);
        System.out.printf("---------------------------------------------------------\n");
        System.out.println("                    DUE DATE: WITHIN 15 DAYS                 ");
        System.out.println("                 PLEASE SAVE ENERGY, SAVE WATER              ");
        System.out.println("=============================================================");
        input.close();
    }
}
