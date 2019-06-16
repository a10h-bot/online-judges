import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            hmap.put(name, phone);
        }

        while (in.hasNext()) {
            String name = in.next();
            if (hmap.containsKey(name)) {
                int phone = hmap.get(name);
                System.out.println(name + "=" + phone);
            } else
                System.out.println("Not found");
        }

        in.close();
    }
}
