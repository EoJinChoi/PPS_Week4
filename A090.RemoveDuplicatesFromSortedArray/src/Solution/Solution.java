package Solution;

import java.util.ArrayList;

public class Solution { // 20230120
	public static int removeDuplicates(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();
		int answer;
        int cnt = 0;
        
		for(int i = 0; i < nums.length; i++) {
			if(i != 0 && nums[i] == nums[i - 1]) {
				cnt++;
			}
			else list.add(nums[i]);
		}
		answer = nums.length - cnt;
		
		for(int i = 0; i < nums.length - cnt; i++)
			nums[i] = list.get(i);
		
		System.out.println(answer);
		return answer;
    }
}
