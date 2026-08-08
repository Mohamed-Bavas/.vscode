import java.util.*;
public class Arrayreverse {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        System.out.print("Arrays -> ");  
        for(int i=0;i<a;i++){
            System.out.print(b[i]+" ");
        } 
        System.out.println();
        System.out.print("ReverseArray -> ");  
        for (int i=a-1;i>=0;i--){
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
}
