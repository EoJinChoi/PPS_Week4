package Solution;

import java.util.Arrays;

public class Solution { // 20230120
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
		for(int i = 0; i < m; i++) {
			nums1[i] = nums1[i];
		}
		for(int i = 0; i < n; i++) {
			nums1[i + m] = nums2[i];
		}
		
		Arrays.sort(nums1);
//		for(int i = 0; i < nums1.length; i++) System.out.println(nums1[i]);
    }
}
