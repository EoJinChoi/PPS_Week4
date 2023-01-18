package Solution;

import java.util.*;

public class Main { // 20230118

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) num[i] = s.nextInt();
		
		Arrays.sort(num);
		
		for(int i = 0; i < N; i++) {
			if(i != 0 && num[i] == num[i - 1]) continue;
			else System.out.println(num[i]);
		}
	}

}
