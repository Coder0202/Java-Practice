public class DIAMOND {
    public static void solid(int n){
        for(int i=1 ; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
              for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=n ; k>=1;k--){
            for(int p=1;p<=(n-k);p++){
                System.out.print(" ");
            }
              for(int p=1;p<=2*k-1;p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        solid(50);
    }
}

