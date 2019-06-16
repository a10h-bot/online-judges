import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

  public List<List<Integer>> threeSum(int[] num) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    Set<String> set = new HashSet<String>();
    // { -4,-1, -1, 0, 1, 2}
    Arrays.sort(num);

    int n = num.length;

    for (int i = 0; i < n - 2; i++) {
      int j = i + 1, k = n - 1;

      while (j < k) {
        int sum = num[i] + num[j] + num[k];

        if (sum == 0) {
          String key = String.format("%d,%d,%d", num[i], num[j], num[k]);

          if (!set.contains(key)) {
            set.add(key);

            List<Integer> sol = new ArrayList<Integer>();
            sol.add(num[i]);
            sol.add(num[j]);
            sol.add(num[k]);

            res.add(sol);
          }

          j++;
          k--;
        } else if (sum < 0) {
          j++;
        } else {
          k--;
        }
      }
    }
    return res;
  }
}

public class threeSum2 {
  public static void main(String[] args) {
    int[] array = new int[] { -1, 0, 1, 2, -1, -4 };
    System.out.println(new Solution().threeSum(array));
  }
}