
// String Token
import java.util.*;
import java.util.Scanner;

public class Solution10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] temp = s.split("[^a-zA-Z]+");
        System.out.println(temp.length);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        scan.close();
    }
}
