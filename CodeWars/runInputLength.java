
//Given an input string, write a function that returns the Run Length Encoded string for the input string.

//For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”.

package OneProblemAday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RunInputLength {

	public static void main(String[] args) {
		String input  = "wwwwaaadexxxxxx";
        helper(input);
        System.out.println(helper(input));
	}
 private static String helper (String str) {
	 String output = "";
	 Map<Character,Integer>  map = new LinkedHashMap<>();
     for(int i =0;i<str.length();i++) {
    	 if(!map.containsKey(str.charAt(i))) {
    		 map.put(str.charAt(i), 1);
    	 }
    	 else 
    		 map.put(str.charAt(i), map.get(str.charAt(i))+1);
     }
    Set<Character> set = map.keySet();
    
    for(Character c : set) {
    	output= output + c + map.get(c);
    }
    return output;
 }
	
}
