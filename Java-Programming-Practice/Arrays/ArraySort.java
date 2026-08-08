import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Step 1: Sort array
        Arrays.sort(a);

        // Step 2: Remove duplicates
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[k++] = a[i];
            }
        }
        a[k++] = a[n - 1];

        // Step 3: Print result
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
