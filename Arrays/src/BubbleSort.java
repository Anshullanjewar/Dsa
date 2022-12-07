/*
Bubble sort
It is very simple sorting algorithm in which adjacent elements are swapped if they are in wrong order.
O(N^2)
* */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5, 6, 3, 2, 8, 9, 4};
        bubblesorting(nums);
        System.out.print(Arrays.toString(nums));
    }

    static void bubblesorting(int []nums){
        for(int i =0; i<nums.length; i++){
            for(int j=1;j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
            }
        }
    }
    static  void swap(int []nums,int f,  int s){
        int temp= nums[f];
        nums[f]= nums[s];
        nums[s]= temp;
    }
}
