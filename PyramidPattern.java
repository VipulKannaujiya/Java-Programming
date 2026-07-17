public class PyramidPattern {
    
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("                 Pyramid Pattern                ");
        System.out.println("================================================");

        for(int i=0; i<5; i++){
            // For space
            for(int j=0; j<5-i; j++){
                System.out.printf(" ");
            }
            // For star
            for(int k=0; k<(2*i)+1; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
