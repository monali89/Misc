package hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class SpecialPalindromeAgain {

	public static void main(String[] args) {

		System.out.println(isSpecial("aaa"));
		
	}
	
	 static long substrCount(int n, String s) {
		 
		 long count = s.length();
		 
		 char[] arr = s.toCharArray();
		 
		 for(int i=0; i<arr.length-1; i++){
			 if(arr[i] == arr[i+1]){
				 count++;
			 }
		 }
		 
		 
		 
		 return count;
	 }
	 
	 public static int substrCount(String str){
		 
		 char[] s = str.toCharArray();
		 
		 int ans = s.length;
		 
		 for(int i=0; i<s.length; i++){
			 
		 }
		 
		 return 0;
	 }
	 
	 public static boolean isSpecial(String s){
		 
		 char[] arr = s.toCharArray();
		//Get char counts
		 HashMap<Character, Integer> charCnt = new HashMap<Character, Integer>();
		 
		 for(int i=0; i<arr.length; i++){
			 if(charCnt.containsKey(arr[i])){
				 int currCnt = charCnt.get(arr[i]);
				 charCnt.put(arr[i], currCnt+1);
			 }else{
				 charCnt.put(arr[i], 1);
			 }
		 }
		 
		 if(charCnt.size() == 1){
			 return true;
		 }else if(charCnt.size() == 2){
			 for(Character chr: charCnt.keySet()){
				 if(charCnt.get(chr) == 1){
					 if(arr[0] == chr){
						 return false;
					 }else if(arr[arr.length-1] == chr){
						 return false;
					 }else if(charCnt.get(chr) == arr[arr.length/2-1]){
						 return true;
					 }
				 }
				 
			 } 
		 }else{
			 return false;
		 }
		return false;
	 }

}
