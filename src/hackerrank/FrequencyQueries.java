package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FrequencyQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static List<Integer> freqQuery(List<List<Integer>> queries) {
		
		List<Integer> rslt = new ArrayList<Integer>();
		HashMap<Integer, Integer> str = new HashMap<Integer, Integer>();
		
		for(int i=0; i<queries.size(); i++){
			
			List<Integer> curr = new ArrayList<Integer>();
			curr = queries.get(i);
			
			Integer op = curr.get(0);
			Integer num = curr.get(1);
			
			switch(op){
			case 1: 
				if(str.containsKey(num)){
					int count = str.get(num);
					str.put(num, count+1);
				}else{
					str.put(num, 1);
				}
				break;
			case 2:
				if(str.containsKey(num)){
					if(str.get(num) == 1){
						str.remove(num);
					}else{
						int count = str.get(num);
						str.put(num, count-1);
					}
				}
				break;
			case 3:
				if(str.containsValue(num)){
					rslt.add(1);
				}else{
					rslt.add(0);
				}
				break;
			default:
					break;
			}
		}
		
		return null;
    }

}
