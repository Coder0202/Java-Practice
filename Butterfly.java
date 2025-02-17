public class Butterfly {

  
        public static void patter(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
                }
            for(int k=n; k>=1; k--){
                    for(int a=1; a<=k; a++){
                        System.out.print("*");
                    }
                    for(int a=1; a<=2*(n-k); a++){
                        System.out.print(" ");
                    }
                    for(int a=1; a<=k; a++){
                        System.out.print("*");
                    }
                    System.out.println();
            }
            
            }
        
        public static void main(String[] args) {
            patter(5);
            
        }
    }
    


    

