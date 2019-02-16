package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterComboOfPhoneNum {

	public static void main(String[] args) {
		Set<Character> s1 = new HashSet<Character>();
		s1.add('a');
		s1.add('b');
		s1.add('c');
		Set<Character> s2 = new HashSet<Character>();
		s2.add('d');
		s2.add('e');
		s2.add('f');
		
		s1.addAll(s2);
		System.out.println(s1);
		//System.out.println(s1.retainAll(s2));
		//System.out.println(s1.containsAll(s2));
	}
	
	public List<String> letterCombinations(String digits) {
        
		return null;
    }

}
