import java.util.Scanner;

public class ExamGradingTool {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("             Check Your Result Grading(PASS/FAIL)            ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A🔥");
        }
        else if (marks >= 75) {
            System.out.println("Grade B👍");
        }
        else if (marks >= 50) {
            System.out.println("Grade C🫡");
        }
        else if (marks < 50) {
            System.out.println("Fail😞");
        }
        else{
            System.out.println("Sahi se number daalo...");
        }
        input.close();
    }
}
