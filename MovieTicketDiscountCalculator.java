import java.util.Scanner;

public class MovieTicketDiscountCalculator {
    public static void main(String args[]){
        System.out.println("================================================");
        System.out.println("Movie Name : Vijay The Master");
        System.out.println("Ticket Price : 300Rs.");
        System.out.println("------------------------------------------------");
        System.out.println("  SPECIAL OFFER: Use Code 'VIPUL10' for 10% OFF! ");
        System.out.println("------------------------------------------------");
        System.out.println("This Offer Only For 13 To 60 Year Old Male Person");
        System.out.println("------------------------------------------------");

        int fixTicket = 300;
        Scanner input = new Scanner(System.in);

        // AGE LOOP
        int age;
        while (true) {
            System.out.print("Enter Your Age : ");
            age = input.nextInt();
            if (age > 0 && age < 120) {
                break; 
            }
            System.out.println("Invalid Age! Try again.");
        }

        // 2. GENDER KA LOOP (m aur f dono chalenge ab)
        String gender;
        while (true) {
            System.out.print("Gender (M/F) : ");
            gender = input.next();
            // .equalsIgnoreCase use karne se 'm', 'M', 'f', 'F' sab valid ho jayenge
            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
                break;
            }
            System.out.println("Invalid Gender! Please enter M or F.");
        }

        // 3. DISCOUNT LOGIC
        if(age > 60) {
            System.out.println("You Got 50% Discount!");
            int Final = fixTicket - (fixTicket * 50 /100);
            System.out.println("Final Ticket Price = " + Final);
        }
        else if(age <= 12) {
            System.out.println("You Got 30% Discount!");
            int Final = fixTicket - (fixTicket * 30 /100);
            System.out.println("Final Ticket Price = " + Final);
        }
        // .equalsIgnoreCase yahan bhi laga diya taaki small 'f' par discount chal jaye
        else if((age > 12 && age < 60) && gender.equalsIgnoreCase("F")) {
            System.out.println("You Got 10% Special Discount!");
            int Final = fixTicket - (fixTicket * 10 /100);
            System.out.println("Final Ticket Price = " + Final);
        }
        else {
            // Normal Male Block
            System.out.print("Do You Have Any Coupon Code? (Enter Code or Enter 'NO') : ");
            String coupon = input.next();

            // Yahan humne coupon ko waisa hi rakha hai kyunki coupon hamesha capital me hote hain (VIPUL10)
            // Lekin gender check karne ke liye .equalsIgnoreCase lagaya hai
            if(coupon.equals("VIPUL10") && gender.equalsIgnoreCase("M")){
                System.out.println("Coupon Applied Successfully! You Got 10% Discount!");
                int Final = fixTicket - (fixTicket * 10 /100);
                System.out.println("Final Ticket Price = " + Final);
            }
            else{
                System.out.println("No Discount/Invalid Coupon Code.");
                System.out.println("Final Ticket Price = " + fixTicket);
            }
        }
        
        input.close();
    }
}