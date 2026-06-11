import java.util.Scanner;
public class LargeNumber {
    public static void main(String... args){    // isme String[] ko String... bhi likh sakte hai ya String args[] bhi likh sakte hai.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:- ");
        int n1 = input.nextInt();
        System.out.println("Enter Second Number:- ");
        int n2 = input.nextInt();

        if(n1 > n2){                                // if else condition.
            System.out.println(n1 + " is Greater than " + n2);
        }
        else if(n2 > n1){
            System.out.println(n2 + " is Greater than " + n1);
        }
        else{
            System.out.println("Both numbers are Equal");
        }

        input.close();
    }
}
