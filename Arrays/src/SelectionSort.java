/*
Selection Sort
In this sorting algorithm we have to select n element and put it in its position.
To do this we select the greatest number or smallest number and put it in last or first position respectively.
O(N^2)

 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 6, 3, 2, 8, 9, 4};
        selectionsorting(nums);
        System.out.print(Arrays.toString(nums));
    }
    static void selectionsorting(int []nums){
        for(int i=0; i<nums.length;i++){
            int last= nums.length-i-1;
            int maxi= getmaxindex(nums,0 ,last);
            swap(nums, maxi,last);
        }
    }
    static int getmaxindex(int[]nums,int s, int e){
        int maxi=s;
        for(int i =s;i<=e;i++){
            if(nums[i]>nums[maxi]){
                maxi=i;
            }
        }return maxi;
    }
    static void swap(int []nums, int f, int s){
        int temp = nums[f];
        nums[f]= nums[s];
        nums[s]=temp;
    }
}
