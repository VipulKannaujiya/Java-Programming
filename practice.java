import java.util.Scanner;

public class practice {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = input.nextLine();
        System.out.println("Your Name is " + name);
        input.close();
    }
}
