import java.util.*;
public class StringReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] b=a.split("");
        for(int i=b.length-1;i>=0;i--){
            System.out.print(b[i]);
        }
    }
}
