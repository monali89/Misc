package hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class SherlockAndValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("aabbcd: " + isValid("aabbcd"));
		System.out.println("abcc: " + isValid("abcc"));
		System.out.println("abccc: " + isValid("abccc"));
	}

	static String isValid(String s) {

		char[] strArr = s.toCharArray();

		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (int i = 0; i < strArr.length; i++) {
			if (charMap.containsKey(strArr[i])) {
				Integer count = charMap.get(strArr[i]);
				charMap.put(strArr[i], count + 1);
			} else {
				charMap.put(strArr[i], 1);
			}
		}

		boolean status = true;
		int[] cnts = new int[charMap.size()];
		int ctr = 0;

		for (Character chr : charMap.keySet()) {
			cnts[ctr++] = (int) charMap.get(chr);
		}

		int check = 0;
		Arrays.sort(cnts);
		for (int i = 0; i < cnts.length - 1; i++) {
			/*if (Math.abs(cnts[i] - cnts[i + 1]) == 1) {
				check++;
			} else if (Math.abs(cnts[i] - cnts[i + 1]) > 1) {
				status = false;
			}*/
			if (Math.abs(cnts[i] - cnts[i + 1]) > 1) {
				status = false;
			}else if(cnts[i+1] > cnts[i]){
				check++;
				cnts[i+1]--;
			}
			
		}
		if (check > 1) {
			status = false;
		}

		if (status) {
			return ("YES");
		} else {
			return ("NO");
		}
	}

}
