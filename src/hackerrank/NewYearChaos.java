package hackerrank;

public class NewYearChaos {

	public static void main(String[] args) {

		minimumBribes(new int[]{1,2,5,3,7,8,6,4});

	}

	static void minimumBribes(int[] q) {

		boolean status = false;
		int actual = -1, expected = -1;
		int[] swapArr = new int[q.length];
		int total_swaps = 0;
		
		for(int i=0; i<q.length; i++){
			swapArr[i] = 0;
		}
		
		for(int j=0; j<q.length-1; j++){
			for(int i=j; i<q.length-1; i++){
				actual = q[i];
				expected = i+1;
				if((actual != expected) && actual > q[i+1]){
					//swap a[i] and a[i+1]
					int temp = q[i];
					q[i] = q[i+1];
					q[i+1] = temp;
					swapArr[actual-1] = swapArr[actual-1] + 1;
				}
				for(int k=0; k<q.length; k++){
					System.out.print(q[k] + " ");
				}
				System.out.println();
			}
		}
		
		
		
		for(int i=0; i<q.length; i++){
			total_swaps = total_swaps + swapArr[i];
			if(swapArr[i]>2){
				status = true;
				break;
			}	
		}		
		
		if(status){
			System.out.println("Too chaotic");
		}else{
			System.out.println(total_swaps);
		}	
		
		for(int i=0; i<q.length; i++){
			System.out.print(q[i] + " ");
		}
		System.out.println();
		for(int i=0; i<q.length; i++){
			System.out.print(swapArr[i] + " ");
		}
		System.out.println();
		
    }
	
}
