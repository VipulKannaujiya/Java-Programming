import java.util.Scanner;

public class ATMCashWithdrawalLimitValidator {
        public static void main(String args[]){
            System.out.println("=============================================================");
            System.out.println("             ATM Cash Withdrawal Limit Validator             ");
            System.out.println("=============================================================");

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("Do You Want To Withdraw Your Cash(Y/N) : ");
                String choose = input.next();
                int amount;
                String AcType;
                if (choose.equalsIgnoreCase("Y")) {
                    System.out.println("Enter Your Amount : ");
                    amount = input.nextInt();
                    System.out.println("What Account Type (Saving or Current) : ");
                    AcType = input.next();

                    if (amount <= 100 || amount >= 20000) {
                        System.out.println("Invalid Amount Error!!");
                        break;
                    }
                    else if (amount % 100 != 0) {
                        System.out.println("Multiples of 100 Error!!");
                        //     break;
                    }
                    else if (AcType.equalsIgnoreCase("Saving") && amount <= 10000) {
                        System.out.println("Cash Dispensed Successfully!!");
                        break;
                    }
                    else if (AcType.equalsIgnoreCase("Current") && amount <= 20000) {
                        System.out.println("Cash Dispensed Successfully!!");
                        break;
                    }
                    else{
                        System.out.println("Limit Error!!, \n 1. For Saving - MAX 10K. \n 2. For Current - MAX 20K.");
                        //break;
                    }
                }
                else if (choose.equalsIgnoreCase("N")){
                    System.out.println("Exitted Successfully.....");
                    System.out.println("Thank you for visited our ATM.");
                    break;
                }
                else{
                    System.out.println("You Entered Wrong Charater, Please Enter (Y/N) Below.");
                }
            }
            input.close();
        }
}