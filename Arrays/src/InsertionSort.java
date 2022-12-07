/*
Insertion Sort
In this sorting algorithm we partially sort array that is inserting an element from
sorted subarray to sorted subarray and sort it;
O(N^2)

 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 6, 3, 2, 8, 9, 4};
        insertionsorting(nums);
        System.out.print(Arrays.toString(nums));
    }
    static void insertionsorting(int[]nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
            }
        }
    }
    static void swap(int[]nums, int f,int s){
        int temp = nums[f];
        nums[f]= nums[s];
        nums[s]= temp;
    }
}
