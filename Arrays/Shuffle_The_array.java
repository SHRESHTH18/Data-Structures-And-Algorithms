package class5Arrays.Assignment1.day1;
//https://leetcode.com/problems/shuffle-the-array/description/
import java.util.Arrays;
import java.util.Scanner;
public class Shuffle_The_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter n");
        int n=input.nextInt();
        int [] nums=new int[2*n];
        System.out.println("enter nums");
        for(int i=0;i<2*n;i++){
            nums[i]=input.nextInt();
        }
        int [] arr=new int[2*n];
        arr=shuffle(nums,n);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] shuffle(int[] nums, int n) {
        int [] arr=new int[2*n];
        int a=0;
        int b=n;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                arr[i]=nums[a];
                a++;
            }
            else{
                arr[i]=nums[b];
                b++;
            }

        }
        return arr;
    }
}
