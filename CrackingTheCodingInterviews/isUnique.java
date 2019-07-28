//implement a algo to determine if a string has all unique characters.
// What if you can not use additional data structure.

import java.util.ArrayList;
import java.util.List;

// String s = {"helloo"}; should return true
//below is O(N) time and O(N) space solution
public class isUnique {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "tolzec";
        System.out.println(validateUnique(str1));
        System.out.println(validateUnique(str2));
    }

    private static boolean validateUnique(String str) {
        final List<Character> charList = new ArrayList<>(str.length());
        boolean res = false;
        for (var element : str.toCharArray()) {
            if (!charList.contains(element)) {
                charList.add(element);
            } else
                res = true;
        }
        return res;
    }

}
