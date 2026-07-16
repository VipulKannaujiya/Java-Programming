public class TrianglePattern {
    
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("                 Triangle Pattern               ");
        System.out.println("================================================");

        for(int i=1; i<=5; i++){
            for(int j=1; j<i+1; j++){
                System.out.printf("*");
            }
            System.err.println();
        }
    }
}
