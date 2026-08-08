import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2 || count==1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
