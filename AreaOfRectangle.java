import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int length, width, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle :");
        length = input.nextInt();
        System.out.println("Enter the width of rectangle :");
        width = input.nextInt();
        area = length * width;
        System.out.println("AREA OF RECTANGLE = " + area);
        input.close();
    }
}
