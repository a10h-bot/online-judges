
// Day 11: 2D Arrays
import java.util.*;

public class Solution11 {
    // Complete the hourglassSum function below.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] values = new int[6][6];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                values[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = values[i][j] + values[i][j + 1] + values[i][j + 2] // row 1
                        + values[i + 1][j + 1] // row 2
                        + values[i + 2][j] + values[i + 2][j + 1] + values[i + 2][j + 2]; // row 3
                max = Math.max(temp, max);
            }
        }
        System.out.println(max);

    }

}
