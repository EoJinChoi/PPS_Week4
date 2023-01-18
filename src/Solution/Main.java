package Solution;

import java.util.*;

public class Main { // 20230118

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = s.nextInt();
		Integer[] arr = new Integer[10];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 10; j++)
				arr[j] = s.nextInt();
			
			Arrays.sort(arr, Collections.reverseOrder());
			
			sb.append(arr[2]).append("\n");
		}
		
		System.out.println(sb);
	}

}
