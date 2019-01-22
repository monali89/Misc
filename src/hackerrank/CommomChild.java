package practice;

public class CommomChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(commonChild("shinchan", "noharaaa"));
	}
	
	static int commonChild(String s1, String s2) {
		
		char[] aArr1 = s1.toCharArray();
		char[] aArr2 = s2.toCharArray();
		
		int ctr1 = 0;
		int ctr2 = 0;
		
		while((ctr1>=aArr1.length) || (ctr2>=aArr2.length)){
			if(aArr1[ctr1] == aArr2[ctr2]){
				
			}
		}
		
		return 0;
	}
	
static int commonChild2(String s1, String s2) {
        
        int length = 0, maxLength = 0;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        
        for(int i=0; i<a1.length; i++){
        	System.out.println("For string 1 char - " + a1[i]);
        	System.out.println("Max length before - " + maxLength);
            for(int j=0; j<a2.length; j++){
            	System.out.println("For string 2 char - " + a2[j]);
                if(a1[i] == a2[j]){
                	System.out.println("String characters match - " + a1[i]);
                    length++;
                }
            }
            if(length > maxLength){
            	maxLength = length;
            }
            System.out.println("Max length after - " + maxLength);
            System.out.println();
            length = 0;
        }
		return maxLength;

    }

}
