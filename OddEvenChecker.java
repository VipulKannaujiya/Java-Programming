import java.util.Scanner;
public class OddEvenChecker {
    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("=================Check Your Number Is Even Or Odd===============");
        System.out.println("================================================================");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("EVEN NUMBER.............");
        }
        else{
            System.out.println("ODD NUMBER..............");
        }
        input.close();
    }
}
