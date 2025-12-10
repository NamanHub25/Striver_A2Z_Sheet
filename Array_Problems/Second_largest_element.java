package Array_Problems;

import java.util.Scanner;
import java.util.Arrays;

public class Second_largest_element {

    public static void secondlargest(int[] nums, int n){

        Arrays.sort(nums);
        System.out.println("Second largest element in the array: " + Arrays.toString(nums) + " is: " + nums[n-2]);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

       int[] nums = new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i = 0; i < nums.length; i++){
        nums[i] = input.nextInt();
       }

       secondlargest(nums, n);
       input.close();
    }
}



