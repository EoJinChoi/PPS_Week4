package Solution;

public class Solution { // 20230120
public static int[] sortArrayByParityII(int[] nums) {
        int[] num = new int[nums.length];
        int odd = 1;
        int even = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] % 2 == 0) {
        		num[even] = nums[i];
        		even += 2;
        	}
        	else {
        		num[odd] = nums[i];
        		odd += 2;
        	}
        }
        
        for(int i = 0; i < num.length; i++) System.out.println(num[i]);
        return num;
    }
}
