package Solution;

import java.util.Arrays;

public class Solution { // 20230118
	public static int majorityElement(int[] nums) {
        int answer;
        
        Arrays.sort(nums);
        answer = nums[nums.length / 2];
        
        return answer;
    }
}
