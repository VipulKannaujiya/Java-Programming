import java.util.Scanner;

public class TrafficLightGuide {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("                 Funny Traffic Light Guider🚦                ");
        System.out.println("=============================================================");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Traffic Color (RED/ORANGE/GREEN) : ");
        String tlight = input.next();

        if (tlight.equalsIgnoreCase("red")) {
            System.out.println("RUKO JARA SABAR KARO.....🔴");
        }
        else if (tlight.equalsIgnoreCase("orange")) {
            System.out.println("YEE!! GADI START KAR...🟠");
        }
        else if (tlight.equalsIgnoreCase("green")) {
            System.out.println("CHALA JAA, BSDK...🟢");
        }
        else{
            System.out.println("लौडेंन भोज्यम.........🫵");
        }
        input.close();
    }
}
