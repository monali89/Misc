package hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class Any {

	public static void main(String[] args) {
		
		//int[] a = insertionSort(new int[]{31,41,59,26,41,58});
		
		/*for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}*/
		int[] a = new int[]{3,5,1,1,4,2,3};
		System.out.println(sumDiff(a, 6, "Sum"));
		
	}
	
	public static int sumDiff(int[] arr, int num, String op){

		int start = 0, end = arr.length-1;
		int count = 0;
		Arrays.sort(arr);
		
		switch(op){
		case("Sum"):
			
			while(start<end){
				if(arr[start]+arr[end] == num){
					count++;
					start++;
					end--;
				}else if(arr[start]+arr[end] >= num){
					end--;
				}else if(arr[start]+arr[end] <= num){
					start++;
				}
			}
			
			break;
		case("Diff"):			
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
		
		return count;
	}
	
	
	public static int[] insertionSort(int[] arr){
		
		for(int i=1; i<arr.length; i++){ 
			for(int j=0; j<arr.length; j++){
				if(arr[i]>arr[j]){
					//swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	

	static String twoStrings(String s1, String s2) {

		HashMap<Character, Boolean> result = new HashMap<Character, Boolean>();
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		boolean status = false;

		if (s1.length() < s2.length()) {
			for (int i = 0; i < s1Arr.length; i++) {
				result.put(s1Arr[i], (Boolean) false);
			}
			System.out.println("result: " + result.toString());
			for (int i = 0; i < s2Arr.length; i++) {
				System.out.println("s2Arr - " + s2Arr[i]);
				if (result.containsKey(s2Arr[i])) {
					status = true;
				}
			}

		} else {
			for (int i = 0; i < s2Arr.length; i++) {
				result.put(s2Arr[i], (Boolean) false);
			}
			System.out.println("result: " + result.toString());

			for (int i = 0; i < s1Arr.length; i++) {
				if (result.containsKey(s1Arr[i])) {
					status = true;
				}
			}
		}

		if (status) {
			return ("YES");
		} else {
			return ("NO");
		}
	}

}
