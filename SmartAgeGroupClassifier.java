import java.util.Scanner;

public class SmartAgeGroupClassifier {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                 Smart Age Group Classifier                  ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = input.nextInt();

        if (age > 0 && age <= 12) {
            System.out.println("Bachche ho abhi doodh piyo..👶");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teenager ho (Cool Vibe) 😎");
        }
        else if (age >= 20 && age <= 50) {
            System.out.println("Adult ho (Zimmedariyo ka bojh) 👔");
        }
        else if (age > 50) {
            System.out.println("Senior Citizen 🙏");
        }
        else{
            System.out.println("Enter Valid Age...");
        }
        input.close();
    }
}
