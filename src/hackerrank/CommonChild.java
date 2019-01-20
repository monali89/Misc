package hackerrank;

public class CommonChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(commonChild("abab", "baba"));
	}
	
	static int commonChild(String s1, String s2) {
		
		int m = s1.length()+1;
		int n = s2.length()+1;
		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		int result = 0;
		
		int[][] arr = new int[m][n];
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(i==0 || j==0){
					arr[i][j] = 0;
				}else if(x[i-1] == y[j-1]){
					arr[i][j] = arr[i-1][j-1] + 1;
					result = Math.max(result, arr[i][j]);
				}else{
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		return result;
	}

}
