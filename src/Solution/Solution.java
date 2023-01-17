package Solution;

public class Solution { // 20230116
	public static boolean isPalindrome(String s) {
        boolean p = true;
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        
        for(int i = 0; i < s.length() / 2; i++) {
        	if(s.charAt(i) != s.charAt(s.length() - i - 1)) p = false;
        }
        
//        System.out.println(p);
        return p;
    }
}
