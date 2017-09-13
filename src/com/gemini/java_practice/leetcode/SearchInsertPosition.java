package com.gemini.java_practice.leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums = {1,3,5,6};
        int target = -3;
        int result = searchIndex(nums, target);
        System.out.println("index is  : " +result);
      
    }

    public static int searchIndex(int[] nums, int target ){
        
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        int low = 0 ;
        int high = nums.length-1; 
        
        if(target > nums[high]){
            return high+1;
        }
        if (target > 0 && target <= nums[0]){
            return 0;
        }
        while (low <= high){
            int mid = (low + high) / 2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){ 
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
