import java.util.Arrays;
import java.util.Scanner;

public class Build_array_from_permutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //inputting the array nums
        int nums[]=new int[6];
        for(int i=0;i< nums.length;i++){
            nums[i]=in.nextInt();
        }
        
        int ans[]=new int[6];//initialising output array
        for(int j=0;j<nums.length;j++){
            ans[j]=nums[nums[j]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
