import java.util.Scanner;

public class FunnyLoginSystem {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                     Funnt Login System                      ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);
        String username = "";
        String password = "";

        System.out.println("Enter Your Username : ");
        username = input.next();
        System.out.println("Enter Your Password : ");
        password = input.next();

        System.out.println("Your Account Is Created......");

        while (true) {
            System.out.println("Do you want to login??(YES/NO) : ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Enter Your Username : ");
                String username2 = input.next();

                if (username.equalsIgnoreCase(username2)) {
                    System.err.println("Your Username is correct.....");
                }
                else{
                    System.out.println("Kaun hai be tu??");
                    break;
                }
                System.out.println("Enter Your Password : ");
                String password2 = input.next();
                if (password.equalsIgnoreCase(password2)) {
                    System.out.println("Welcome bhai!");
                    break;
                }
                else{
                    System.out.println("Password galat hai re baba !!");
                }
            }
            else{
                System.out.println("Chaal nikal.....");
                break;
            }
        }
        input.close();
    }
}
