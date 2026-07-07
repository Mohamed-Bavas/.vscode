import java.*;
import java.util.Scanner;
public class IntAdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int add=0;
        while(a>0){
            add+=a%10;
            a/=10;
        }
        System.out.print(add);
    }
}
