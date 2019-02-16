package leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String check = "";
		check = "([{}])";
		System.out.println(check + " - " + isValid(check));
		check = "((((";
		System.out.println(check + " - " + isValid(check));
		check = ")))))";
		System.out.println(check + " - " + isValid(check));
		check = "[(]){}";
		System.out.println(check + " - " + isValid(check));
	}
	
	public static boolean isValid(String s) {
        
		if(s.length() == 0 || s.length() == 1){
			return false;
		}
		char[] a = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		int ctr = 0;
		while(ctr<a.length){
			if((a[ctr] == '[') || (a[ctr] == '(') || (a[ctr] == '{')){
				st.push(a[ctr]);
			}else{
				if(a[ctr] == ']' && (st.isEmpty() || st.pop() != '[')){
					return false;
				}
				if(a[ctr] == ')' && (st.isEmpty() || st.pop() != '(')){
					return false;
				}
				if(a[ctr] == '}' && (st.isEmpty() || st.pop() != '{')){
					return false;
				}
			}
			ctr++;
		}
		if(st.isEmpty()){
			return true;
		}
		return false;	
    }

}
