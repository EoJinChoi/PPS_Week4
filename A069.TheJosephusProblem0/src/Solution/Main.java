package Solution;

import java.util.*;

public class Main { // 20230116

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        Queue<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");
        
        int N = s.nextInt();
        int K = s.nextInt();
        
        for(int i = 1; i <= N; i++) list.add(i);
        
        while(!list.isEmpty()) {
//            if(idx > list.size() - 1) idx = 0;
//            cnt++;
//            idx++;
//            if(idx > list.size() - 1) idx = 0;
//            if(cnt == K) {
//                sb.append(list.get(idx)).append(", ");
//                list.remove(idx);
//                cnt = 1;
//            }
        	for(int i = 0; i < K - 1; i++) {
	        	int n = list.poll();
	        	list.add(n);
        	}
        	sb.append(list.poll()).append(", ");
        }
        
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb);
	}

}
