import java.util.Scanner;
public class checkNumberIsNegativeOrPositive {
    public static void main(String... agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int number = input.nextInt();

        if(number < 0){
            System.out.println("YOUR NUMBER IS NEGATIVE....");
        }
        else{
            System.out.println("YOUR NUMBER IS POSITIVE....-25");
        }

        input.close();
    }
}
