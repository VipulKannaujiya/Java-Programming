public class Array {
    public static void main(String[] args) {
        System.out.println("=======================================================");
        System.out.println("                  Array Basic Concepts                 ");
        System.out.println("=======================================================");

        // Array creation
        System.out.println("Printing each elements...");
        int[] number = {12,32,24,53,64,84,39,45};
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }

        System.out.println("Sum of array element...");
        int sum = 0;
        for(int i=0; i<number.length; i++){
            sum += number[i];
        }
        System.out.println("Grand Sum of array element : " + sum);

        System.out.println("find max element in array.");
        int max = number[0];
        for(int i=1; i<number.length; i++){
            //  12  >   32
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println("Max Number = " + max);
    }
}
