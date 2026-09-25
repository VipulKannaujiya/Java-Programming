import java.util.Scanner;

public class Secure_ATM_PIN_Lock_And_Account_Tracker {

    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("            Secure ATM PIN Lock & Account Tracker            ");
        System.out.println("=============================================================");

        System.out.println("WELCOME TO OUR ATM.....");
        Scanner input = new Scanner(System.in);

        // ALL VARIABLES
        String actualAccNum = "";
        int actualPIN = 0;
        double balance = 0.0;
        int maxAttempts = 3;

        while (true) {
            System.out.println("\nDO YOU WANT TO TAKE OUR SERVICES?? (YES/NO) : ");
            String begin = input.next();
            
            if (!begin.equalsIgnoreCase("yes")) {
                System.out.println("THANK YOU FOR VISITING.......");
                break; // Program se bahar
            }

            System.out.println("\nMENU OPTIONS :- \n 1. CREATE A NEW ACCOUNT. \n 2. I HAVE ALREADY ACCOUNT. \n 3. CHECK BALANCE. \n 4. DEPOSIT MONEY. \n 5. VIEW ACCOUNT DETAILS. \n 6. EXIT.");
            int MenuChoice = input.nextInt();
            input.nextLine(); // Buffer clear karne ke liye zaroori hai!

            // CHOICE NUMBER 1: CREATE ACCOUNT
            if (MenuChoice == 1) {
                System.out.println("===================== CREATE A NEW ACCOUNT =====================");
                while (true) {
                    System.out.println("ENTER YOUR NEW ACCOUNT NUMBER (10 Digits) :- ");
                    actualAccNum = input.next();
                    if (actualAccNum.length() == 10) {
                        System.out.println("ACCOUNT NUMBER SAVED SUCCESSFULLY......");
                        break;
                    } else {
                        System.out.println("ERROR: Account number must be exactly 10 digits! Try again.");
                    }
                }

                while (true) {
                    System.out.println("CREATE A PIN FOR ACCOUNT (4-Digit) :- ");
                    actualPIN = input.nextInt();
                    if (actualPIN >= 1000 && actualPIN <= 9999) {
                        System.out.println("PIN saved successfully.");
                        System.out.println("CONGRATULATIONS.... YOUR ACCOUNT IS CREATED SUCCESSFULLY........");
                        break;
                    } else {
                        System.out.println("ERROR: PIN must be a 4-digit number (1000-9999)! Try again.");
                    }
                }
            }
            
            // CHOICE NUMBER 2: LOGIN CHECK
            else if (MenuChoice == 2) {
                System.out.println("===================== LOGIN TO ACCOUNT =====================");
                
                for (int i = 1; i <= maxAttempts; i++) {
                    System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
                    String logAccNum = input.next();
                    System.out.println("ENTER YOUR PIN : ");
                    int LogPin = input.nextInt();

                    // FIXED: .equals() use kiya String ke liye
                    if (logAccNum.equals(actualAccNum) && LogPin == actualPIN) {
                        System.out.println("ACCESS GRANTED! WELCOME TO YOUR ACCOUNT.");
                        break;
                    } else {
                        System.out.println("WRONG PIN OR ACCOUNT NO.! Attempts used: " + i + "/" + maxAttempts);
                        if (i == maxAttempts) {
                            System.out.println("MAXIMUM ATTEMPTS EXCEEDED! Your account is locked.");
                        }
                    }
                }
            }

            // CHOICE NUMBER 3: CHECK BALANCE
            else if (MenuChoice == 3) {
                System.out.println("===================== CHECK BALANCE =====================");
                System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
                String logAccNum = input.next();
                System.out.println("ENTER YOUR PIN : ");
                int LogPin = input.nextInt();

                if (logAccNum.equals(actualAccNum) && LogPin == actualPIN) {
                    System.out.println("CURRENT BALANCE = Rs. " + balance);
                } else {
                    System.out.println("INVALID CREDENTIALS!");
                }
            }

            // CHOICE NUMBER 4: DEPOSIT MONEY
            else if (MenuChoice == 4) {
                System.out.println("===================== DEPOSIT MONEY =====================");
                System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
                String logAccNum = input.next();
                System.out.println("ENTER YOUR PIN : ");
                int LogPin = input.nextInt();

                if (logAccNum.equals(actualAccNum) && LogPin == actualPIN) {
                    System.out.println("ENTER YOUR DEPOSIT AMOUNT :- ");
                    double deposit = input.nextDouble();
                    balance += deposit; // Balance update kiya
                    System.out.println("UPDATED BALANCE = Rs. " + balance);
                } else {
                    System.out.println("INVALID CREDENTIALS!");
                }
            }

            // CHOICE NUMBER 5: VIEW DETAILS
            else if (MenuChoice == 5) {
                System.out.println("===================== VIEW ACCOUNT DETAILS =====================");
                
                // Buffer issues handled by top input.nextLine()
                System.out.println("ENTER ACCOUNT HOLDER NAME : ");
                String AccHolderName = input.nextLine();
                System.out.println("ENTER YOUR BANK NAME : ");
                String BankName = input.nextLine();

                System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
                String logAccNum = input.next();
                System.out.println("ENTER YOUR PIN : ");
                int LogPin = input.nextInt();

                if (logAccNum.equals(actualAccNum) && LogPin == actualPIN) {
                    // FIXED: Masking logic ko condition ke andar laya taaki crash na ho agar account khali ho
                    String maskedAcc = "XXXXXX" + actualAccNum.substring(6);

                    System.out.println("=============================================================");
                    System.out.println("                   -: ACCOUNT DETAILS :-                     ");
                    System.out.println("=============================================================");
                    System.out.printf("%-20s : %-25s\n", "BANK NAME", BankName);
                    System.out.printf("%-20s : %-25s\n", "ACCOUNT HOLDER", AccHolderName);
                    System.out.printf("%-20s : %-25s\n", "ACCOUNT NUMBER", maskedAcc); // Masked number print kiya
                    System.out.printf("%-20s : Rs. %-22.2f\n", "AVAILABLE BALANCE", balance);
                    System.out.printf("%-20s : %-25s\n", "ACCOUNT STATUS", "ACTIVE");
                    System.out.println("=============================================================");
                } else {
                    System.out.println("INVALID CREDENTIALS!");
                }
            }

            // CHOICE NUMBER 6: EXIT
            else if (MenuChoice == 6) {
                System.out.println("===================== EXITED SUCCESSFULLY. =====================");
                break;
            }
        }
        input.close();
    }
}