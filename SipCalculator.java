import java.util.Scanner;

public class SipCalculator {
    
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("        Simple SIP Calculator & Investment Estimator.        ");
        System.out.println("=============================================================");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String InvesterName = input.nextLine();

        System.out.println("Enter Your Monthly Investment Amount : ");
        Double MonthlyInvestment = input.nextDouble();

        System.out.println("Enter Expected Return Rate(In %) : ");
        Double expectedReturnRate = input.nextDouble();

        System.out.println("Enter Your Investment Years : ");
        int Years = input.nextInt();
        
        // ==================================== LOGIC BUILDING =================================
        Double futureValue = 0.0;
        int i = 1;
        while (i <= Years) {
            // Pehle is saal ka total jama paisa jodo
            futureValue = futureValue + (MonthlyInvestment * 12);

            // Fir us pure amount par saal ka interest jodo
            futureValue = futureValue + (futureValue * (expectedReturnRate / 100));

            i++;
        }
        
        Double TotalInvested = MonthlyInvestment * 12 * Years;
        Double TotalReturn = futureValue - TotalInvested;

        System.out.println("\n======================================================");
        System.out.println("               VIPUL'S WEALTH MANAGEMENT                ");
        System.out.println("               💸INVESTMENT ESTIMATOR💸              ");
        System.out.println("========================================================");
        
        // %-22s ka matlab hai text left mein rahega aur 22 spaces ka gap banayega
        System.out.printf("%-22s : %s\n", "Investor Name", InvesterName.toUpperCase());
        System.out.printf("%-22s : Rs. %.2f\n", "Monthly SIP Amount", MonthlyInvestment);
        System.out.printf("%-22s : %.2f%%\n", "Expected Return Rate", expectedReturnRate);
        System.out.printf("%-22s : %d Years\n", "Investment Duration", Years);
        System.out.println("------------------------------------------------------");
        System.out.printf("%-22s : Rs. %.2f\n", "Total Amount Invested", TotalInvested);
        System.out.printf("%-22s : Rs. %.2f\n", "Estimated Returns", TotalReturn);
        System.out.println("------------------------------------------------------");
        System.out.printf("%-22s : Rs. %.2f\n", "TOTAL FUTURE VALUE", futureValue);
        System.out.println("------------------------------------------------------");
        System.out.println("         🟢 WEALTH STATUS: ON TRACK TO WEALTH!         ");
        System.out.println("             HAPPY INVESTING & SAVING! 🙏              ");
        System.out.println("======================================================");

        input.close();
    }
}
