
public class Solution {
	public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = s.length() - 1; i>=0; i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(reverseString(s));
	}

}
