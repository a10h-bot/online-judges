
//Java Strings Introduction
import java.util.*;

public class Solution7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String temp1 = A.toUpperCase();
        String temp2 = B.toUpperCase();
        A = temp1.charAt(0) + A.substring(1);
        B = temp2.charAt(0) + B.substring(1);

        System.out.println(A + " " + B);

    }
}
