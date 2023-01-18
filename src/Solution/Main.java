package Solution;

import java.io.*;
import java.util.*;

public class Main { // 20230118

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[][] info = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			info[i][0] = s[0];
			info[i][1] = s[1];
		}
		
		Arrays.sort(info, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				if(s1[0] == s2[0]) return 1;
				else return(Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]));
			}
		});
		
		for(int i = 0; i < N; i++)
			System.out.println(info[i][0] + " " + info[i][1]);
	}

}
