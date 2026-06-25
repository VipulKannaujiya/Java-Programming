import java.util.Scanner;

public class HotelRoomBooking {
    
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("             Hotel Room Booking & Bill Estimator             ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME : ");
        String name = input.nextLine();
        
        // ROOM TYPE MENU
        System.out.println("=============================================================");
        System.out.printf("%-25s %20s\n", "ROOM TYPE", "RATE");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-35s : Rs. 1500 / NIGHT\n", "1. STANDARD ROOM");
        System.out.printf("%-35s : Rs. 3000 / NIGHT\n", "2. DELUXE ROOM");
        System.out.printf("%-35s : Rs. 6000 / NIGHT\n", "3. LUXURY SUITE");
        System.out.println("-------------------------------------------------------------");
        
        int roomType = 0;
        int day = 0; // Days hamesha integer me acche lagte hain
        double baseRent = 0.0;
        double tax = 0.0;
        double total = 0.0;
        String roomCategory = "";
        double ratePerNight = 0.0;

        while (true) {
            System.out.print("SELECT YOUR ROOM TYPE TO STAY COMFORTALLY (1-3) : ");
            roomType = input.nextInt();
            
            if (roomType >= 1 && roomType <= 3) {
                System.out.print("HOW MANY DAYS TO STAY IN OUR HOTEL : ");
                day = input.nextInt();
                
                // Logic Separation based on choice
                if (roomType == 1) {
                    roomCategory = "STANDARD ROOM";
                    ratePerNight = 1500.00;
                } else if (roomType == 2) {
                    roomCategory = "DELUXE ROOM";
                    ratePerNight = 3000.00;
                } else if (roomType == 3) {
                    roomCategory = "LUXURY SUITE";
                    ratePerNight = 6000.00;
                }
                
                // Calculations
                baseRent = ratePerNight * day;
                tax = baseRent * 0.12;
                total = baseRent + tax;

                // FINAL CLEAN BILL PRINTING
                System.out.println("=============================================================");
                System.out.println("                 GRAND PALACE HOTEL & RESORT                 ");
                System.out.println("                        BOOKING INVOICE                      ");
                System.out.println("=============================================================");
                System.out.printf("%-20s : %-25s\n", "Guest Name", name);
                System.out.printf("%-20s : %-25s\n", "Room Category", roomCategory);
                System.out.printf("%-20s : %-25d\n", "Stay Duration", day); // %d for integer days
                System.out.printf("%-20s : Rs. %-22.2f\n", "Rate Per Night", ratePerNight);
                System.out.println("------------------------------------------------------------");
                System.out.printf("%-20s : Rs. %-22.2f\n", "Room Base Rent", baseRent);
                System.out.printf("%-20s : Rs. %-22.2f\n", "Luxury Tax (12% GST)", tax);
                System.out.println("------------------------------------------------------------");
                System.out.printf("%-20s : Rs. %-22.2f\n", "TOTAL NET PAYABLE", total);
                System.out.println("=============================================================");
                System.out.println("                 BOOKING STATUS : CONFIRMED                  ");
                System.out.println("                  WISH YOU A PLEASANT STAY                   ");
                System.out.println("=============================================================");
                break; // Sahi print hone ke baad loop khatam
            } else {
                System.out.println("INVALID CHOICE! Please select a room type available in the list.");
            }
        }
        input.close();
    }
}