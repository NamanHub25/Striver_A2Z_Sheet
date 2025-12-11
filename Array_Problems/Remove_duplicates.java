// Brute force


import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Remove_duplicates {

    public static int removeduplicates(int[] nums, int n){
        HashSet<Integer> set = new HashSet<>();

        int index = 0;

        for(int num: nums){
            if(!set.contains(num)){
                set.add(num);

                nums[index] = num;

                index ++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");

        int n = input.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }

        int result = removeduplicates(nums, n);
        System.out.println("Number of unique elements in the array: " + Arrays.toString(nums) + " are: " + result);
        input.close();
    }
}