package Solution;

import java.util.*;

public class Main { // 20230116

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		String str = String.valueOf(N);
		Integer[] sort = new Integer[str.length()];
		int i = 0;
		
		while(N > 0) {
			sort[i] = N % 10;
			i++;
			N /= 10;
		}
		
		Arrays.sort(sort, Collections.reverseOrder());
		
		for(int j = 0; j < sort.length; j++) {
			System.out.print(sort[j]);
		}
	}

}
