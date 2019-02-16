package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class StringToInteger {
	
	@Test
	public void test1(){
		Assert.assertEquals(123345, myAtoi("123345"));
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(0, myAtoi("    word 546"));
	}
	
	@Test
	public void test3(){
		Assert.assertEquals(0, myAtoi("  +word 546"));
	}
	
	@Test
	public void test4(){
		Assert.assertEquals(-345, myAtoi("    -345 opadf"));
	}
	
	@Test
	public void test5(){
		Assert.assertEquals(Math.pow(2, 31), myAtoi("999999999999"));
	}
	
	public static int myAtoi(String str) {
	        
	        char[] a = str.trim().toCharArray();
	        
	        if(a.length<1){
	        	return 0;
	        }
	        
	        int rslt = 0, index = 0, sign = 1;
	        
	        if(a[0] == '-'){
	            sign = -1;
	            index = 1;
	        }else if(a[0] == '+'){
	            index = 1;
	        }
	        
	        if(index>=a.length || a[index]>'9' || a[index]<'0'){
	        	return 0;
	        }
	        
	        while(index<a.length && a[index]>='0' && a[index]<='9'){
	        	if(rslt<Integer.MAX_VALUE && Integer.toBinaryString(rslt).length()<11){
	        		rslt = rslt*10 + Character.getNumericValue(a[index++]);
	        	}else{
	        		rslt = Integer.MAX_VALUE;
	                break;
	        	}
	        }
	        return sign*rslt;
	    }

}
