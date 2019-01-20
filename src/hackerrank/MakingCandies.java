package hackerrank;

public class MakingCandies {

	public static void main(String[] args) {
		
		System.out.println(minimumPasses(1,2,1,60));
		
	}
	
	static long minimumPasses(long m, long w, long p, long n) {

		long n1 = m;
		long n2 = w;
		long x = p;
		long M = n1 * n2;
		long counter = 1;
		long M_aux = 0;
		
		while(M<=n){
			
			
			
			counter++;
			if(M%x == 0){
				M_aux = M;
				M = 0;
			}else{
				M_aux = M - M%x;
				M = M%x;
			}
			long no = M_aux/x;
			n1 = n1 + no/2;
			n2 = n2 + no/2;
			if(no%2 != 0){
				long max = Math.max(n1, n2);
				n1 = n1 + no/2;
				n2 = n2 + no/2;
				if(max == n1){
					n1++;
				}else{
					n2++;
				}
			}
		}
		return counter;
    }

}
