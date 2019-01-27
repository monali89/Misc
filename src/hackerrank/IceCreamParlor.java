package hackerrank;

import java.util.HashMap;

public class IceCreamParlor {

	public static void main(String[] args) {

		int[] a = new int[]{1, 4, 5, 3, 2};
		whatFlavors(a, 4);
	}
	
	 static void whatFlavors(int[] cost, int money) {
	        
		 HashMap<Integer, Integer> money_map = new HashMap<Integer, Integer>();
		 		 
		 for(int i=0; i<cost.length; i++){
			 if(cost[i]<money){
				 money_map.put(cost[i], money-cost[i]);
			 }
			 
		 }
		 
		 int index1 = -1, index2 = -1;
		 for(int i=0; i<cost.length; i++){
			 if(index1 == -1){
				 if(money_map.containsKey(cost[i])){
					 System.out.println("Has key - " + cost[i]);
					 index1 = i+1;
				 }
			 }else{
				 if(money_map.containsValue(cost[i])){
					 System.out.println("Has value - " + cost[i]);
					 index2 = i+1;
					 break;
				 }
			 }
		 }
		 System.out.println(index1 + " " + index2);
	 }

}
