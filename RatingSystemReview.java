import java.util.Scanner;

public class RatingSystemReview {
    
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                     Rating System Review                    ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        System.out.println("Please Rate Our Services Between(1 to 5) : ");
        int rate = input.nextInt();

        switch (rate) {
            case 1:
                System.out.println("Maza nahi aaya, dobara banao. ⭐");
                break;
            case 2:
                System.out.println("Maza nahi aaya, dobara banao. ⭐⭐");
                break;
            case 3:
                System.out.println("Average vibe. ⭐⭐⭐");
                break;
            case 4:
                System.out.println("Mast hai, thoda aur sudhaar ho sakta hai. ⭐⭐⭐⭐");
                break;
            case 5:
                System.out.println("Ekdam kadak video hai bhai! ⭐⭐⭐⭐⭐");
                break;
            default:
                System.out.println("Galat Rating hai re baba !!");
                break;
        }

        input.close();
    }
}
