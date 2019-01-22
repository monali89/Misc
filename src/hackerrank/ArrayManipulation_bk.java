package practice;

public class ArrayManipulation_bk {

	static long arrayManipulation(int n, int[][] queries) {

		// Create 0's array
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = 0;
		}

		System.out.print("Array: ");
		for (int k = 0; k < n; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();

		// Initialize max variable
		long max = 0;
		// int arrCtr = 0;

		for (int i = 0; i < queries.length; i++) {

			int start = queries[i][0] - 1;
			int end = queries[i][1] - 1;
			int addNum = queries[i][2];
			System.out.println("start= " + start + ", end=" + end + ", addNum=" + addNum);

			for (int j = start; j <= end; j++) {
				System.out.println("In for: arr[" + j + "]=" + arr[j]);
				arr[j] = arr[j] + addNum;
				System.out.println("In for: arr[" + j + "]=" + arr[j]);
				if (max <= arr[j]) {
					System.out.println("In for: max=" + max + " is less than arr[" + j + "]=" + arr[j]);
					max = arr[j];
					System.out.println("In for: max=" + max);
				}
			}
			System.out.print("Array: ");
			for (int k = 0; k < n; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("Returning max=" + max);
		return max;
	}

	static long arrayManipulation2(int n, int[][] queries) {

		int largestStart = 0, smallestEnd = n, addNum = 0;

		for (int i = 0; i < queries.length; i++) {

			System.out.println("i= " + i + ", largestStart=" + largestStart + ", smallestEnd=" + smallestEnd
					+ ", addNum=" + addNum + ", queries[i][2]=" + queries[i][2]);
			
			if((queries[i][2]>addNum) && (queries[i][0] == queries[i][1])){
				
				System.out.println("In if equal");
				largestStart = smallestEnd = queries[i][0];
				addNum = queries[i][2];
				
			}else{
					if (largestStart <= queries[i][0] - 1) {
						largestStart = queries[i][0] - 1;
					}

					if (smallestEnd >= queries[i][1] - 1) {
						smallestEnd = queries[i][1] - 1;
					}

					if (largestStart <= smallestEnd) {
						addNum = addNum + queries[i][2];
					}
				}
				
			

			System.out.println("i= " + i + ", largestStart=" + largestStart + ", smallestEnd=" + smallestEnd
					+ ", addNum=" + addNum);
			System.out.println();

		}
		return addNum;

	}

	public static void main(String[] args) {

		int[][] queries = {
				
				/*{7,10,10}, {5,8,10}, {1,4,10}, {3,6,10}, {4,9,10}*/
				
				{1,2,100}, {2,5,100}, {3,4,100}
				
				/* {2,2,603}, {1,1,286}, {4,4,882}, {4,5,800}*/
				 
				/*{ 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } */
				 };
				 

		System.out.println("Answer: " + arrayManipulation2(10, queries));

	}

}
