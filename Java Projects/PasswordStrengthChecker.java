import java.util.Scanner;

public class PasswordStrengthChecker {
    
    // Functions
        public static boolean hasUpperCase(char ch){
            if (Character.isUpperCase(ch)) {
                return true;
            }
            return false;
        }
    // Function 2
        public static boolean hasDigit(char ch){
            if (Character.isDigit(ch)) {
                return true;
            }
            return false;
        }
    // Function 3
        public static boolean hasSpecial(char ch){
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
            return false;
        }



    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("           Password Strength Checker & Generator.            ");
        System.out.println("=============================================================");
        
        Scanner input = new Scanner(System.in);

        int score = 0;

        System.out.println("Enter Your Password : ");
        String password = input.nextLine();

        boolean upperFound = false;
        boolean digitFound = false;
        boolean specialFound = false;

        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);

            // FOR UPPERCASE
            if (hasUpperCase(ch) == true) {
                upperFound = true;
            }
            // FOR DIGIT
            if (hasDigit(ch) == true) {
                digitFound = true;
            }
            // FOR SPECIAL CHARACTER
            if (hasSpecial(ch) == true) {
                specialFound = true;
            }
        }
        // SCORE CALCULATE KARNE KA LOGIC
        if (password.length() >= 8) {
            score = score + 1;
        }
        if (upperFound == true) {
            score = score + 1;
        }
        if (digitFound == true) {
            score = score + 1;
        }
        if (specialFound == true) {
            score = score + 1;
        }
        // SCORE PRINT KARNE KA LOGIC
        System.out.println("Password Length: " + password.length() + " Characters");
        System.out.println("Security Score : " + score + " / 4");

        if (score <= 2) {
            System.out.println("STRENGTH STATUS: WEAK (Easy to Hack!)");

             // Auto-Password Generator (Math.random).
            String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890!@#%^&*";

            String suggestedPassword = "";
            for(int i=0; i<10; i++){
                int randomIndex = (int) (Math.random() * pool.length());

                suggestedPassword = suggestedPassword + pool.charAt(randomIndex);
            }
            System.out.println("💡 SUGGESTION FOR YOU:");
            System.out.println("👉 Suggested Password : " + suggestedPassword);
        } else if (score == 3) {
            System.out.println("STRENGTH STATUS: MEDIUM (Thik-thak hai)");

             // Auto-Password Generator (Math.random).
            String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890!@#%^&*";

            String suggestedPassword = "";
            for(int i=0; i<10; i++){
                int randomIndex = (int) (Math.random() * pool.length());

                suggestedPassword = suggestedPassword + pool.charAt(randomIndex);
            }
            System.out.println("💡 SUGGESTION FOR YOU:");
            System.out.println("👉 Suggested Password : " + suggestedPassword);
            } else {
            System.out.println("STRENGTH STATUS: STRONG (Ekdam Safe!)");
        }

        input.close();
    }
}
