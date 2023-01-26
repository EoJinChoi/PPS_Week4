package Solution;

import java.io.*;
import java.util.ArrayList;

public class Main { // 20230119

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] serialNum = new String[N];
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++)
			list.add(br.readLine());
		
		int min = 51;
		int idx = 0;
		while(!list.isEmpty()) {
			min = 51;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).length() < min) {
					min = list.get(i).length();
					idx = i;
				}
				else if(list.get(i).length() == min) {
					String s = list.get(i).replaceAll("[^0-9]", "");
					int sum1 = 0;
					for(int j = 0; j < s.length(); j++)
						sum1 += (s.charAt(j) - 48);
					
					s = list.get(idx).replaceAll("[^0-9]", "");
					int sum2 = 0;
					for(int j = 0; j < s.length(); j++)
						sum2 += (s.charAt(j) - 48);
					
					if(sum1 < sum2) idx = i;
					else if(sum1 == sum2) {
						if(list.get(i).compareTo(list.get(idx)) < 0) idx = i;
					}
				}
			}
			System.out.println(list.get(idx));
			list.remove(idx);
		}
	}

}
