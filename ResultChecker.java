import java.util.Scanner;

public class ResultChecker {
    public static void main(String args[]){
        System.out.println("======================================");
        System.out.println("           Check Your Result          ");
        System.out.println("======================================");
        Scanner input = new Scanner(System.in);
        // String choose1 = input.next();
    //if (choose1.equals("Y") || choose1.equals("y")){
        while(true){
            System.out.println("Do you want to check your result(Y/N) : ");
            String choose = input.next();
            if (choose.equals("Y") || choose.equals("y")) {
                System.out.println("If You Want To Check Your Result So Choose Any One Number \n 1. Check PASS or FAIL. \n 2. Check Your Percentage. \n 3. Check Your Grade. \n 4. Check Your Division. \n 5. Calculate Your Average Marks. \n 6. Exit");
                int n1 = input.nextInt();

                //Condition 1

                if(n1 == 1){
                    System.out.println("Selected : Check PASS or FAIL.");
                    System.out.println("How Many Subjects You Have??");
                    int NumberOfSubject = input.nextInt();
                    String SubjectName[] = new String[NumberOfSubject];
                    for(int i = 0; i<NumberOfSubject; i++){
                        System.out.println("Enter Your " + (i + 1) + " Subject Name : ");
                        SubjectName[i] = input.next();
                    }

                    // For Marks
                    int SubjectMarks[] = new int[NumberOfSubject];
                    for(int i = 0; i<NumberOfSubject; i++){
                        System.out.println("Enter Your Obtain Marks In " + SubjectName[i] + " : ");
                        SubjectMarks[i] = input.nextInt();
                    }
                    for(int i = 0; i<NumberOfSubject; i++){
                        if (SubjectMarks[i] < 33) {
                            System.out.println("You Obtain " + SubjectMarks[i] + " In " + SubjectName[i]);
                            System.out.println("You Are FAIL In This Subject");
                        }
                    }
                    int TotalObtainMarks = 0;
                    for(int i = 0; i<NumberOfSubject; i++){
                        TotalObtainMarks = TotalObtainMarks + SubjectMarks[i];
                    }
                    int TotalMaxMarks;
                    TotalMaxMarks = NumberOfSubject*100;
                    int percentage = (TotalObtainMarks*100) / TotalMaxMarks;
                    if (percentage <= 30 && percentage >= 0) {
                        System.out.println("You Are FAIL!!!");
                    }
                    else if (percentage > 30 && percentage <= 100) {
                        System.out.println("You Are PASS...");
                    }
                }
                else if (n1 == 2) {
                    System.out.println("Selected : Check Your Percentage.");
                    System.out.println("Enter Your Total Marks : ");
                    int TotalMarks = input.nextInt();
                    System.out.println("Enter Your Obtain Marks : "); 
                    int ObtainMarks = input.nextInt();

                    int percentage = (ObtainMarks*100)/TotalMarks;

                    System.out.println("You Got " + percentage +"%");
                }
                else if (n1 == 3) {
                    System.out.println("Selected : Check Your Grade.");
                    System.out.println("Enter Your Percentage : ");
                    int per = input.nextInt();

                    if (per >= 90 && per <= 100) {
                        System.out.println("Your Grade : A+");
                    }
                    else if (per >= 80 && per <= 89) {
                        System.out.println("Your Grade : A");
                    }
                    else if (per >= 60 && per <=79) {
                        System.out.println("Your Grade : B");
                    }
                    else if (per >= 33 && per <= 59) {
                        System.out.println("Your Grade : C");
                    }
                    else if(per >= 1 && per < 33){
                        System.out.println("Your Grade : F(Fail)");
                    }
                }
                else if (n1 == 4) {
                    System.out.println("Selected : Check Your Division.");
                    System.out.println("Enter Your Percentage : ");
                    int per = input.nextInt();

                    if (per >= 60) {
                        System.out.println("First Division");
                    }
                    else if (per >= 45 && per <= 59) {
                        System.out.println("Second Division");
                    }
                    else if (per <= 44 && per >= 33) {
                        System.out.println("Third Division");
                    }
                }
                else if (n1 == 5) {
                    System.out.println("Selected : Calculate Your Average Marks.");
                    System.out.println("How Many Subjects You Have??");
                    int NumberOfSubject = input.nextInt();
                    String SubjectName[] = new String[NumberOfSubject];
                    for(int i = 0; i<NumberOfSubject; i++){
                        System.out.println("Enter Your " + (i + 1) + " Subject Name : ");
                        SubjectName[i] = input.next();
                    }

                    // For Marks
                    int SubjectMarks[] = new int[NumberOfSubject];
                    for(int i = 0; i<NumberOfSubject; i++){
                        System.out.println("Enter Your Obtain Marks In " + SubjectName[i] + " : ");
                        SubjectMarks[i] = input.nextInt();
                    }
                    int TotalobtainMarks = 0;
                    for(int i = 0; i<NumberOfSubject; i++){
                        TotalobtainMarks = TotalobtainMarks + SubjectMarks[i];
                    }
                    int AverageMarks = TotalobtainMarks / NumberOfSubject;
                    System.out.println("Your Average Mark is " + AverageMarks +"%");
                }
                else if (n1 == 6) {
                    System.out.println("Exitted Successfully....");
                    break;
                }
            }
            else if (choose.equals("N") || choose.equals("n")) {
                System.out.println("Exitted Successfully....");
                break;
            }
        }
    //}
    // else if (choose1.equals("N") || choose1.equals("n")) {
    //             System.out.println("Exitted Successfully....");
    //         }
    
    input.close();
    }
}