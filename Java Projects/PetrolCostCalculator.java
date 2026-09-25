import java.util.Scanner;

public class PetrolCostCalculator {
    public static void main(String... agrs){
        System.out.println("=============================================================");
        System.out.println("                   Petrol Cost Calculator.                   ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Distance To Travel(Km) : ");
        double dis = input.nextDouble();
        System.out.println("Enter Mileage Of Your Vahicle(per litre) : ");
        double mileage = input.nextDouble();
        System.out.println("Enter Current Price Of Fuel(per litre) : ");
        double FuelPrice = input.nextDouble();

        double TotalFuelNeeded = dis / mileage;
        double TotalCost = TotalFuelNeeded * FuelPrice;

        System.out.println("Total Fuel Needed : " + TotalFuelNeeded + "(Litre)");
        System.out.println("Total Fuel Cost : " + TotalCost + "Rs.");
        input.close();
    }
}
