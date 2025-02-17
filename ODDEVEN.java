import java.util.Scanner;

public class ODDEVEN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number =");
        int n = sc.nextInt();
        System.out.print("Answer is = ");
        if (n%2==0) {
            System.out.println("your number is even");
        }
            else
            System.out.println("your number is odd");
            
        
    }
}
