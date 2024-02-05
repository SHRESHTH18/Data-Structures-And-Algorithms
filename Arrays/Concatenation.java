package class5Arrays.Assignment1;
import java.util.Scanner;
import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int nums[]=new int[4];
        //inputting array from user
        for(int i=0;i< nums.length;i++){
            nums[i]=in.nextInt();
        }

        int ans[]=new int[2*nums.length];//creating an array with length 2 times that of original array
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];//0-nums.length
            ans[nums.length+i]=nums[i];//nums.length-2*nums.length
        }
        System.out.println(Arrays.toString(ans));
    }
}
