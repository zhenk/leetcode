import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public static boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()||(s==null||t==null)) return false;
        HashMap<Character,Character>map1 = new HashMap<Character,Character>();
        for(int i = 0; i < s.length(); i++){
        	char c1 = s.charAt(i);
        	char c2 = t.charAt(i);
        	if(map1.containsKey(c1)){
        		if(map1.get(c1)!=c2) return false;
        	}
        	else if(map1.containsValue(c2)){
        		return false;
        	}
        	else{
        		map1.put(c1, c2);
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		String t = "baa";
		System.out.println(isIsomorphic(s,t));
	}

}
