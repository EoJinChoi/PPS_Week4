package Solution;

import java.util.*;

public class Main { // 20230116

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		int N = s.nextInt();
		for(int i = 1; i <= N; i++) q.add(i);
		
		while(!(q.size() == 1)) {
			q.remove();
			int n = q.poll();
			q.add(n);
		}
		
		System.out.println(q.peek());
	}

}
