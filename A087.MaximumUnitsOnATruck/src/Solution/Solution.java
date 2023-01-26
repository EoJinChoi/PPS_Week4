package Solution;

public class Solution { // 20230119
	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		int answer = 0;
        int size = 0;
        int idx = 0;
        
        while(true) {
        	int max = 0;
	        for(int i = 0; i < boxTypes.length; i++) {
	        	if(boxTypes[i][1] > max) {
	        		max = boxTypes[i][1];
	        		idx = i;
	        	}
	        }
	        
	        for(int i = 0; i < boxTypes[idx][0]; i++) {
	        	if(size == truckSize) break;
	        	size++;
	        	answer += boxTypes[idx][1];
	        }
	        boxTypes[idx][1] = 0;
	        
	        if(size >= truckSize) break;
        }
        
//        System.out.println(answer);
        return answer;
    }
}
