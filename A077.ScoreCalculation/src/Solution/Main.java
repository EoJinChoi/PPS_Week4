package Solution;

import java.util.*;

public class Main { // 20230117

	public static void main(String[] args) {
		HashMap<Integer, Integer> score= new HashMap<>();
		Scanner s = new Scanner(System.in);
		Integer[] order = new Integer[5];
		int sum = 0;
		
		for(int i = 0; i < 8; i++) {
			score.put(s.nextInt(), i + 1);
		}
		
		Object[] mapkey = score.keySet().toArray();
		Arrays.sort(mapkey, Collections.reverseOrder());
		
		for(int i = 0; i < 5; i++) {
			order[i] = score.get(mapkey[i]);
			sum += (int)mapkey[i];
		}
		Arrays.sort(order);
		
		System.out.println(sum);
		for(int i = 0; i < 5; i++) System.out.print(order[i] + " ");
	}

}
