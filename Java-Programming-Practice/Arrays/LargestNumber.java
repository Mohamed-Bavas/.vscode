
import java.util.Scanner;
class LargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int max=b[0];
        for(int i=0;i<a;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        System.out.print(max);
        sc.close();
    }
}