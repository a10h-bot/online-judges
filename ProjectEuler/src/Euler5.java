
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */

import java.util.ArrayList;
import java.util.List;

public class Euler5 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        int n = Integer.MAX_VALUE;
        int res=20;
        for (int i=20;i<=n;i++) {
            if (checker(i)) {
                list.add(i);
            }
        }
        for(int x : list){
            if(x<res){
                res=x;
            }
        }
        System.out.println(res);
        System.out.println(list);
    }
    private static boolean checker(int k){
        int i=2;
        int r=0;
        while(i<=20){
            r=k%i;
            i++;
        }
        final boolean b = r == 0;
        return b;
    }
}
