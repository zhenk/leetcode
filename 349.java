package mypackage;

import java.util.HashMap;

public class Solver {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int j = 0; j < nums1.length; j++){
        	for(int k = 0; k < nums2.length; k++){
        		if(nums1[j] == nums2[k]&&!map.containsKey(nums1[j])){
        			map.put(nums1[j], 1);
        			break;
        		}
        	}
        }
        int[] result = new int[map.size()];
        int count = 0;
        for (Integer j: map.keySet()) {
			result[count++]=j;
		}
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,2,1};
		int b[] = {2,2};
		int[] res = intersection(a,b);
		System.out.println(res.length);
	}

}
