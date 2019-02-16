package leetcode;

import java.util.HashSet;
import java.util.Observable;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a list of non-negative numbers and a target integer k, 
 * write a function to check if the array has a continuous sub-array 
 * of size at least 2 that sums up to the multiple of k, that is, 
 * sums up to n*k where n is also an integer.
 * (M)
 * */

public class ContinuousSubarraySum {

	@Test
	public void test01(){
		Assert.assertEquals(true, checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
	}
	
	@Test
	public void test02(){
		Assert.assertEquals(true, checkSubarraySum(new int[]{23, 6, 1, 4}, 6));
	}
	
	@Test
	public void test03(){
		Assert.assertEquals(false, checkSubarraySum(new int[]{}, 6));
	}
	
	@Test
	public void test04(){
		Assert.assertEquals(false, checkSubarraySum(new int[]{0, 0, 0, 0}, 1));
	}
	
	@Test
	public void test05(){
		Assert.assertEquals(true, checkSubarraySum(new int[]{23, 7, 4, 2}, 6));
	}

	
	public boolean checkSubarraySum(int[] nums, int k) {
		
		if(nums.length<=1 || k==0){
			return false;
		}
		
		int sum = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<nums.length; i++){
			if((sum+nums[i]%k) == 0){
				sum = sum + nums[i];
				set.add(nums[i]);
				if(set.size() >= 2){
					return true;
				}
			}else{
				set.clear();
				set.add(nums[i]);
			}
		}
		if(set.size() >= 2){
			return true;
		}
		
        return false;
    }
}


















