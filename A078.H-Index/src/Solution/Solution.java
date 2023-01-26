package Solution;

import java.util.Arrays;

public class Solution { // 20230117
	public static int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        for(int i = citations[citations.length / 2]; i >= 0; i--) {
        	int u = 0;
        	for(int j = 0; j < citations.length; j++) {
        		if(citations[j] >= i) u++;
        	}
        	if(u >= i && citations.length - u <= i) {
        		answer = i;
        		break;
        	}
        }
        
//        System.out.println(answer);
        return answer;
    }
}
