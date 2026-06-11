import java.util.Scanner; // user se input lene ke liye java ki library ko import karna
public class Main { // java ka main syntax jaise c me #include<stdio.h> hota hai

    public static void main(String[] args){ // jaise c me int main() hota.
        int age = 20;                       // int variable declaration
        String name = "Vipul kannaujiya";   // Character variable declaration
        String job = "JAVA Developer";
        float salary = 20.5f;               // Float variable declaration for double - Double salary = 20.5;

        System.out.println("My Name is " + name); // OUTPUT ko print karne ke liye
        System.out.println("I am " + age + " Year old");
        System.out.println("I am a " + job);
        System.err.println("My Salary is " + salary + " LPA");

        Scanner num = new Scanner(System.in); // input lene ke liye
        System.out.println("Enter First Number:- ");
        int n1 = num.nextInt(); // input ko ak variable me assign karne ke liye
        System.out.println("Enter Second Number:- ");
        int n2 = num.nextInt(); // dusre variable me input ko assign karne ke liye
        int sum = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + sum);
        
        num.close(); // Scanner class ke object ko close karna jaruri hai taki memory leak na ho jaise c me return 0; hota hai
    }
}