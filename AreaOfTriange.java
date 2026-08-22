import java.util.Scanner;
// AREA OF TRIANGLE
public class AreaOfTriange {
    public static void main(String[] args) {
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of triangle : ");
        height = input.nextDouble();
        System.out.println("height is " + height);
        double area = ((0.5)*(height*height));
        System.out.println("Area of Triangle = " + area);
        input.close();
        
    }
}