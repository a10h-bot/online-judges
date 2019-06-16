
// Given an array of 2n integers, your task is to group these integers into n pairs of integer,
//say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi)
//for all i from 1 to n as large as possible.

//Example 1:
//Input: [1,4,3,2]
//Output: 4
//Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

import java.util.Arrays;

public class leetCode561_Array_partition1 {

public static void main(String[] args) {
    int [] input = new int[] {1,4,3,2,8,7};
    helper(input);
}
    private static void helper(int[] input) {
        int sum=0;
        Arrays.sort(input);
        for(int i=0;i<input.length;i+=2) {
            sum+=input[i];
        }
        System.out.println(sum);
    }

}


