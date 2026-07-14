import java.util.Scanner;

public class CountingPrint {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        // Reverse count number
        System.out.println("Revesre Counting.....");
        for(int i = 10; i>0; i--){
            System.out.println(i);
        }
        // User dependent Table
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one number : ");
        int num = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
        input.close();
    }
}
