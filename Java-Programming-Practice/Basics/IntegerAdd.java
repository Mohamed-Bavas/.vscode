import java.util.*;
public class IntegerAdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=String.valueOf(a);
        String[] c=b.split("");
        int add=0;
        for(int i=0;i<c.length;i++){
            add += Integer.parseInt(c[i]);
        }
        System.out.print(add);
        sc.close();
    }
    
}
