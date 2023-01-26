package Solution;

import java.util.*;

public class Main { // 20230119

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		int start = s.nextInt();
		int end = s.nextInt();
		String[] str = new String[end - start + 1];
		int cnt = 0;
		
		for(int i = 0; i < str.length; i++) {
			int n = start;
			str[i] = "";
			
			String st = String.valueOf(n);
			for(int j = 0; j < st.length(); j++) {
				if(st.charAt(j) == '0') str[i] += "zero";
				else if(st.charAt(j) == '1') str[i] += "one";
				else if(st.charAt(j) == '2') str[i] += "two";
				else if(st.charAt(j) == '3') str[i] += "three";
				else if(st.charAt(j) == '4') str[i] += "four";
				else if(st.charAt(j) == '5') str[i] += "five";
				else if(st.charAt(j) == '6') str[i] += "six";
				else if(st.charAt(j) == '7') str[i] += "seven";
				else if(st.charAt(j) == '8') str[i] += "eight";
				else if(st.charAt(j) == '9') str[i] += "nine";
				
				str[i] += " ";
			}
			
			map.put(str[i], i + cnt + start);
			start++;
			cnt--;
		}
		List<String> keySet = new ArrayList<>(map.keySet());
		
		Collections.sort(keySet);
		
		int i = 1;
		for(String key : keySet) {
			System.out.print(map.get(key) + " ");
			if(i % 10 == 0) System.out.println();
			i++;
		}
	}

}
