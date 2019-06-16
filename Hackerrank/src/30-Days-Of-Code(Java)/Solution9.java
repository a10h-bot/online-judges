
// Day 9: Recursion 3

import java.io.*;
import java.util.*;

public class Solution9 {

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int result = factorial(n);

    }
}
