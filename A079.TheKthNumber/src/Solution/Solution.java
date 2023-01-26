package Solution;

import java.util.Arrays;

public class Solution { // 20230117
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
        	int idx = 0;
        	Integer[] n = new Integer[commands[i][1] - commands[i][0] + 1];
        	
        	for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
        		n[idx] = array[j];
        		idx++;
        	}
        	Arrays.sort(n);
        	
        	answer[i] = n[commands[i][2] - 1];
        }
        
//        for(int i = 0; i < answer.length; i++) System.out.print(answer[i] + " ");
        return answer;
    }
}
