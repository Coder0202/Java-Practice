import java.util.Scanner;

class demo{
    static String strrev(String s) {
     if(s==null||s.length()<=1) 
    return s;
    return strrev(s.substring(1))+s.charAt(0);
}}
public class Recursion 
{
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);  
     System.out.println("Enter Any String"); 
     String s= sc.nextLine();
     System.out.println(demo.strrev(s));
    }

}
