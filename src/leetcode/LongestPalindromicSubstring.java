package leetcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println("babad - " + longestPalindrome("babad"));
		System.out.println("cbbd - " + longestPalindrome("cbbd"));
		System.out.println("b - " + longestPalindrome("b"));
		System.out.println("aaaaaa - " + longestPalindrome("aaaaaa"));
		System.out.println("\"\" - " + longestPalindrome(""));
		System.out.println("ac - " + longestPalindrome("ac"));
	}
	
	public static String longestPalindrome(String s) {
        
		if(s.length() == 0 || s.length() == 1){
			return s;
		}
		
		String p_temp = "";
		String p = "";
		char[] a = s.toCharArray();
		p = String.valueOf(a[0]);
		
		for(int i=0; i<a.length; i++){
			p_temp = String.valueOf(a[i]);
			for(int j=i+1; j<a.length; j++){
				p_temp = p_temp + String.valueOf(a[j]);
				if(isReverse(p_temp) && p_temp.length()>p.length()){
					p = p_temp;
				}
			}
		}
		return p;
    }
	
	public static boolean isReverse(String s){
		char[] a = s.toCharArray();
		int r = a.length-1;
		int l = 0;
		while(l<=r){
			if(!(a[l++] == a[r--])){
				return false;
			}
		}
		return true;
	}

}
