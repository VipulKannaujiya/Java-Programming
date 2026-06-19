import java.util.Scanner;

public class TempretureConverter {

    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("         Tempreture Converter(Celsius and Fahrenheit)        ");
        System.out.println("=============================================================");


        Scanner input = new Scanner(System.in);
        System.out.println("Choose Any One Option :- \n 1. Celsius To Fahrenheit. \n 2. Fahrenheit To Celsius. \n");
        int choose = input.nextInt();

        if (choose == 1) {
            System.out.println(" You Are Selected - Celsius To Fahrenheit.");
            System.out.println(" Enter The Tempreture in Celsius : ");
            Double cel = input.nextDouble();
            // Mathematical Formula
            Double far = (cel * 1.8) + 32;
            System.out.println(" Final Output Is : ");
            System.out.printf("Celsius = %.2f\n", cel);
            System.out.printf("Fahrenheit = %.2f\n", far);
        }
        else if (choose == 2) {
            System.out.println(" You Are Selected - Fahrenheit To Celsius.");
            System.out.println(" Enter The Tempreture in Fahrenheit : ");
            Double far = input.nextDouble();
            // Mathematical Formula
            Double cel =  (far - 32) * (0.5556);
            System.out.println(" Final Output Is : ");
            System.out.printf("Fahrenheit = %.2f\n", far);
            System.out.printf("Celsius = %.2f\n", cel);
        }
        else{
            System.out.println("Invalid Input!!!");
        }
        input.close();
    }
}