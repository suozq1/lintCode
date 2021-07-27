package com.suo.array;

public class SecondMax {
	 public static int secondMax(int[] nums) {
	        // write your code here
	        int index=0,temp;
	        for(int i=0;i<2;i++){
	            for(int j=i;j<nums.length;j++){
	                if(nums[index]<nums[j]){
	                    index=j;
	                }
	            }
	            temp = nums[i];
	            nums[i]=nums[index];
	            nums[index]=temp;
	        }
	        return nums[1];
	 }
	public static void main(String[] args) {
		secondMax(new int[]{1,-1,-2});
	}
}
