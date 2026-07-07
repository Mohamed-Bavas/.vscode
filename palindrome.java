import java.*;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int tem=a;
        int rev=0;
        while(a>0){
           
            rev=rev*10+a%10;
            a=a/10;
        }
        if(tem==rev){
            System.out.println("it is polindrome");
        }else{
            System.out.println("it is not polindrome");
        }
    }
}
