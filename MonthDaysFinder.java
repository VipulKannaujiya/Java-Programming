import java.util.Scanner;

public class MonthDaysFinder {
    
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                       Month Days Finder                     ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        System.out.println("Select a month to know Days : \n1. January \n2. Febuary \n3. Martch \n4. April \n5. May \n6.June \n7. July \n8. August \n9. September \n10. Octuber \n11. November \n12. December");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("31 Days.....");
                break;
            case 2:
                System.out.println("28/29 Days.....");
                break;
            case 3:
                System.out.println("31 Days.....");
                break;
            case 4:
                System.out.println("30 Days.....");
                break;
            case 5:
                System.out.println("31 Days.....");
                break;
            case 6:
                System.out.println("30 Days.....");
                break;
            case 7:
                System.out.println("31 Days.....");
                break;
            case 8:
                System.out.println("31 Days.....");
                break;
            case 9:
                System.out.println("30 Days.....");
                break;
            case 10:
                System.out.println("31 Days.....");
                break;
            case 11:
                System.out.println("30 Days.....");
                break;
            case 12:
                System.out.println("31 Days.....");
                break;
            default:
                System.out.println("Abe saale sahi month daal!");
                break;
        }
        input.close();
    }
}
