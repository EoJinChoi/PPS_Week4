package Solution;

import java.io.*;
import java.util.Arrays;

public class Main { // 20230118

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		String[] arr = new String[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			arr[i] = word.substring(i);
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < word.length(); i++) 
			System.out.println(arr[i]);
	}

}
