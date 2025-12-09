package Array_Problems;


import java.util.Scanner;
import java.util.Arrays;

public class Largest_element {

    public static int largestelement(int[] nums, int n){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
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
        int result = largestelement(nums, n);
        System.out.println("Largest element in the array: " + Arrays.toString(nums) + " = " + result);
        input.close();
    }
}

