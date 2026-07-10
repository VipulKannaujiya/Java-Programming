import java.util.Scanner;
public class FunnyMiniCalculator {
    
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                   Funny Mini Calculator😂                   ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("kya calculator me apne number ka locha karna hai❓ (YES✅/NO❌) : ");
            String choose = input.next();

            if (choose.equalsIgnoreCase("yes")) {
                System.out.println("Achcha, Matlab Manega Nahi.🙄");
                System.out.println("Tu locha karega, thik hai chal bata kaun sa locha karna hai, tereko👇");

                System.out.println("\n1. Do numbers ka milan karvana hai.🧑‍🤝‍🧑 \n2. Do numbers ka divorse karvana hai.💔 \n3. Hum Do Hamare Do Karna Hai.❎ \n4. Ak ko kaatkar aadha karna hai.➗ \n5. Dafa Hona hai.🏃‍➡️");
                int opchoice = input.nextInt();
                int num1 = 0;
                int num2 = 0;
                if (opchoice >= 1 && opchoice <= 4) {
                    System.out.println("Pahle dulhe ka number daalo👨‍🦳 : ");
                    num1 = input.nextInt();
                    System.out.println("Ab dulhan ka number daalo👰 : ");
                    num2 = input.nextInt();
                }

                switch (opchoice) {
                    case 1:
                        int joda = num1 + num2;
                        System.out.println("Milan Samppann Huva......💏");
                        System.out.println(num1 + "+" + num2 + "=" + joda);
                        break;
                    case 2:
                        int divorse = num1 - num2;
                        System.out.println("divorse Samppann Huva......💔");
                        System.out.println(num1 + "-" + num2 + "=" + divorse);
                        break;
                    case 3:
                        int humdohamaredo = num1 * num2;
                        System.out.println("Hum Do Hamare Do Ho gya......❎");
                        System.out.println(num1 + "*" + num2 + "=" + humdohamaredo);
                        break;
                    case 4:
                        if (num2 != 0) {
                            Double todna =  (double) num1 / num2;
                            System.out.println("tere number ko kaatkar aadha kar dala🔪......");
                            System.out.println(num1 + "/" + num2 + "=" + todna);
                            break;
                        }
                        else{
                            System.out.println("0 se divide karne ka mera mood nahi hai, abhi turant number badal.....");
                        }
                        break;
                    case 5:
                        System.out.println("Chal Nikal, Pahli Fursat Me Nikal.....👋");
                        System.exit(0);
                    default:
                        System.out.println("Abe saale, dhang se number daal, jyada sadhan mat ban...");
                }

            } else {
                System.out.println("Chal Nikal, Pahli Fursat Me Nikal.....👋");
                break;
            }
        }
        input.close();
    }
}
