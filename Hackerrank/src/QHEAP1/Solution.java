package QHEAP1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int qtype=0;
        List<Integer> Qheap = new ArrayList<>();
        for (int i=0;i<n;i++){
            qtype=sc.nextInt();
            if(qtype==1){
                int valToBeAdded=sc.nextInt();
                Qheap.add(valToBeAdded);
            }
            else if(qtype==2){
                int valToBeDeleted=sc.nextInt();
                Qheap.remove(new Integer(valToBeDeleted));
            }
            else if(qtype==3){
                //System.out.println(Qheap.get(0));
                Collections.sort(Qheap);
                System.out.println(Qheap.get(0));

            }
        }
    }
}
