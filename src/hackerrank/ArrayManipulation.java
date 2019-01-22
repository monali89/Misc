package practice;

public class ArrayManipulation {
	
	public static void main(String[] args) {

		int[][] queries = {
				
				/*{1,5,3}, {4,8,7}, {6,9,1}*/
				
				/*{7,10,10}, {5,8,10}, {1,4,10}, {3,6,10}, {4,9,10}*/
				
				/*{1,2,100}, {2,5,100}, {3,4,100}*/
				
				/* {2,2,603}, {1,1,286}, {4,4,882}, {4,5,800}*/
				 
				{ 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } 
				 };
				 
		System.out.println("Answer: " + arrayManipulation4(10, queries));
	}
	
	static long arrayManipulation(int n, int[][] q) {
		
		int start = 0, end = n-1;
		long max = 0;
		
		for(int i=0; i<q.length; i++){
			
			if(q[i][2] > max){
				if(q[i][0]>start){
					start = q[i][0];
				}
				
				
				
				if(q[i][1]<end){
					end = q[i][1];
				}
			}
			
			
			
		}
		
		return 0;
	}
	

	static long arrayManipulation0(int n, int[][] q) {

		int[] r = new int[n];
		long max = -1;
		
		for(int i=0; i<r.length; i++){
			r[i] = 0;
		}
		
		for(int i=0; i<q.length; i++){
			int start = q[i][0]-1;
			int end = q[i][1]-1;
			int num = q[i][2];
			for(int j=start; j<=end; j++){
				r[j] = r[j] + num;
				if(r[j] > max){
					max = r[j];
				}
			}
		}
		return max;
	}
	
	static long arrayManipulation2(int n, int[][] q) {
	
		int[] r = new int[n];
		long max = q[0][2];
		
		for(int i=0; i<r.length; i++){
			r[i] = 0;
		}
		
		for(int i=0 ;i<q.length; i++){
			
			int start = q[i][0];
			int end = q[i][1];
			int num = q[i][2];
			
			for(int j=i+1 ;j<q.length; j++){
		
				int start2 = q[j][0];
				int end2 = q[j][1];
				int num2 = q[j][2];
				
				System.out.println("Comparing {" + start + ", " + end + ", " + num + "} and {" + start2 + ", " + end2 + ", " + num2 + "}");
				
				if( ((start<=start2) && (end>=start2)) || ((start2<=start) && (end2>=start)) ){
					System.out.println("Overlapping indexes");
					int this_num = num+num2;
					//max = max + Math.max(max, this_num);
					if( max > this_num ){
						//
						max = max + q[j][2];
					}else{
						max = max + this_num - q[i][2];
					}
				}else{
					System.out.println("Disjoint indexes");
					max = Math.max(max, Math.max(num, num2));
				}
				System.out.println("Max: " + max);
			}
		}
		
		return max;
	}

	static long arrayManipulation3(int n, int[][] q) {
		
		int[] r = new int[n];
		long max = q[0][2];
		
		for(int i=0; i<r.length; i++){
			r[i] = 0;
		}
		
		for(int i=0 ;i<q.length-1; i++){
			
			int start = q[i][0];
			int end = q[i][1];
			int num = q[i][2];
			
			int start2 = q[i+1][0];
			int end2 = q[i+1][1];
			int num2 = q[i+1][2];
				
			System.out.println("Comparing {" + start + ", " + end + ", " + num + "} and {" + start2 + ", " + end2 + ", " + num2 + "}");
			
			if( ((start<=start2) && (end>=start2)) || ((start2<=start) && (end2>=start)) ){
				System.out.println("Overlapping indexes");
				int this_num = num+num2;
				max = max + num2;
			}else{
				System.out.println("Disjoint indexes");
				max = Math.max(max, Math.max(num, num2));
			}
			System.out.println("Max: " + max);
			
		}
		
		return max;
	}
	
	static long arrayManipulation4(int n, int[][] q) {
		
		int max = q[0][2];
		int groupMax = 0;
		
		for(int i=0 ;i<q.length; i++){
			
			int start = q[i][0];
			int end = q[i][1];
			int num = q[i][2];
			groupMax = 0;
			
			for(int j=i+1 ;j<q.length; j++){
		
				int start2 = q[j][0];
				int end2 = q[j][1];
				int num2 = q[j][2];
				
				System.out.println("Comparing {" + start + ", " + end + ", " + num + "} and {" + start2 + ", " + end2 + ", " + num2 + "}");
				
				if( ((start<=start2) && (end>=start2)) || ((start2<=start) && (end2>=start)) ){
					System.out.println("Overlapping indexes");
					groupMax = Math.max(max, max+num+num2);
					
				}else{
					groupMax = Math.max(max, num+num2);
					System.out.println("Disjoint indexes");
				}
				System.out.println("groupMax: " + groupMax);
			}
			max = Math.max(max, groupMax);
			System.out.println("Max: " + max);
		}
		return max;
	}
	
	

	

}
