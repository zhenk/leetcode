public class Solution {
    public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = s.length() - 1; i>=0; i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
	public static String reverseVowels(String s) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		String vowels= "aeiouAEIOU";
		for(int i = 0; i < s.length(); i++){
			if(vowels.contains(s.charAt(i)+"")){
				sb2.append(s.charAt(i));
			}
		}
		String reversevowels = reverseString(sb2.toString());
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(vowels.contains(s.charAt(i)+"")){
				sb.append(reversevowels.charAt(count++));
			}
			else{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
    }
}
