package hackerrank;

public class MinimumTimeRequired {

	public static void main(String[] args) {
		long[] m = new long[]{4,5,6};
		long g = 12;
		System.out.println(minTime(m,g));
	}
	
	static long minTime(long[] machines, long goal) {
		double sum = 0;
		long days = 0;
		while(sum <= goal){
			for(int i=0; i<machines.length; i++){
				sum = sum + (double)1/machines[i];
				System.out.println("LOG: 1 day for m - " + (double)1/machines[i]);
			}
			System.out.println("LOG: sum - " + sum);
			days++;
		}
		return days;
    }

}
