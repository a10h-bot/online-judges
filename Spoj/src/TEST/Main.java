
//Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything.
// More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42.
// All numbers at input are integers of one or two digits.

package TEST;

import java.util.*;
import java.lang.*;
public class Main
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (true) {
            int n = sc.nextInt();
            if (n != 42) {
                list.add(n);
            } else {
                break;
            }
        }
        for (int x : list) {
            System.out.println(x);
        }

    }

}