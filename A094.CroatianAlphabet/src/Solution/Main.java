package Solution;

import java.io.*;

public class Main { // 20230120

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = br.readLine();
		
		for(int i = 0; i < alphabet.length; i++) {
			if(str.contains(alphabet[i])) {
				str = str.replaceAll(alphabet[i], "a");
			}
		}
		
		System.out.println(str.length());
	}

}
