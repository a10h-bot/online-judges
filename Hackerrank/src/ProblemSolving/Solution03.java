
// Dynamic Array
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] sequences = new List[n];
        for (int k = 0; k < n; k++) {
            sequences[k] = new ArrayList<>();
        }
        int lastAns = 0;
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence = sequences[(x ^ lastAns) % n];
            switch (t) {
            case 1:
                sequence.add(y);
                break;
            case 2:
                lastAns = sequence.get(y % sequence.size());
                System.out.println(lastAns);
                break;
            }
        }

    }

}
