//Given an array S of n integers,are there elements a,b,c in S such that a+b+c=0?Find all unique triplets in the array which gives the sum of zero.

// Note:The solution set must not contain duplicate triplets.For example,given array S=[-1,0,1,2,-1,-4],

// A solution set is:[[-1,0,1],[-1,-1,2]]

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class sol {
  public static boolean flag = false;

  public static List<List<Integer>> list = new ArrayList<>();

  public static List<List<Integer>> isExit(Integer[] A) {
    for (int i = 0; i < A.length; i++) {
      for (int j = i + 1; j < A.length - 1; j++) {
        for (int k = j + 1; k < A.length - 2; k++) {
          if (A[i] + A[j] + A[k] == 0) {
            List<Integer> l = Arrays.asList(A[i], A[j], A[k]);
            list.add(l);
          }
        }
      }
    }
    return list;
  }
}

public class threeSum1 {
  public static void main(String[] args) {
    Integer[] array = new Integer[] { -1, 0, 1, 2, -1, -4 };
    System.out.println(sol.isExit(array));
  }
}
