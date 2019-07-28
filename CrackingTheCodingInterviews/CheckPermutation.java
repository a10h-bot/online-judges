///* Given two strings write a method to check if one is permutation of the other. */
//
//import java.util.Arrays;
//
//public class CheckPermutation {
//    public static void main(String[] args) {
//        String  s1 = new String("abcde");
//        String s2 = new String("edabp");
//        boolean output=validatePermutation(s1,s2);
//        System.out.println(output);
//    }
//    private  static boolean validatePermutation(String str1,String str2){
//        if (str1.length()!= str2.length()) return  false;
//       char [] temp1 = str1.toCharArray();
//        Arrays.sort(temp1);
//        char [] temp2 = str2.toCharArray();
//        Arrays.sort(temp2);
//        boolean res= true;
//        for (int i = 0; i <temp1.length ; i++) {
//              if (temp1[i]==temp2[i]){
//                  continue;
//              }
//              else
//                  res=false;
//        }
//        return res;
//    }
////_______________________________________________________________________________________________________
//    private static boolean validatePermutaionAgain(String str1,String str2){
//        if (str1.length()!= str2.length()) return  false;
//        int NO_OF_CHARS = 128;
//        int [] count1 = new int[NO_OF_CHARS];
//        Arrays.fill(count1,0);
//        int [] count2 = new int[NO_OF_CHARS];
//        Arrays.fill(count2,0);
//        for (int i=0;i<str1.length() && i< str2.length();i++){
//            count1[str1[i]]++;
//            count2[str2[i]]++;
//        }
//    }
//}
