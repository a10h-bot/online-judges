
// Day 7: Arrays
import java.util.*;

public class Solution7 {

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            n--;
            System.out.print(A[n] + " ");
        }

    }

}
