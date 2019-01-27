package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long r = 2;

        long[] a = new long[]{1,2,2,4};
        
        List<Long> a2 = new ArrayList<Long>();
        a2.add((long) 1);
        a2.add((long) 2);
        a2.add((long) 2);
        a2.add((long) 4);
        
        System.out.println(countTriplets2(a2, r));
	}
	
	
	static long countTriplets2(List<Long> arr, long r) {
		
		long[] a;
		arr.toArray();
		
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		int ctr = 0;
		
		for(int i=0; i<arr.size(); i++){
			if(map.containsKey(arr.get(i))){
				map.put(arr.get(i), map.get(arr.get(i))+1);
			}else{
				map.put(arr.get(i), 1);
			}
		}
		
		for(int i=0; i<arr.size(); i++){
			
			if(map.containsKey(arr.get(i))){
				if(map.containsKey(arr.get(i)*r) && map.containsKey(arr.get(i)*r*r)){
					ctr = ctr + Math.max(map.get(arr.get(i)*r), map.get(arr.get(i)*r*r));
				}
			}
		}
		
		System.out.println(map.keySet().toString());
		
		return ctr;
	}
	
	static long countTriplets(List<Long> arr, long r) {
		
		long fCtr = 0;
		int ctr = 0;
		long num1 = 0, num2 = 0, num3 = 0;
		int a1=-1, a2=-1, a3=-1;
		
		for(int i=0; i<arr.size(); i++){
			System.out.println("-------------------------");
			System.out.println("For i - " + arr.get(i));
			for(int j=i+1; j<arr.size(); j++){
				System.out.println("For j - " + arr.get(j) + ", ctr - " + ctr);
				if( ctr==0 && (arr.get(i)*r == arr.get(j))){
					num1 = arr.get(i);
					num2 = arr.get(j);
					a1 = i; a2 = j;
					ctr++;
					System.out.println("Increasing CTR");
				}else if(ctr==1 && (arr.get(i)*r*r) == arr.get(j)){
					num3 = arr.get(j);
					a3 = j;
					ctr++;
					System.out.println("Increasing CTR 2nd time");
				}/*else{
					ctr--;
				}*/
				if(ctr == 2){
					System.out.println(a1 + " " + a2 + " " + a3);
					System.out.println(num1 + " " + num2 + " " + num3);
					System.out.println();
					fCtr++;
					ctr = 1;
					num3 = 0;
					a3=-1;
				}/*else if(ctr == 1){
					ctr = 1;
				}*/
			}
			if(ctr == 1){
				ctr = 0;
			}
		}
		
		return fCtr;
    }

}
