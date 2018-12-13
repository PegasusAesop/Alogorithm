package com.aesop.algorithm.twoofsum;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s=new Solution();
		
		System.out.println(s.findTarget(new int[] {4,5,7,10}, 12));
	//	System.out.println(s.findTarget(new int[] {4,5,7,10}, 8));
	//	System.out.println(s.findTarget(new int[] {4,4,7,10}, 8));
	//	System.out.println(s.findTarget(new int[] {22,4,8,10}, 12));
	//	System.out.println(s.findTarget(new int[] {4,-5,8,10}, 2));
	//	System.out.println(s.findTarget(new int[] {4,-5,7,10}, 2));
	//	System.out.println(s.findTarget(new int[] {}, 12));
		
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(15);
		set.add(10);
		set.add(-1);
		set.add(-14);
		
		set.stream().forEach(System.out::println);
		
	}

}

class Solution{
	
	public boolean findTarget(int[] nums,int target) {
		
		Set<Integer> appeared=new HashSet<>();
		
		for(int num:nums) {
			
			if(appeared.contains(target-num)) {
				
				return true;
			}
			
			appeared.add(num);
		}
	
		return false;
	}
}