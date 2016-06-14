/* Time Limit Exceeded version*/
public class Solution {
	public static boolean isPrime(int n){
		if(n == 0||n == 1) return false;
		for(int i = 2; i<= Math.sqrt(n); i++){
			if(n%i==0) return false;
		}
		return true;
	}
	public static int countPrimes(int n) {
        int count = 0;
		for(int i = 0; i < n; i ++){
        	if(isPrime(i)) {count++;
        	System.out.println(i);}
        }
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPrimes(6);
	}
}
public class Solution {
    
  
	public static int countPrimes(int n) {
        if(n<2) return 0;
		boolean[] label = new boolean[n];
        for(int i = 2; i<n;i++ ){
        	label[i]=true;
        }
        
        int count= 0;
        for(int i = 2; i < n;i++){
        	if(label[i]){
        		for(int j = i+i; j<n; j+=i){
        			label[j]=false;
        		}
        		count++;
        	//System.out.println(i);
        	}
        	
        }
        return count;
    }
}
