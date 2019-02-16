package leetcode;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println("abcabcbb - " + lengthOfLongestSubstring("abcabcbb"));
		System.out.println("aab - " + lengthOfLongestSubstring("aab"));
		System.out.println("au - " + lengthOfLongestSubstring("au"));
		System.out.println("dvdf - " + lengthOfLongestSubstring("dvdf"));
		System.out.println("\"\" - " + lengthOfLongestSubstring(""));
		System.out.println("bbbbb - " + lengthOfLongestSubstring("bbbbbb"));
		System.out.println("pwwkew - " + lengthOfLongestSubstring("pwwkew"));
	}
	
	public static int lengthOfLongestSubstring(String str) {
		int max_current = 0;
		int max_temp = 0;
		char[] a = str.toCharArray();
		HashSet<Character> s = new HashSet<Character>();
		for(int i=0; i<a.length; i++){
			s.clear();
			s.add(a[i]);
			int j=i+1;
			while(j<a.length && !s.contains(a[j])){
				s.add(a[j]);
				j++;
			}
			max_temp = s.size();
			if(max_temp > max_current){
				max_current = s.size();
			}
		}
		return max_current;
    }

}
