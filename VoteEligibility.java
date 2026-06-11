import java.util.Scanner;
public class VoteEligibility {
    public static void main(String... agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age:- ");
        int age = input.nextInt();

        if(age >= 18 & age < 80){
            System.out.println("You Are Eligible For Vote");
        }
        else if(age < 18 & age > 0){
            System.out.println("You Are NOt Eligible For Vote");
        }
        else if(age < 0){
            System.out.println("Please Enter A Valid Age....");
        }
        else if(age > 80){
            System.out.println("You Are Too Old, You Can't Vote");
        }

        input.close();
    }
    
}
