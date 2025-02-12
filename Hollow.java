public class Hollow {
   
        public static void hollow_rec(int RO ,int CO ){
            for( int i=1;i<=RO;i++){
                for(int j=1; j<=CO; j++){
                    if (i == 1||i ==RO||j==1||j==CO) {
                        System.out.print("*");
                     } else{
                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println();
                }
            }
        
        public static void main(String[] args) {
            hollow_rec(6, 6);
            
        }
    
}
