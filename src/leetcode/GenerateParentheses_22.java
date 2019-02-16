package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses_22 {

	public static void main(String[] args) {
		int num = 0;
		/*num = 1;
		System.out.println(num + " - " + generateParenthesis(num));
		num = 2;
		System.out.println(num + " - " + generateParenthesis(num));*/
		num = 3;
		System.out.println(num + " - " + generateParenthesis(num));
		
	}
	
	public static List<String> generateParenthesis(int n) {

		n = n*2;
		int ctr = 1;
		List<String> l = new ArrayList<String>();
		String s = "";
		Stack<Character> st = new Stack<Character>();
		
		for(int i=1; i<=n/2; i++){
			while(s.length()<n){
				while(ctr<=i){
					s = s + "(";
					st.push(')');
					ctr++;
				}
				while(!st.isEmpty()){
					s = s + String.valueOf(st.pop());
				}
				s = s + "(";
			}
			
			ctr = 1;
			l.add(s);
			s = "";
		}
		return l;
	}

}
