import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Balanced Brackets

public class Solution16 {
    // Complete the isBalanced function below.
    static String isBalanced(String code) {
        // creating a map with keys and values as opening and closing symbols
        Map<Character, Character> openersToClosers = new HashMap<>();
        openersToClosers.put('(', ')');
        openersToClosers.put('[', ']');
        openersToClosers.put('{', '}');
        // Set<Character> s1 = new
        Set<Character> openers = openersToClosers.keySet();
        Set<Character> closers = new HashSet<>(openersToClosers.values());

        Deque<Character> openersStack = new ArrayDeque<>();

        for (char c : code.toCharArray()) {
            if (openers.contains(c)) {
                openersStack.push(c);
            } else if (closers.contains(c)) {
                if (openersStack.isEmpty()) {
                    return "NO";
                } else {
                    char lastUnclosedOpener = openersStack.pop();
                    // if this closer doesn't correspond to the most recently
                    // seen unclosed opener, short-circuit, returning false
                    if (openersToClosers.get(lastUnclosedOpener) != c) {
                        return "NO";
                    }
                }
            }
        }
        if (openersStack.isEmpty()) {
            return "YES";
        } else
            return "NO";
    }
}