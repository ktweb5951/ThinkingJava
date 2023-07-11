package com.kh.day12.sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {
		int [] nums = {5, 7, 2, 1, 4};
		
		//버블 정렬
		for(int i=0; i<(nums.length-1); i++) {
			for(int j=0; j<(nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		for(int i : nums) {
			System.out.print(i + " ");
		}
		
//		for(int i=0; i<nums.length; i++) {
//			if(i < (nums.length-1)) {
//				System.out.print(nums[i] + ", ");				
//			} else {
//				System.out.print(nums[i]);	
//			}
//		}
		
		
	}
}
