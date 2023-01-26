package Solution;

import java.io.*;
import java.util.*;

public class Main { // 20230116

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			
			if(s.contains("push"))
				q.add(Integer.valueOf(s.substring(s.indexOf(' ') + 1)));
			else if(s.equals("pop")) {
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.remove()).append("\n");
			}
			else if(s.equals("size")) {
				sb.append(q.size()).append("\n");
			}
			else if(s.equals("empty")) {
				if(q.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			}
			else if(s.equals("front")) {
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.getFirst()).append("\n");
			}
			else if(s.equals("back")) {
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.getLast()).append("\n");
			}
		}
		System.out.println(sb);
	}
}
