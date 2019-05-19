package QueueusingTwoStacks;
import java.math.BigInteger;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 1) {
            int qtype = sc.nextInt();
            if (qtype == 1) {
                BigInteger value = sc.nextBigInteger();
                EnQueue(value);
            } else if (qtype == 2) {
                DeQueue();
            } else if (qtype == 3) {
                System.out.println(S2.peek());
            }
            n -= 1;
        }

        sc.close();
    }
    static Stack<BigInteger> S1 = new Stack<>();
    static Stack<BigInteger> S2 = new Stack<>();

    public static void EnQueue(BigInteger item) {
        S1.push(item);
    }

    public static BigInteger DeQueue() {
        if (S2.isEmpty()) {
            while (!S1.isEmpty()){
                S2.push(S1.pop());
            }
        }
        return S2.pop();
    }
}
