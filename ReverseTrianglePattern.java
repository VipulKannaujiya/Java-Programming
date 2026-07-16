public class ReverseTrianglePattern {
    
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("             Reverse Triangle Pattern           ");
        System.out.println("================================================");

        for(int i=5; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
