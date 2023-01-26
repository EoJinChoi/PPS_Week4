package Solution;

public class Solution { // 20230116
	public static int dayOfYear(String date) {
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] d = date.split("-");
		int answer = 0;
		
		if((Integer.valueOf(d[0]) % 4 == 0 && Integer.valueOf(d[0]) % 100 != 0) || Integer.valueOf(d[0]) % 400 == 0)
			m[1] = 29;
		
		for(int i = 0; i < Integer.valueOf(d[1]) - 1; i++) {
			answer += m[i];
		}
		answer += Integer.valueOf(d[2]);
		
		System.out.println(answer);
		return answer;
    }
}
