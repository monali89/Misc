package leetcode;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArray {

	@Test
	public void testForSingleElementArray(){
		Assert.assertEquals(1, removeDuplicates(new int[]{22}));
	}
	
	@Test
	public void testForEmptyArray(){
		Assert.assertEquals(0, removeDuplicates(new int[]{}));
	}
	
	@Test
	public void testForAnyArray_1(){
		Assert.assertEquals(2, removeDuplicates(new int[]{1,1,2}));
	}
	
	@Test
	public void testForAnyArray_2(){
		Assert.assertEquals(4, removeDuplicates(new int[]{1,2,3,3,3,3,4}));
	}
	
	public int removeDuplicates(int[] nums) {
        if(nums.length < 1){
                return 0;
        }
        int len = 1;
        for(int i=0; i<nums.length-1; i++){
        	
        }
        return len;
    }	
	
}
