import java.util.Scanner;
class Account{
    private String accountHolderName;
    private String accountNumber;
    private Double balance;

    // Constructor
    Account(String accountHolderName, String accountNumber, Double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.setBalance(balance);
    }

    // Setter For Balance
    public void setBalance(Double newBalance){
        if (newBalance >= 500) {
            this.balance = newBalance;
        } else {
            System.out.println("❌Invalid Balance. Please enter a positive amount/greater than or equal to ₹500.");
        }
    }

    // Setter for account number
    public void setAccountNumber(String newAccountNumber){
        if (newAccountNumber.length() == 10) {
            this.accountNumber = newAccountNumber;
        } else {
            System.out.println("❌Invalid Account Number. Please enter a 10-digit account number.");
        }
    }

    //Setter for account holder name
    public void setAccountHolderName(String newAccountHolderName){
        if (!newAccountHolderName.isEmpty()) {
            this.accountHolderName = newAccountHolderName;
        } else {
            System.out.println("❌Invalid Account Holder Name. Please enter a valid name.");
        }
    }

    // Getter for balance
    public Double getBalance(){
        return this.balance;
    }

    // Getter for account number
    public String getAccountNumber(){
        return this.accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName(){
        return this.accountHolderName;
    }

}



    public class VKBank {
        public static void main(String args[]){
            System.out.println("=================================================");
            System.out.println("              Welcome To VK Bank 🏦              ");
            System.out.println("=================================================");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Your Name : ");
            String AccountHolderName = input.nextLine();
            System.out.println("===================================");
            System.out.print("Enter Your Account Number (10 digit): ");
            String AccountNumber = input.next();
            while (AccountNumber.length() != 10) {
                System.out.println("❌ Please Enter Valid Account Number (10 Digit) : ");
                AccountNumber = input.next();
            }
            System.out.println("===================================");
            System.out.print("Enter Your Balance (Min ₹500) : ");
            Double Balance = input.nextDouble();
            while (Balance < 500) {
                System.out.println("❌ Please Enter Valid Balance (Min ₹500) : ");
                Balance = input.nextDouble();
            }

            Account  A1 = new Account(AccountHolderName, AccountNumber, Balance);
            System.out.println("===================================");
            System.out.println("✅ Account Created Successfully!");
            System.out.println("Account Holder Name : " + A1.getAccountHolderName());
            System.out.println("Account Number : " + A1.getAccountNumber());
            System.out.println("Balance : ₹" + A1.getBalance());
            System.out.println("===================================");

            // Access the main menu
            System.out.print("Do you want to access the main menu? (Y/N) : ");
            String choice = input.next();

            System.out.println("===================================");
        
            if (choice.equalsIgnoreCase("Y")) {
                boolean keepRunning = true;
                Double withdrawAmount = 0.0;
                Double depositAmount = 0.0;
                while(keepRunning){
                    System.out.println("Welcome to the Main Menu!");
                    System.out.println("1. 🔁 Check Balance");
                    System.out.println("2. 💰 Deposit Money");
                    System.out.println("3. 💳 Withdraw Money");
                    System.out.println("4. ⬆️  Update Your Account Number");
                    System.out.println("5. 🔤 Update Your Account Holder Name");
                    System.out.println("6. 🧾 Check Your Account Details");
                    System.out.println("7. 🚪 Exit");

                    System.out.println("===================================");
                    System.out.print("Enter Your Choice (1-7) : ");
                    int menuChoice = input.nextInt();
                    switch (menuChoice) {
                        case 1:
                            System.out.print("Please Enter Your Account Number (10 digit): ");
                            String accountNumbercheck = input.next();
                            if (accountNumbercheck.equals(A1.getAccountNumber())) {
                                System.out.println("===================================");
                                System.out.println("✅ Your Balance is : ₹" + A1.getBalance());
                                System.out.println("===================================");
                                break;
                            } else {
                                System.out.println("===================================");
                                System.out.println("❌ Invalid Account Number. Please try again.");
                                System.out.println("===================================");
                            }
                            break;
                        case 2:
                            System.out.print("Please Enter Your Account Number (10 digit): ");
                            String accountNumberDeposit = input.next();
                            if (accountNumberDeposit.equals(A1.getAccountNumber())) {
                                System.out.print("Please Enter the Amount to Deposit : ");
                                depositAmount = input.nextDouble();
                                A1.setBalance(A1.getBalance() + depositAmount);
                                System.out.println("===================================");
                                System.out.println("✅ Amount Deposited Successfully! Your New Balance is : ₹" + A1.getBalance());
                                System.out.println("===================================");
                            } else {
                                System.out.println("===================================");
                                System.out.println("❌ Invalid Account Number. Please try again.");
                                System.out.println("===================================");
                            }
                            break;
                        case 3:
                            System.out.print("Please Enter Your Account Number (10 digit): ");
                            String accountNumberWithdraw = input.next();
                            if (accountNumberWithdraw.equals(A1.getAccountNumber())) {
                                System.out.print("Please Enter the Amount to Withdraw : ");
                                withdrawAmount = input.nextDouble();
                                if (A1.getBalance() - withdrawAmount >= 500) {
                                    A1.setBalance(A1.getBalance() - withdrawAmount);
                                    System.out.println("===================================");
                                    System.out.println("✅ Amount Withdrawn Successfully! Your Available Balance is : ₹" + A1.getBalance());
                                    System.out.println("===================================");
                                } else {
                                    System.out.println("===================================");
                                    System.out.println("❌ Insufficient Balance. Minimum balance of ₹500 must be maintained.");
                                    System.out.println("===================================");
                                }
                            } else {
                                System.out.println("===================================");
                                System.out.println("❌ Invalid Account Number. Please try again.");
                                System.out.println("===================================");
                            }
                            break;
                        case 4:
                            System.out.print("Enter Your Available Account Number : ");
                            String AccountCheck = input.next();
                            if (AccountCheck.equals(A1.getAccountNumber())) {
                                System.out.print("Enter Your New Account Number : ");
                                String NewAccountNumber = input.next();
                                if (NewAccountNumber.length() == 10) {
                                    A1.setAccountNumber(NewAccountNumber);
                                    System.out.println("===================================");
                                    System.out.println("✅ Account Number Is Updated Successfully....");
                                    System.out.println("===================================");
                                } else {
                                    System.out.println("===================================");
                                    System.out.println("❌ Failed: Account number must be exactly 10 digits.");
                                    System.out.println("===================================");
                                }
                            }
                            else{
                                System.out.println("===================================");
                                System.out.println("❌ You Entered Wrong Account Number : ");
                                System.out.println("===================================");
                            }
                            break;
                        case 5:
                            System.out.print("Enter Your Available Account Number : ");
                            String AccountCheckforholder = input.next();
                            if (AccountCheckforholder.equals(A1.getAccountNumber())) {
                               System.out.print("Enter Your New Account Holder Name : ");
                               input.nextLine();
                               String newAccountHolderName = input.nextLine();
                               A1.setAccountHolderName(newAccountHolderName);
                               System.out.println("===================================");
                               System.out.println("✅ Account Holder Name Updated Successfully : " + A1.getAccountHolderName());
                               System.out.println("===================================");
                            }
                            else{
                                System.out.println("===================================");
                                System.out.println("❌ You Entered Wrong Account Number : ");
                                System.out.println("===================================");
                            }
                            break;
                        case 6:
                            System.out.println("==================================================================");
                            System.out.println("                          🧾 Bank Receipt                         ");
                            System.out.println("==================================================================");
                            System.out.printf("%-20s : %25s\n", "Account Holder Name", A1.getAccountHolderName());
                            System.out.printf("%-20s : %25s\n", "Account Number", A1.getAccountNumber());
                            System.out.printf("%-20s : %25s\n", "Balance", A1.getBalance());
                            System.out.println("==================================================================");
                            System.out.printf("%-20s : %25s\n", "Withdrawal Amount", withdrawAmount);
                            System.out.printf("%-20s : %25s\n", "Deposited Amount", depositAmount);
                            System.out.println("==================================================================");
                            break;
                        case 7:
                            System.out.println("Thank you for using our services! 😊");
                            keepRunning = false;
                            break;
                        default:
                            System.out.println("===================================");
                            System.out.println("❌ Invalid Choice! Please choose between 1 and 7.");
                            System.out.println("===================================");
                    }
                }
                // If block closes here
                } else {
                    System.out.println("Thank you for using our services! 😊");
                
                }

            
            input.close();
        }
    }

