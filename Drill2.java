import java.util.Scanner;

class Student{
    private String rollNumber;
    private String studentName;
    private int marks;

    Student(String rollNumber, String studentName, int marks){
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.setMarks(marks);
    }

    public void setMarks(int marks){
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("❌ Invalid Mark!, Please Try Again");
        }
    }
    public int getmark(){
        return this.marks;
    }
    public String getName(){
        return this.studentName;
    }
    public String getRollNumber(){
        return this.rollNumber;
    }

    public String getGrade(){
        if (this.marks >= 90) {
            return "GRADE A";
        } else if (this.marks >= 75) {
            return "GRADE B";
        } else if (this.marks >= 40) {
            return "GRADE PASS";
        } else if (this.marks < 40) {
            return "GRADE FAIL";
        } else {
            return "??????????";
        }
    }
}


public class Drill2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("                   Student Report Card 🎯             ");
        System.out.println("======================================================");
        Student s1;
        String RollNumber;
        String StudentName;
        int marks;
        while (true) {
            System.out.print("Enter your Roll Number (10 digit): ");
            RollNumber = input.next();
            input.nextLine();
            System.out.print("Enter Your Name : ");
            StudentName = input.nextLine();

            System.out.print("Enter Your Marks : ");
            marks = input.nextInt();

            if ((RollNumber.length() == 10) && (marks >=0 && marks <= 100)) {
                break;
            }
        }
        s1 = new Student(RollNumber,  StudentName, marks);
        // Report Card
        System.out.println("=========================================================");
        System.out.println("                       Report Card 🧾                    ");
        System.out.println("=========================================================");
        System.out.printf("%-25s : %-35s\n", "Student Name", s1.getName());
        System.out.printf("%-25s : %-35s\n", "Student Roll Number", s1.getRollNumber());
        System.out.printf("%-25s : %-35s\n", "Mark", s1.getmark());
        System.out.printf("%-25s : %-35s\n", "Grade", s1.getGrade());
        System.out.println("=========================================================");
        input.close();
    }
}
