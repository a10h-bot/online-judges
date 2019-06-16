import java.util.Collections;

//Given two binary strings, return their sum (also a binary string).
//The input strings are both non-empty and contains only characters 1 or 0.
//Example 1:
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//Input: a = "1010", b = "1011"
//Output: "10101"
public class leetCode67_Add_Binary {
    public static void main(String[] args) {
        helper("1010","1011");
    }
    public static void helper(String a, String b) {
        int maxL= Math.max(a.length(), b.length());
        if(a.length()<maxL) {
            a =String.join("", Collections.nCopies(maxL-a.length(),"0") )+a;
        }
        if(b.length()<maxL) {
            b=String.join("", Collections.nCopies(maxL-b.length(), "0"))+b;
        }
        int carry =0;
        StringBuilder sb = new StringBuilder("");
        for(int i=a.length()-1;i>0;i--) {
            if(a.charAt(i)=='1' && b.charAt(i)=='1') {
                if(carry=='1') {
                    sb.append("1");
                }
                else {
                    sb.append("0");
                }
                carry=1;

            }
            else if(a.charAt(i)!=b.charAt(i)) {
                if(carry==1) {
                    sb.append("0");

                }
                else {
                    sb.append("1");
                }
            }
            else if(a.charAt(i)=='0' && b.charAt(i)=='0') {
                sb.append(String.valueOf(carry));
                carry=0;
            }
        }
        if(carry==1) {
            sb.append('1');
        }
        System.out.println(sb.reverse().toString());
    }
}

