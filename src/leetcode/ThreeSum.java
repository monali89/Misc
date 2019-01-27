package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		System.out.println(threeSum(new int[]{-2,0,1,1,2}));

	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		if(nums.length<3){
			return null;
		}
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++){
			for(int j=i+2; j<nums.length; j++){
				System.out.println("For - " + nums[i] + " " + nums[i+1] + " " + nums[j]);
				if(nums[i]+nums[i+1]+nums[j] == 0){
					List<Integer> ll = new ArrayList<Integer>();
					ll.add(nums[i]);
					ll.add(nums[i+1]);
					ll.add(nums[j]);
					if(!l.contains(ll)){
						System.out.println("Adding - " + ll);
						l.add(ll);
					}
					
				}
			}
		}
        return l;
    }

}
