package leetcode;

import java.util.ArrayList;

public class ZigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING",4));
	}
	
public static String convert(String s, int numRows) {
        
        ArrayList<Character[]> final_list = new ArrayList<Character[]>();
        Character[] ai = new Character[numRows];
        boolean is_diagonal = false;
        int before_spaces = 0, after_spaces = 0;
        char[] a = s.toCharArray();
        
        int i = 0;
        
        while(i<a.length){
            if(is_diagonal){
                int j = 0;
                for(int x=0; x<before_spaces; x++){
                    ai[j++] = ' ';
                }
                before_spaces--;
                ai[j++] = a[i++];
                for(int x=0; x<after_spaces; x++){
                    ai[j++] = ' ';
                }
                after_spaces++;
                if(before_spaces == 0){
                    is_diagonal = false;
                }                   
            }else{
                int j=0;
                while(j<numRows && i<a.length){
                    ai[j] = a[i];
                    j++;
                    i++;
                }
                is_diagonal = true;
                after_spaces = 1;
                before_spaces = numRows - after_spaces - 1;
            }
            for(int m=0; m<ai.length; m++){
        		System.out.print(ai[m] + " ");
        	}
            System.out.println();
            final_list.add(ai);
        }
        /*for(int n=0; n<final_list.size(); n++){
        	Character[] temp_a = final_list.get(n);
        	for(int m=0; m<temp_a.length; m++){
        		System.out.print(temp_a[m] + " ");
        	}
        	System.out.println();
        }*/
        
        String ans = "";
        for(int n=0; n<numRows; n++){
            for(int j=0; j<final_list.size(); j++){
                Character[] temp_a = final_list.get(j);
                for(int m=0; m<final_list.size(); m++){
                	if(temp_a[n] != ' '){
                        ans = ans + temp_a[n];
                    }
                }
            }
            System.out.println(ans);
        } 
    return ans;
    }

}
