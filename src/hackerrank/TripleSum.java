package hackerrank;

import java.util.Arrays;

public class TripleSum {

	public static void main(String[] args) {
		
		int[] a = new int[]{3,5,7};
		int[] b = new int[]{3,6};
		int[] c = new int[]{4,6,9};

		System.out.println("RESULT: " + triplets(a,b,c));
	}
	
	static long triplets(int[] a, int[] b, int[] c) {
		Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int a_count=0, c_count=0;
        int a_ctr=0, c_ctr=0;
        for(int i=0; i<b.length; i++){
            while(a[a_ctr]<b[i]){
                a_count++;
                a_ctr++;
            }
            while(c[c_ctr]<b[i]){
                c_count++;
                c_ctr++;
            }
        }
        return a_count*c_count;
	}
	
	
	

	static long triplets_bk(int[] a, int[] b, int[] c) {
        
        int count = 0;
        int ai=0, bi=0, ci=0;
        
        while(ai<a.length){
            while(bi<b.length && b[bi]<a[ai]){
                bi++;
            }
            if(bi<b.length){
                while(ci<c.length && b[bi]<c[ci]){
                    ci++;
                }
                if(ci<c.length){
                    System.out.println("Count Increased, " + a[ai] + " " + b[bi] + " " + c[ci]);
                    count++;
                }
            }
            System.out.println("Debug: ai, bi, ci - " + ai + " " + bi + " " + ci);
            System.out.println();
            bi = 0; ci = 0;
            ai++;
        }
        return count;
    }
	
}
