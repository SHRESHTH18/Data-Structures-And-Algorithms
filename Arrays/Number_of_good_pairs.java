package class5Arrays.Assignment1.day1;

//https://leetcode.com/problems/number-of-good-pairs/description/
import java.util.Arrays;
import java.util.Scanner;
public class Number_of_good_pairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n ");
        int n=input.nextInt();
        System.out.println("enter nums");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){

            nums[i]=input.nextInt();
        }

        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int pairs=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
