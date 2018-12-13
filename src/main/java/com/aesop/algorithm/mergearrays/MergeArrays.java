package com.aesop.algorithm.mergearrays;

public class MergeArrays {

	public void mergeArrays(int[] nums1,int length1,int[] nums2,int length2) {
		
		int pos1=length1-1;
		int pos2=length2-1;
		int last=nums1.length-1;
		
		while(last!=-1) {
			
			if(pos1==-1 || (pos2!=-1 && nums1[pos1]<nums2[pos2])) {
				
				nums1[last--]=nums2[pos2--];
				
			}else {
				
				nums1[last--]=nums1[pos1--];
			}
		}
		for(int i:nums1) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		MergeArrays ma=new MergeArrays();
		int[] nums1= {2,5,7,9,0,0,0};
		int[] nums2= {1,6,13};
		
		ma.mergeArrays(nums1, 4, nums2, 3);
	}
}
