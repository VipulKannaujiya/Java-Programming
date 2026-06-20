import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] agrs){
        System.out.println("=============================================================");
        System.out.println("                  Smart Mini-ATM Simulator                   ");
        System.out.println("=============================================================");

        Double AvailableBalance = 50000.00;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("DO YOU WANT VISIT YOUR ACCOUNT (YES/NO) : ");
            String Choose = input.next();

            if (Choose.equalsIgnoreCase("yes")) {
                System.out.println("Menu Option :- \n 1. Check Balance (Paise check kare). \n 2. Deposite Money (Paise Jama Kare). \n 3. Withdraw Money (Paise Nikaale). \n 4. Exit.");
                int Opchoose = input.nextInt();
                if (Opchoose == 1) {
                    System.out.println("Current Balance = " + AvailableBalance);
                }
                else if (Opchoose == 2) {
                    System.out.println("Enter Your Deposite Amount : ");
                    Double DepAmount = input.nextDouble();
                    AvailableBalance = DepAmount + AvailableBalance;
                    System.out.println("Current Balance = " + AvailableBalance);
                }
                else if (Opchoose == 3) {
                    System.out.println("Enter Your Withdraw Amount : ");
                    Double WidAmount = input.nextDouble();
                    if (WidAmount > AvailableBalance) {
                        System.out.println("Insufficient Balance/Aapke Account me itni aaukaat nahi hai....");
                    }
                    else{
                        AvailableBalance = AvailableBalance - WidAmount;
                        System.out.println(WidAmount + "Rs. Withdraw Successfully...");
                        System.out.println("Current Balance = " + AvailableBalance);
                    }
                }
                else if (Opchoose == 4) {
                    System.out.println("THANK YOU, FOR VISITING OUR SIMULATOR.....");
                    break;
                }
                else{
                    System.out.println("Invalid Input......");
                }

            }
            else{
                System.out.println("THANK YOU, FOR VISITING OUR SIMULATOR.....");
                break;
            }
        }
    input.close();
    }
}

