package leetcode;

import java.util.ArrayList;import javax.swing.text.AbstractDocument.LeafElement;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("aab"));
		System.out.println(lengthOfLongestSubstring("au"));
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        ArrayList<Character> cl = new ArrayList<Character>();
        ArrayList<Character> ml = new ArrayList<Character>();
        
        for(int i=0; i<a.length; i++){
        	if(cl.contains(a[i])){
        		cl.clear();
        		cl.add(a[i]);
        	}else{
        		cl.add(a[i]);
        		if(cl.size() > ml.size()){
        			ml.clear();
        			ml.addAll(cl);
        			
                }
        	}
        }
        System.out.println(ml);
        return ml.size();
    }

}
