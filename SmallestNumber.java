import java.*;
import java.util.Scanner;
class SmallestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int min=b[0];
        for(int i=0;i<a;i++){
            if(b[i]<min){
                min=b[i];
            }
        }
        System.out.print(min);
    }
}