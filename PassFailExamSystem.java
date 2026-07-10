import java.util.Scanner;

public class PassFailExamSystem {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                      Check Your Result                      ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your marks : ");
        int marks = input.nextInt();
        if (marks < 0) {
            System.out.println("Enter valid marks..");
            marks = input.nextInt();
        }
        if (marks >= 33 && marks <= 100) {
            System.out.println("PARTY!🎉, TUM PASS HO GAYE.....");
        }
        else{
            System.out.println("AUR REELS DEKHO, FAIL HO GAYE NA....");
        }
        input.close();
    }
}
