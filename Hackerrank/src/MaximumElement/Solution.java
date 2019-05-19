/*

You have an empty sequence, and you will be given

queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.

Input Format

The first line of input contains an integer,
. The next

lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

Constraints


Output Format

For each type

query, print the maximum element in the stack on a new line.

Sample Input

10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3

Sample Output

26
91


*/

package MaximumElement;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int val = sc.nextInt();
                S.push(val);
            } else if (type == 2) {
                S.pop();
            } else if (type == 3) {
                /*Iterator<Integer> itr = S.iterator();
                int max= Integer.MIN_VALUE;
                while(itr.hasNext()){
                    if(max<itr.next()){
                        max=itr.next();
                    }
                }
                System.out.println(max);
            }
            */
                int max = Integer.MIN_VALUE;
                while (!S.isEmpty()) {
                    max = Math.max(S.pop(), max);
                }
                System.out.println(max);


            }
        }
    }
}