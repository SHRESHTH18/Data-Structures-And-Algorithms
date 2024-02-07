package class5Arrays.Assignment1;

import java.util.Arrays;
import java.util.Scanner;
public class Running_sum_of_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of elements in array");
        int n=in.nextInt();
        int nums[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i< nums.length;i++){
            nums[i]=in.nextInt();
        }
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
