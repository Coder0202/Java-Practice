public class Floyd {
    public static void patter(int n ){
        int cou =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(cou+" ");
                cou++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patter(12);
        
    }

}
