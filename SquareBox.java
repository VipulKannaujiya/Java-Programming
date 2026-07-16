public class SquareBox {
    
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("               Square Box Pattern               ");
        System.out.println("================================================");

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if ((i>0 && i<4) && (j>0 && j<4) ){
                    System.out.printf(" ");
                }
                else{
                    System.err.printf("*");
                }
            }
            System.err.println();
        }
    }
}
