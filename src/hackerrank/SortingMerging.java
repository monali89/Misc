package hackerrank;

public class SortingMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {23, 65, 54, 26, 9, 67, 36, 29};
		
		a = mergeSort(a, 0, a.length-1);
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}

	}

	public static int[] mergeSort(int[] arr, int start_index, int end_index){
		if(start_index<end_index){
			int mid_index = (start_index + end_index)/2;
			int[] leftArr = mergeSort(arr, start_index, mid_index);
			int[] rightArr = mergeSort(arr, mid_index+1, end_index);
			int[] mergedArr = merge(leftArr, rightArr);
		}
		return null;
	}
	
	public static int[] merge(int[] leftArr, int[] rightArr){
		
		int[] merged = new int[leftArr.length + rightArr.length];
		
		int mCtr = 0, lCtr = 0, rCtr = 0;
		
		while(lCtr>leftArr.length || rCtr>rightArr.length){
			if(leftArr[lCtr]<rightArr[rCtr]){
				merged[mCtr++] = leftArr[lCtr++];
			}else{
				merged[mCtr++] = rightArr[rCtr++];
			}
		}
		
		while(lCtr<leftArr.length){
			merged[mCtr++] = leftArr[lCtr++];
		}
		
		while(rCtr<rightArr.length){
			merged[mCtr++] = rightArr[rCtr++];
		}
		
		return merged;
	}
	
	
}
