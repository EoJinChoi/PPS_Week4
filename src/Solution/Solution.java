package Solution;

public class Solution { // 20230120
	public static int removeElement(int[] nums, int val) {
        int n = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != val) {
        		nums[n] = nums[i];
        		n++;
        	}
        }
        
        System.out.println(n);
        return n;
    }
}
