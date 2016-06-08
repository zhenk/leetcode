import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2= new HashMap<Integer,Integer>();
        for(int i = 0; i < nums1.length; i++){
        	if(map1.containsKey(nums1[i])){
        		map1.put(nums1[i], map1.get(nums1[i])+1);
        	}
        	else{
        		map1.put(nums1[i], 1);
        	}
        }
        for(int j = 0; j < nums2.length; j++){
        	if(map2.containsKey(nums2[j])){
        		map2.put(nums2[j], map2.get(nums2[j])+1);
        	}
        	else{
        		map2.put(nums2[j], 1);
        	}
        }
        int count = 0;
        int count2 = 0;
        int[] arr = new int[10000];
        HashMap<Integer,Integer> map3 = new HashMap<Integer,Integer>();
        for(Map.Entry<Integer, Integer>entry:map1.entrySet()){
        	//System.out.println(entry.getKey());
    		if(map2.containsKey(entry.getKey())){
    			count+= Math.min(map1.get(entry.getKey()), map2.get(entry.getKey()));
    			for(int i = 0; i < Math.min(map1.get(entry.getKey()), map2.get(entry.getKey()));i++){
    				arr[count2++]=entry.getKey();
    			}
    		}
        	
        }
        int[] res = new int[count];
        for(int i = 0; i < count; i++){
        	res[i] = arr[i];
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2};
		int b[] = {2,1};
		int[] res = intersect(a,b);
		for(int i = 0;i < res.length;i++){
			System.out.println(res[i]);
		}
	}

}
